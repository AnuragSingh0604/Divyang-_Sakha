package com.example.divyangshakha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class market extends AppCompatActivity {
    Window window;
    Button homeIconOfScheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);
        window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimaryVariant));
        //on click home button
        homeIconOfScheme = findViewById(R.id. homeIconOfScheme);
        homeIconOfScheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainMenus =new Intent(market.this,MainActivity.class);
                startActivity(mainMenus);
            }
        });
    }
}