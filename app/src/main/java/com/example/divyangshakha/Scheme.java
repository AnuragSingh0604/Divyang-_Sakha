package com.example.divyangshakha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Scheme extends AppCompatActivity {
    Window window;
    Button adips, sidpa, ddrs, providingEmployment,
            freeCoaching, nap, adAndP,homeIconOfScheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scheme);
        window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimaryVariant));
        adips=findViewById(R.id.adips);
        sidpa=findViewById(R.id.sidpa);
        ddrs=findViewById(R.id.ddrs);
        providingEmployment=findViewById(R.id.providingEmployment);
        freeCoaching=findViewById(R.id.freeCoaching);
        nap=findViewById(R.id.nap);
        adAndP=findViewById(R.id.adAndP);
        //on click home button
        homeIconOfScheme = findViewById(R.id. homeIconOfScheme);
        homeIconOfScheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainMenus =new Intent(Scheme.this,MainActivity.class);
                startActivity(mainMenus);
            }
        });











    }
    public  void check(View view)
    {
        Button b=(Button)view;
        if(b==adips)
        {
            Intent mainMenu = new Intent(Scheme.this, adip.class);
            mainMenu.putExtra("id",R.id.adips);

            startActivity(mainMenu);
        }
        else if(b==sidpa)
        {
            Intent mainMenu = new Intent(Scheme.this, adip.class);
            mainMenu.putExtra("id",R.id.sidpa);
            startActivity(mainMenu);
        }
        else if(b==ddrs)
        {
            Intent mainMenu = new Intent(Scheme.this, adip.class);
            mainMenu.putExtra("id",R.id.ddrs);
            startActivity(mainMenu);
        }
        else if(b==freeCoaching)
        {
            Intent mainMenu = new Intent(Scheme.this, adip.class);
            mainMenu.putExtra("id",R.id.freeCoaching);
            startActivity(mainMenu);
        }
        else if(b== providingEmployment)
        {
            Intent mainMenu = new Intent(Scheme.this, adip.class);
            mainMenu.putExtra("id",R.id. providingEmployment);
            startActivity(mainMenu);
        }
        else if(b==nap)
        {
            Intent mainMenu = new Intent(Scheme.this, adip.class);
            mainMenu.putExtra("id",R.id.nap);
            startActivity(mainMenu);
        }
        else if(b==adAndP)
        {
            Intent mainMenu = new Intent(Scheme.this, adip.class);
            mainMenu.putExtra("id",R.id.adAndP);
            startActivity(mainMenu);
        }

    }




}
