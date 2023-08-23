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

public class hindiScheme extends AppCompatActivity {
    Window window;
    PDFView pdfViews;
    Button adipApply,homeIconOfHindiScheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi_scheme);
        window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimaryVariant));
        Intent actFrom = getIntent();
        int id = actFrom.getIntExtra("id", 0);
        pdfViews = findViewById(R.id.pdfViews);
        pdfOpener(id);
        //apply button click
        adipApply = findViewById(R.id.adipApply);
        adipApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkConnection()) {
                    Toast.makeText(hindiScheme.this, "No internet connection", Toast.LENGTH_SHORT).show();

                } else if (id == R.id.adips) {
                    golink("http://adipcochlearimplant.in/Application-Instruction.aspx");
                }
                else if (id==R.id.ddrs)
                {
                    golink("https://disabilityaffairs.gov.in/content/page/ddrs.php");
                }
            }
        });
        //on click home button
        homeIconOfHindiScheme= findViewById(R.id. homeIconOfHindiScheme);
        homeIconOfHindiScheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainMenus =new Intent(hindiScheme.this,MainActivity.class);
                startActivity(mainMenus);
            }
        });
    }

    public void pdfOpener(int id) {
        if (id == R.id.adips) {

            pdfViews.fromAsset("adiphindi.pdf").load();
        }
         else if (id == R.id.ddrs) {

            pdfViews.fromAsset("hindiddrs.pdf").load();
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
