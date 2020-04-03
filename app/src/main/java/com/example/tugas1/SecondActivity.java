package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class SecondActivity extends AppCompatActivity {

    Button profil = null;
    Button kegiatan = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        profil = (Button)findViewById(R.id.btnProfil);
        kegiatan = (Button)findViewById(R.id.btnKegiatan);
    }
    public void profil (View view){
        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
        startActivity(intent);
    }

    public void kegiatan (View view){
        Intent intent = new Intent(SecondActivity.this, FourthActivity.class);
        startActivity(intent);
    }

    public void logout (View view){
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
