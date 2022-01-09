package com.project.android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class FlipkartActivity extends AppCompatActivity {

    NotificationManagerCompat notificationManagerCompat;
    Notification notification;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flipkart);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("mych",
                    "My Channel", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this,"myCh")
                .setSmallIcon(R.drawable.ic_one)
                .setContentTitle("First Notification")
                .setContentText("This is the Body of Message");
        notification = builder.build();
        notificationManagerCompat = NotificationManagerCompat.from(this);
    }

    public void push(View view) {

        notificationManagerCompat.notify(1,notification);
    }
}
