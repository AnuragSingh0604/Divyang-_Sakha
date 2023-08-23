package com.example.divyangshakha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class splash_screen extends AppCompatActivity {
    Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        window=this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.splashColur));
        window.setNavigationBarColor(ContextCompat.getColor(this,R.color.customSplash));
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent ihome=new Intent(splash_screen.this,MainActivity.class);
                startActivity(ihome);
                finish();

            }
        },3000);
    }
}