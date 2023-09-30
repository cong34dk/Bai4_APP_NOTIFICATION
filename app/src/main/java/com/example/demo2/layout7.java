package com.example.demo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class layout7 extends AppCompatActivity {
    private EditText edtNumber1;
    private EditText edtNumber2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout7);

        edtNumber1 = findViewById(R.id.edtNumber1);
        edtNumber2 = findViewById(R.id.edtNumber2);
        Button btnCalculate = findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy giá trị từ EditText
                int number1 = Integer.parseInt(edtNumber1.getText().toString());
                int number2 = Integer.parseInt(edtNumber2.getText().toString());

                // Tính tổng
                int sum = number1 + number2;

                // Chuyển đến Activity hiển thị kết quả
                Intent intent = new Intent(layout7.this, layout8.class);
                intent.putExtra("result", sum);
                startActivity(intent);
            }
        });
    }
}