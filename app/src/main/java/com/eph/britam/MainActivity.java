package com.eph.britam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("");

        // Optional: Add a delay before transitioning to the next activity
        int SPLASH_DELAY = 5000; // 2 seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start your next activity here
                Intent intent = new Intent(MainActivity.this, signup.class);
                startActivity(intent);
                finish(); // Optional: Close the current activity
            }
        }, SPLASH_DELAY);
    }
}