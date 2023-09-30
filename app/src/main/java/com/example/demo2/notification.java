package com.example.demo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class notification extends AppCompatActivity {
    private static final int NOTIFICATION_ID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        Button showNotificationButton = findViewById(R.id.showNotificationButton);

        showNotificationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNotification();
            }
        });
    }

    public void showNotification() {
        // Xây dựng thông báo
        NotificationCompat.Builder builder = new NotificationCompat.Builder(notification.this, "default")
//                .setSmallIcon(R.drawable.ic_launcher_foreground)
                .setContentTitle("Thông báo đơn giản")
                .setContentText("Đây là một thông báo đơn giản trong Android.")
                .setAutoCancel(true);

        // Hiển thị thông báo
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(NOTIFICATION_ID, builder.build());
    }
}

