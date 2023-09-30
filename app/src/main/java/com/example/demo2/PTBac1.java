package com.example.demo2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PTBac1 extends AppCompatActivity {
    private EditText editTextA;
    private EditText editTextB;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptbac1);
        //
        editTextA = new EditText(this);
        editTextB = new EditText(this);
        resultTextView = findViewById(R.id.resultTextView);

        Button buttonA = findViewById(R.id.buttonA);
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInputDialog("Nhập giá trị a", editTextA);
            }
        });

        Button buttonB = findViewById(R.id.buttonB);
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInputDialog("Nhập giá trị b", editTextB);
            }
        });

        Button buttonSolve = findViewById(R.id.buttonSolve);
        buttonSolve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solveEquation();
            }
        });
    }

    private void showInputDialog(String title, final EditText editText) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setView(editText);

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builder.setNegativeButton("Hủy", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builder.show();
    }

    private void solveEquation() {
        try {
            float a = Float.parseFloat(editTextA.getText().toString());
            float b = Float.parseFloat(editTextB.getText().toString());

            if (a == 0) {
                resultTextView.setText("Phương trình không có nghiệm.");
            } else {
                float x = -b / a;
                resultTextView.setText("Nghiệm của phương trình: x = " + x);
            }
        } catch (NumberFormatException e) {
            resultTextView.setText("Nhập giá trị a và b trước khi giải phương trình.");
        }
    }

}


