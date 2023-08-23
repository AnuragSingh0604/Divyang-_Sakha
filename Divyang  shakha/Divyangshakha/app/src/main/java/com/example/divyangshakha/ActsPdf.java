package com.example.divyangshakha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class ActsPdf extends AppCompatActivity {
    Window window;
    PDFView pdfView;
    Toast toast;
    Button homeIconOfAct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acts_pdf);
        window=this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimaryVariant));
        Intent actFrom=getIntent();
        int ide=actFrom.getIntExtra("id",0);
        pdfView=findViewById(R.id.pdfView);
        pdfOpener(ide);
        //on click home button
        homeIconOfAct=findViewById(R.id.homeIconOfAct);
        homeIconOfAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainMenus =new Intent(ActsPdf.this,MainActivity.class);
                startActivity(mainMenus);
            }
        });

    }
    public void pdfOpener(int ide)
    {
        if(ide==R.id. austim)
        {
            toast = Toast.makeText(this, "file is opening", Toast.LENGTH_SHORT);
            toast.show();
            pdfView.fromAsset("guidelinesforaustim.pdf").load();
        }
        if(ide==R.id. barrier)
        {
            toast = Toast.makeText(this, "file is opening", Toast.LENGTH_SHORT);
            toast.show();
            pdfView.fromAsset("agedanddisabled.PDF").load();
        }
        if(ide==R.id. certification)
        {
            toast = Toast.makeText(this, "file is opening", Toast.LENGTH_SHORT);
            toast.show();
            pdfView.fromAsset("guidelinefordisabilities.pdf").load();
        }
        if(ide==R.id. national)
        {
            toast = Toast.makeText(this, "file is opening", Toast.LENGTH_SHORT);
            toast.show();
            pdfView.fromAsset("nationalanthem.pdf").load();
        }
        if(ide==R.id. incheon)
        {
            toast = Toast.makeText(this, "file is opening", Toast.LENGTH_SHORT);
            toast.show();
            pdfView.fromAsset("incheonstrategy.pdf").load();
        }
        if(ide==R.id. trust)
        {
            toast = Toast.makeText(this, "file is opening", Toast.LENGTH_SHORT);
            toast.show();
            pdfView.fromAsset("nationaltrust.pdf").load();
        }
        if(ide==R.id. written)
        {
            toast = Toast.makeText(this, "file is opening", Toast.LENGTH_SHORT);
            toast.show();
            pdfView.fromAsset("writtenexam.pdf").load();
        }
        if(ide==R.id. rehabilitation)
        {
            toast = Toast.makeText(this, "file is opening", Toast.LENGTH_SHORT);
            toast.show();
            pdfView.fromAsset("rehabilitation.pdf").load();
        }
        if(ide==R.id. rights)
        {
            toast = Toast.makeText(this, "file is opening", Toast.LENGTH_SHORT);
            toast.show();
            pdfView.fromAsset("rightsofperson.pdf").load();
        }
        if(ide==R.id. un)
        {
            toast = Toast.makeText(this, "file is opening", Toast.LENGTH_SHORT);
            toast.show();
            pdfView.fromAsset("unconvention.pdf").load();
        }


    }

}