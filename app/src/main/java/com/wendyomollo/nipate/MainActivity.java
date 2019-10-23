package com.wendyomollo.nipate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends Activity implements View.OnClickListener {
    @BindView(R.id.buttonView) Button mGoToLogin;
    @BindView(R.id.userName) EditText mEditName;
    @BindView(R.id.userEmail) EditText mEditEmail;
    @BindView(R.id.userPassword) EditText mEditPassword;
    @BindView(R.id.loginLink) TextView login;

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private ProgressDialog mProgress;
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mProgress = new ProgressDialog(this);
        mAuth = FirebaseAuth.getInstance();

        ButterKnife.bind(this);
        mGoToLogin.setOnClickListener(this);

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
    }

    private void startRegister() {
       final String name = mEditName.getText().toString().trim();
       final String email = mEditEmail.getText().toString().trim();
        String password = mEditPassword.getText().toString().trim();

        boolean validEmail = isValidEmail(email);
        boolean validName = isValidName(name);
        boolean validPassword = isValidPassword(password);
        if (!validEmail || !validName || !validPassword) return;

        if(!TextUtils.isEmpty(name) && !TextUtils.isEmpty(email) && !TextUtils.isEmpty(password)){
            mProgress.setMessage("Signing Up");
            mProgress.show();

            mAuth.createUserWithEmailAndPassword(email,password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {

                    if(task.isSuccessful()){

//                        String user_id = mAuth.getCurrentUser().getUid();
//                        DatabaseReference current_user_db = mDatabase.child(user_id);
//
//                        current_user_db.child("name").setValue(name);
//                        current_user_db.child("email").setValue(email);
//
                        mProgress.dismiss();
                        Toast.makeText(MainActivity.this,"Authentication successful",Toast.LENGTH_LONG).show();
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


