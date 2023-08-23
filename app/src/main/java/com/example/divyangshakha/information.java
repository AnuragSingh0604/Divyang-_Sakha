package com.example.divyangshakha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;


public class information extends AppCompatActivity {
    Window window;
    Button scheme,homeIconOfInformation,
            scholarships,disabiltyMarket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        window=this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimaryVariant));
        //on click home
        homeIconOfInformation=findViewById(R.id.homeIconOfInformation);
        homeIconOfInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent information =new Intent(information.this,MainActivity.class);
                startActivity(information);
            }
        });
        //on click scheme
        scheme=findViewById(R.id.scheme);
        scheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent information=new Intent(information.this,Scheme.class);
                startActivity(information);
            }
        });
        //on click scholarships
        scholarships=findViewById(R.id.scholarships);
        scholarships.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent information=new Intent(information.this,scholarship.class);
                startActivity(information);
            }
        });
        //on click disability market
        disabiltyMarket=findViewById(R.id.disabiltyMarket);
        disabiltyMarket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent information=new Intent(information.this,market.class);
                startActivity(information);
            }
        });



    }
}