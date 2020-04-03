package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
    }

    public void menuFourth(View view){
        Intent intent = new Intent(FourthActivity.this, SecondActivity.class);
        startActivity(intent);
        finish();
    }
}
