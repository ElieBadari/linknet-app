package com.example.linknet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {


    Intent intent;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler = new Handler();
        intent = new Intent(this, LoginPage.class);

        handler.postDelayed( new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
                finish();

            }
        }, 3000);



    }
}