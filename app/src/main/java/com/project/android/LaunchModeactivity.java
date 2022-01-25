package com.project.android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class LaunchModeactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_modeactivity);

    }

    public void launch(View view) {
        Intent i=new Intent(LaunchModeactivity.this,LaunchModeactivity.class);
        startActivity(i);

    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        System.out.println("Hi Iam SingleTop");
    }
}