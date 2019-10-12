package com.wendyomollo.nipate.main.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.wendyomollo.nipate.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.buttonView) Button mFindArtists;
    @BindView(R.id.editText) EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mFindArtists.setOnClickListener(this);

    }
    @Override
        public void onClick(View view){
        Intent intent = new Intent(this,ArtistsActivity.class);
        String location = mEditText.getText().toString();
        intent.putExtra("location",location);
        Toast.makeText(MainActivity.this,location,Toast.LENGTH_LONG).show();
        startActivity(intent);
    }
}
