package com.example.demo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class layout6 extends AppCompatActivity {
    TextView tvketqua;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout6);

        btnBack = (Button) findViewById(R.id.btBack);
        tvketqua = (TextView) findViewById(R.id.tvKQ);
        //lấy intent gọi Activity này
        Intent callerIntent = getIntent();
        //có intent rồi thì lấy Bundle dựa vào MyPackage
        Bundle packageFromCaller =
                callerIntent.getBundleExtra("MyPackage");
        //Có Bundle rồi thì lấy các thông số dựa vào soa, sob
        int a = packageFromCaller.getInt("soa");
        int b = packageFromCaller.getInt("sob");
        int kq = a + b;
        tvketqua.setText(kq + "");
        //
        btnBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        })
        ;
    }
}