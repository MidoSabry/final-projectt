package com.example.tripreminderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {
  ImageView mapImg;
  //TextView header;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        mapImg = findViewById(R.id.imageView);
       // header = findViewById(R.id.tripApp);
        Thread myThread = new Thread()
        {

            @Override
            public void run() {
                try {
                    mapImg.animate().translationY(-1000).setDuration(1000).setStartDelay(100);
                  //  header.animate().translationX(-1000).setDuration(1000).setStartDelay(100);
                    sleep(1200);
                  //  startActivity(new Intent(SplashScreen.this, viewPager.class));
                    Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();
    }
}