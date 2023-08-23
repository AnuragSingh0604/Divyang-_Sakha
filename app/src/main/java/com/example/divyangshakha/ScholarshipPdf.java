package com.example.divyangshakha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class ScholarshipPdf extends AppCompatActivity {
    Window window;
    PDFView pdfViews;
    Button adipApply,homeIconOfHindiScheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scholarship_pdf);
        window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimaryVariant));
        Intent actFrom = getIntent();
        int id = actFrom.getIntExtra("id", 0);
        pdfViews = findViewById(R.id.pdfViews);
        pdfOpener(id);
        //on click home button
        homeIconOfHindiScheme= findViewById(R.id. homeIconOfHindiScheme);
        homeIconOfHindiScheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainMenus =new Intent(ScholarshipPdf.this,MainActivity.class);
                startActivity(mainMenus);
            }
        });
        //apply button click
        adipApply = findViewById(R.id.adipApply);
        adipApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkConnection()) {
                    Toast.makeText(ScholarshipPdf.this, "No internet connection", Toast.LENGTH_SHORT).show();

                } else if (id == R.id.nationalFellowship) {
                    golink("https://nfpwd.ugc.ac.in/");
                }
                else if (id==R.id.matricScholarship)
                {
                    golink("https://scholarships.gov.in/");
                }
                else if (id==R.id.overseasScholarship)
                {
                    golink("https://scholarships.gov.in/");
                }
                else if (id==R.id.topEducation)
                {
                    golink("https://scholarships.gov.in/");
                }
            }
        });
    }
    public void pdfOpener(int id) {
        if (id == R.id.nationalFellowship) {

            pdfViews.fromAsset("fellowship.pdf").load();
        }
        else if (id == R.id.matricScholarship) {

            pdfViews.fromAsset("prematric.pdf").load();
        }
        else if (id == R.id.overseasScholarship) {

            pdfViews.fromAsset("overseas.pdf").load();
        }
        else if (id == R.id.topEducation) {

            pdfViews.fromAsset("top.pdf").load();
        }
    }
    private void golink(String s)
    {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
    private boolean checkConnection()
    {
        ConnectivityManager manager=(ConnectivityManager) getApplicationContext().
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork=manager.getActiveNetworkInfo();
        if(null == activeNetwork)
        {
            return true;
        }
        return false;
    }
}