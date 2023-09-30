package com.example.demo2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class show extends AppCompatActivity {
    Button btnClick;
    int a, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        btnClick = findViewById(R.id.btnClick);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Tạo một AlertDialog.Builder
                AlertDialog.Builder builder = new AlertDialog.Builder(show.this);

// Thiết lập tiêu đề và nội dung của AlertDialog
                builder.setTitle("Cảnh báo");
                builder.setMessage("Bạn có chắc chắn muốn xóa dữ liệu này?");

// Thiết lập nút xác nhận và xử lý sự kiện khi nút này được nhấn
                builder.setPositiveButton("Xóa", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Xử lý xóa dữ liệu ở đây
                    }
                });

// Thiết lập nút hủy bỏ và xử lý sự kiện khi nút này được nhấn
                builder.setNegativeButton("Hủy bỏ", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Đóng hộp thoại và không thực hiện thay đổi nào
                        dialog.dismiss();
                    }
                });

// Tạo AlertDialog từ AlertDialog.Builder và hiển thị nó
                AlertDialog alertDialog = builder.create();
                alertDialog.show();


            }
        });
    }
}