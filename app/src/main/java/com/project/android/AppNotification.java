package com.project.android;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class AppNotification extends Application {
public static final String CHANNEL_1="channel1";
public static final String CHANNEL_2="channel2";
    @Override
    public void onCreate() {
        super.onCreate();
        createNotificationChannels();
    }

    private void createNotificationChannels() {

        if (Build.VERSION.SDK_INT >=Build.VERSION_CODES.O){
              NotificationChannel channel1=new NotificationChannel  (
                CHANNEL_1,"channel 1", NotificationManager.IMPORTANCE_HIGH
        );
              channel1.setDescription("This is Channel1");

            NotificationChannel channel2=new NotificationChannel  (
                    CHANNEL_2,"channel 2", NotificationManager.IMPORTANCE_LOW
            );
            channel2.setDescription("This is Channel2");
            NotificationManager manager=getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel1);
            manager.createNotificationChannel(channel2);
    }
}
}
