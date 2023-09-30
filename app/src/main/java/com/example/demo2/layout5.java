package com.example.demo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class layout5 extends AppCompatActivity {
    EditText txta, txtb;
    Button btnOK;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout5);

        txta = (EditText) findViewById(R.id.txta);
        txtb = (EditText) findViewById(R.id.txtb);
        btnOK = (Button) findViewById(R.id.btOK);
        //
        btnOK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                //Tạo Intent để mở ResultActivity
                Intent myIntent = new Intent(layout5.this, layout6.class);
                //Khai báo Bundle
                Bundle bundle = new Bundle();
                int a = Integer.parseInt(txta.getText().toString());
                int b = Integer.parseInt(txtb.getText().toString());
                //đưa dữ liệu riêng lẻ vào Bundle
                bundle.putInt("soa", a);
                bundle.putInt("sob", b);
                //Đưa Bundle vào Intent
                myIntent.putExtra("MyPackage", bundle);
                //Mở Activity ResultActivity
                startActivity(myIntent);
            }
        });
    }
}
