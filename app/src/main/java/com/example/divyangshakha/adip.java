package com.example.divyangshakha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

import java.util.Locale;

public class adip extends AppCompatActivity {
    Window window;
    PDFView pdfView;
    Toast toast;

    Button adipApply,hindi,homeIconOfAdip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adip);
        window=this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimaryVariant));
        Intent actFrom=getIntent();
        int id=actFrom.getIntExtra("id",0);
        pdfView=findViewById(R.id.pdfView);
        pdfOpener(id);
        //on click hindi button
        hindi=findViewById(R.id.hindi);
        hindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(id==R.id.adips)
                {
                    Toast.makeText(adip.this,"file is opening",Toast.LENGTH_SHORT).show();
                    Intent mainMenu = new Intent(adip.this, hindiScheme.class);
                    mainMenu.putExtra("id",R.id.adips);

                    startActivity(mainMenu);
                }
                else if(id==R.id.sidpa)
                {
                    toast = Toast.makeText(adip.this, "not available in hindi", Toast.LENGTH_SHORT);

                }
                else if(id==R.id.ddrs)
                {
                    toast = Toast.makeText(adip.this, "file is opening", Toast.LENGTH_SHORT);
                    Intent mainMenu = new Intent(adip.this, hindiScheme.class);
                    mainMenu.putExtra("id",R.id.ddrs);
                    startActivity(mainMenu);
                }
                else if(id==R.id.freeCoaching)
                {
                    Toast.makeText(adip.this,"not available in hindi",Toast.LENGTH_SHORT).show();
                }
                else if(id== R.id.providingEmployment)
                {
                    Toast.makeText(adip.this,"not available in hindi",Toast.LENGTH_SHORT).show();
                }
                else if(id==R.id.nap)
                {
                    Toast.makeText(adip.this,"not available in hindi",Toast.LENGTH_SHORT).show();
                }
                else if(id==R.id.adAndP)
                {
                    Toast.makeText(adip.this,"not available in hindi",Toast.LENGTH_SHORT).show();
                }

            }
        });
        //on click home button
        homeIconOfAdip = findViewById(R.id.homeIconOfAdip );
        homeIconOfAdip .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainMenus =new Intent(adip.this,MainActivity.class);
                startActivity(mainMenus);
            }
        });







        //apply button click
        adipApply=findViewById(R.id.adipApply);
        adipApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(checkConnection())
               {
                    Toast.makeText(adip.this,"No internet connection",Toast.LENGTH_SHORT).show();

               }
               else if (id==R.id.adips)
               {
                   golink("http://adipcochlearimplant.in/Application-Instruction.aspx");
               }
               else if (id==R.id.sidpa)
               {
                   golink("https://disabilityaffairs.gov.in/content/page/sipda.php");
               }
               else if (id==R.id.ddrs)
               {
                   golink("https://disabilityaffairs.gov.in/content/page/ddrs.php");
               }
               else if (id==R.id.freeCoaching)
               {
                   golink("https://disabilityaffairs.gov.in/content/page/scholarship.php");
               }
               else if (id==R.id.providingEmployment)
               {
                   Toast.makeText(adip.this,"can not apply online",Toast.LENGTH_SHORT).show();
               }
               else if (id==R.id.nap)
               {
                   golink("https://disabilityaffairs.gov.in/content/page/skill-development-of-pwd.php");
               }
               else if (id==R.id.adAndP)
               {
                   golink("https://disabilityaffairs.gov.in/content/page/awareness-generations.php");
               }

            }
        });




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
    public void pdfOpener(int id)
    {
        if(id==R.id.adips)
        {
            toast = Toast.makeText(this, "file is opening", Toast.LENGTH_SHORT);
            toast.show();
            pdfView.fromAsset("adip.pdf").load();
        }
        else if(id==R.id.sidpa)
        {
            toast = Toast.makeText(this, "file is opening", Toast.LENGTH_SHORT);
            toast.show();
            pdfView.fromAsset("sidpa.pdf").load();
        }
        else if(id==R.id.ddrs)
        {
            toast = Toast.makeText(this, "file is opening", Toast.LENGTH_SHORT);
            toast.show();
            pdfView.fromAsset("ddrs.pdf").load();
        }
        else if(id==R.id.freeCoaching)
        {
            toast = Toast.makeText(this, "file is opening", Toast.LENGTH_SHORT);
            toast.show();
            pdfView.fromAsset("freecoaching.pdf").load();
        }
        else if(id==R.id.providingEmployment)
        {
            toast = Toast.makeText(this, "file is opening", Toast.LENGTH_SHORT);
            toast.show();
            pdfView.fromAsset("incentive.pdf").load();
        }
        else if(id==R.id.nap)
        {
            toast = Toast.makeText(this, "file is opening", Toast.LENGTH_SHORT);
            toast.show();
            pdfView.fromAsset("nap.pdf").load();
        }
        else if(id==R.id.adAndP)
        {
            toast = Toast.makeText(this, "file is opening", Toast.LENGTH_SHORT);
            toast.show();
            pdfView.fromAsset("awareness.pdf").load();
        }



    }

}