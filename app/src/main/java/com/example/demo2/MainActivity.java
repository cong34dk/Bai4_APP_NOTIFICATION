package com.example.demo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Khai báo các biến
    Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Ánh xạ, liên kết biến với các đối tượng trên giao diện
        button2 = (Button) findViewById((R.id.button2));

        //Viết code bắt sự kiện
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);
            }
        });
    }


    public void chuyenlayout1(View view) {
        Intent intent = new Intent(MainActivity.this, Activity1.class);
        startActivity(intent);
    }
}