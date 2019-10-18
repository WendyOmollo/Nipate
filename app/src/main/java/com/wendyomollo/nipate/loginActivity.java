package com.wendyomollo.nipate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class loginActivity extends Activity implements View.OnClickListener {
    @BindView(R.id.signupLink)
    TextView signup;
    @BindView(R.id.loginButtonView)
    Button mlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Intent intent = getIntent();
        ButterKnife.bind(this);
        mlogin.setOnClickListener(this);


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(loginActivity.this,ArtistsActivity.class);
        startActivity(intent);
    }
}