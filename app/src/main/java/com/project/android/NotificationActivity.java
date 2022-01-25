package com.project.android;

import static com.project.android.AppNotification.CHANNEL_1;
import static com.project.android.AppNotification.CHANNEL_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NotificationActivity extends AppCompatActivity {
    private NotificationManagerCompat notificationManager;
    private EditText editTitle,editMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        notificationManager=NotificationManagerCompat.from(this);
        editTitle=findViewById(R.id.title);
        editMessage=findViewById(R.id.message);
    }

    public void channel1(View view) {
        String title=editTitle.getText().toString();
        String message=editMessage.getText().toString();
        Notification notification=new NotificationCompat.Builder(this,CHANNEL_1)
                .setSmallIcon(R.drawable.ic_one)
                .setContentTitle(title)
                .setContentText(message)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();
        notificationManager.notify(1,notification);
    }

    public void channel2(View view) {
        String title=editTitle.getText().toString();
        String message=editMessage.getText().toString();
        Notification notification=new NotificationCompat.Builder(this,CHANNEL_2)
                .setSmallIcon(R.drawable.ic_two)
                .setContentTitle(title)
                .setContentText(message)
                .setPriority(NotificationCompat.PRIORITY_LOW)
                .build();
        notificationManager.notify(2,notification);
    }
}