package com.wendyomollo.nipate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;



import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.buttonView) Button mGoToLogin;
    @BindView(R.id.userName) EditText mEditName;
    @BindView(R.id.userEmail) EditText mEditEmail;
    @BindView(R.id.userPassword) EditText mEditPassword;
    @BindView(R.id.loginLink) TextView login;

    public FirebaseDatabase mRef;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private ProgressDialog mProgress;
    private String memberName;
    DatabaseReference databaseReference;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mProgress = new ProgressDialog(this);
        mAuth = FirebaseAuth.getInstance();

        ButterKnife.bind(this);
        mGoToLogin.setOnClickListener(this);

        databaseReference = FirebaseDatabase.getInstance().getReference().child("artists");

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, loginActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View view) {
        startRegister();
        addArtist();
//        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
//        String uid = user.getUid();
//        DatabaseReference mDatabase = FirebaseDatabase
//                .getInstance()
//                .getReference()
//                .child(uid);
//
//        DatabaseReference pushRef = mDatabase.push();
//        String pushId = pushRef.getKey();
//        mDatabase.child(pushId).setValue(user);

    }

    private void addArtist() {
        String name = mEditName.getText().toString().trim();
        String email = mEditEmail.getText().toString().trim();
        String password = mEditPassword.getText().toString().trim();

        if(!TextUtils.isEmpty(name) && !TextUtils.isEmpty(email) && !TextUtils.isEmpty(password)){
            String id = databaseReference.push().getKey();

            Artist  artist = new Artist(id,name,email,password);
            databaseReference.child(id).setValue("students");
            mEditName.setText("");
            mEditEmail.setText("");
            mEditPassword.setText("");

        }else{
            Toast.makeText(MainActivity.this,"Authentication failed",Toast.LENGTH_SHORT).show();
        }


    }

    private void startRegister() {
       final String name = mEditName.getText().toString().trim();
       final String email = mEditEmail.getText().toString().trim();
        String password = mEditPassword.getText().toString().trim();
        memberName = mEditName.getText().toString().trim();

        boolean validEmail = isValidEmail(email);
        boolean validName = isValidName(name);
        boolean validPassword = isValidPassword(password);
        boolean validMemberName = isValidName(memberName);

        if (!validEmail || !validName || !validPassword) return;

        if(!TextUtils.isEmpty(name) && !TextUtils.isEmpty(email) && !TextUtils.isEmpty(password)){
            mProgress.setMessage("Signing Up");
            mProgress.show();

            mAuth.createUserWithEmailAndPassword(email,password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {

                    if(task.isSuccessful()){
                        mProgress.dismiss();
                        Toast.makeText(MainActivity.this,"Authentication successful",Toast.LENGTH_LONG).show();
                        createFirebaseUserProfile(task.getResult().getUser());
                        Intent intent = new Intent(MainActivity.this, loginActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                        finish();

                    }else{
                        Toast.makeText(MainActivity.this,"Authentication failed",Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void createFirebaseUserProfile(final FirebaseUser user) {
        UserProfileChangeRequest addProfileName = new UserProfileChangeRequest.Builder()
                .setDisplayName(memberName)
                .build();

        user.updateProfile(addProfileName)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                            Log.d("Welcome",user.getDisplayName());
                        }
                    }
                });

    }

    private boolean isValidEmail(String email) {
        boolean isGoodEmail =
                (email != null && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches());
        if (!isGoodEmail) {
            mEditEmail.setError("Please enter a valid email address");
            return false;
        }
        return isGoodEmail;
    }

    private boolean isValidName(String name) {
        if (name.equals("")) {
            mEditName.setError("Please enter your name");
            return false;
        }
        return true;
    }
    private boolean isValidPassword(String password) {
        if (password.length() < 6) {
            mEditPassword.setError("Please create a password containing at least 6 characters");
            return false;
        }
        return true;
    }


}

