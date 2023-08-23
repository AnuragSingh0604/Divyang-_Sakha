package com.example.divyangshakha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class hindi_overview_of_department extends AppCompatActivity {
    Window window;
    Button homeIconOfOverview;
    Button audioIconOfOverview;
    TextToSpeech speech1;
    TextView overviewContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi_overview_of_department);

        window=this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimaryVariant));
        //home button click
        homeIconOfOverview = findViewById(R.id. homeIconOfOverview);
        homeIconOfOverview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainMenus =new Intent(hindi_overview_of_department.this,MainActivity.class);
                startActivity(mainMenus);
            }
        });
        //text to speech
        overviewContent=findViewById(R.id.overviewContent);
        audioIconOfOverview=findViewById(R.id.audioIconOfOverview);
        speech1= new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status== TextToSpeech.SUCCESS)
                {
                    Locale locale= new Locale("hi","IN");
                    speech1.setLanguage(locale);
                    audioIconOfOverview.setEnabled(true);

                }

            }
        });
        audioIconOfOverview.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View view) {



                speak(overviewContent.getText().toString());






            }

        });


    }
    public void speak(String text)
    {

        speech1.speak(text, TextToSpeech.QUEUE_ADD, null);




    }
    @Override
    protected void onDestroy() {

        if(speech1 != null )
        {

            speech1.stop();

            speech1.shutdown();
        }
        super.onDestroy();

    }

}