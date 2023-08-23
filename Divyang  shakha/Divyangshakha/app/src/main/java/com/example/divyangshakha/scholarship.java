package com.example.divyangshakha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class scholarship extends AppCompatActivity {
    Window window;
    Button nationalFellowship,matricScholarship,overseasScholarship,
            topEducation,homeIconOfInformation;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scholarship);
        window=this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimaryVariant));
        nationalFellowship=findViewById(R.id.nationalFellowship);
        matricScholarship=findViewById(R.id.matricScholarship);
        overseasScholarship=findViewById(R.id.overseasScholarship);
        topEducation=findViewById(R.id.topEducation);



        //click on home icon
        homeIconOfInformation=findViewById(R.id.homeIconOfInformation);
        homeIconOfInformation .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainMenus =new Intent(scholarship.this,MainActivity.class);
                startActivity(mainMenus);
            }
        });

    }
    public void check(View view)
    {
        Button b=(Button)view;
        if(b==nationalFellowship)
        {
            Toast.makeText(scholarship.this, "file is opening", Toast.LENGTH_SHORT).show();
            Intent mainMenu = new Intent(scholarship.this, ScholarshipPdf.class);
            mainMenu.putExtra("id",R.id.nationalFellowship);

            startActivity(mainMenu);
        }
        else if(b==matricScholarship)
        {
            Intent mainMenu = new Intent(scholarship.this, ScholarshipPdf.class);
            Toast.makeText(scholarship.this, "file is opening", Toast.LENGTH_SHORT).show();
            mainMenu.putExtra("id",R.id.matricScholarship);
            startActivity(mainMenu);
        }
        else if(b== overseasScholarship)
        {
            Toast.makeText(scholarship.this, "file is opening", Toast.LENGTH_SHORT).show();
            Intent mainMenu = new Intent(scholarship.this, ScholarshipPdf.class);
            mainMenu.putExtra("id",R.id.overseasScholarship);
            startActivity(mainMenu);
        }
        else if(b==topEducation)
        {
            Toast.makeText(scholarship.this, "file is opening", Toast.LENGTH_SHORT).show();
            Intent mainMenu = new Intent(scholarship.this, ScholarshipPdf.class);
            mainMenu.putExtra("id",R.id.topEducation);
            startActivity(mainMenu);
        }
    }
}