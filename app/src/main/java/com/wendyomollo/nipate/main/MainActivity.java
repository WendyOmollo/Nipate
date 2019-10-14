package com.wendyomollo.nipate.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
<<<<<<< HEAD:app/src/main/java/com/wendyomollo/nipate/MainActivity.java
=======
import android.widget.AdapterView;
>>>>>>> 2502c28175a561c2d891a5d3856040c9ff3a082f:app/src/main/java/com/wendyomollo/nipate/main/MainActivity.java
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
<<<<<<< HEAD:app/src/main/java/com/wendyomollo/nipate/MainActivity.java
import android.widget.TextView;
=======
>>>>>>> 2502c28175a561c2d891a5d3856040c9ff3a082f:app/src/main/java/com/wendyomollo/nipate/main/MainActivity.java
import android.widget.Toast;

import com.wendyomollo.nipate.R;

import butterknife.BindView;
import butterknife.ButterKnife;

<<<<<<< HEAD:app/src/main/java/com/wendyomollo/nipate/MainActivity.java
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.buttonView)
    Button mFindArtists;
    @BindView(R.id.editText)
    EditText mEditText;
    @BindView(R.id.editText1)
    EditText getmEditText;
    @BindView(R.id.loginLink) TextView login;

=======
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.buttonView) Button mFindArtists;
    @BindView(R.id.editText) EditText mEditText;
    @BindView(R.id.spinner) Spinner spin;
>>>>>>> 2502c28175a561c2d891a5d3856040c9ff3a082f:app/src/main/java/com/wendyomollo/nipate/main/MainActivity.java

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mFindArtists.setOnClickListener(this);
<<<<<<< HEAD:app/src/main/java/com/wendyomollo/nipate/MainActivity.java
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LoginActivity.class);
            }
        });
=======
        spin = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.type,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);

>>>>>>> 2502c28175a561c2d891a5d3856040c9ff3a082f:app/src/main/java/com/wendyomollo/nipate/main/MainActivity.java
    }
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

}