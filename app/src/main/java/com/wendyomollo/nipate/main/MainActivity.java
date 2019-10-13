package com.wendyomollo.nipate.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.wendyomollo.nipate.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.buttonView) Button mFindArtists;
    @BindView(R.id.editText) EditText mEditText;
    @BindView(R.id.spinner) Spinner spin;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mFindArtists.setOnClickListener(this);
        spin = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.type,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);

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
