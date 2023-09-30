package com.example.demo2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);
    }
    public void chuyenlayoutmain(View view){
        Intent intent = new Intent(Activity1.this, MainActivity.class);
        startActivity(intent);
    }
}
