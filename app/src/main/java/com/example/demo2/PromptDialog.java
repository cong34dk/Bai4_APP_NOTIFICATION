package com.example.demo2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PromptDialog extends AppCompatActivity {
    Button btnClickMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prompt_dialog);

        btnClickMe = findViewById(R.id.btnClickMe);

        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Tạo một AlertDialog.Builder
                AlertDialog.Builder builder = new AlertDialog.Builder(PromptDialog.this);

// Thiết lập tiêu đề của hộp thoại
                builder.setTitle("Nhập tên người dùng");

// Tạo một trường nhập liệu trong hộp thoại
                final EditText input = new EditText(PromptDialog.this);
                builder.setView(input);

// Thiết lập nút xác nhận và xử lý sự kiện khi nút này được nhấn
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String username = input.getText().toString();
                        // Xử lý dữ liệu nhập từ người dùng ở đây
                        Toast.makeText(PromptDialog.this, "Tên của bạn là: " + username, Toast.LENGTH_SHORT).show();
                    }
                });

// Thiết lập nút hủy bỏ và xử lý sự kiện khi nút này được nhấn
                builder.setNegativeButton("Hủy bỏ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Đóng hộp thoại và không thực hiện thay đổi nào
                        dialog.cancel();
                    }
                });

// Tạo AlertDialog từ AlertDialog.Builder và hiển thị nó
                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }
        });
    }
}