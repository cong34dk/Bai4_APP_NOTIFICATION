package com.example.demo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class layout8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout8);

        TextView tvResult = findViewById(R.id.tvResult);
        Button btnBack = findViewById(R.id.btnBack);

        // Lấy kết quả từ Intent
        int result = getIntent().getIntExtra("result", 0);

        // Hiển thị kết quả
        tvResult.setText("Kết quả: " + result);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Quay lại Activity trước đó
                finish();
            }
        });


    }
}