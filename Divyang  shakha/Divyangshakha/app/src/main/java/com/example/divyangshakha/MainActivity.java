package com.example.divyangshakha;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    Toast toast;
    Button overview,information,disabilitiescovered,actsandrules;

    Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            window=this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.notification));




        toolbar = findViewById(R.id.toolbar);
        Drawable draw=toolbar.getOverflowIcon();
        if(draw != null)
        {
            draw= DrawableCompat.wrap(draw);
            DrawableCompat.setTint(draw.mutate(),getResources().getColor(R.color.colorPrimary));
            toolbar.setOverflowIcon(draw);
        }
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.toolbar)));


        }
        //click on overview_of_department
        disabilitiescovered=findViewById(R.id.disabilitiescovered);
        disabilitiescovered.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent overview_of_department =new Intent(MainActivity.this,typesOfDisability.class);
                startActivity( overview_of_department);
            }
        });
        //on click disabilities covered
        overview=findViewById(R.id.overview);
        overview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent overview_of_department =new Intent(MainActivity.this,OverviewOfDepartmentActivity.class);
                startActivity( overview_of_department);
            }
        });

        //on click information
        information=findViewById(R.id.information);
        information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myInformation =new Intent(MainActivity.this,information.class);
                startActivity( myInformation);
            }
        });
        //on click acts and rules
        actsandrules=findViewById(R.id.actsandrules);
        actsandrules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myInformation =new Intent(MainActivity.this,actsandrules.class);
                startActivity( myInformation);
            }
        });



    }

    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.mymenu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.aboutus) {
            Intent aboutus =new Intent(MainActivity.this,about_us.class);
            startActivity(aboutus);


        }
        if (itemId == R.id.contactus) {
            toast = Toast.makeText(this, "file opened", Toast.LENGTH_SHORT);
            toast.show();
        }
        return super.onOptionsItemSelected(item);
    }
}
