package com.example.divyangshakha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;


public class about_us extends AppCompatActivity {
    Window window;
    int i=0;

    TextToSpeech speech;
    TextView intro;
    TextView para2nd;
    TextView para3rd;
    Button audioicon,homeIcon;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        audioicon=findViewById(R.id.audioIcon);


        window=this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimaryVariant));
        speech= new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status== TextToSpeech.SUCCESS)
                {
                    Locale locale= new Locale("hi","IN");
                    speech.setLanguage(locale);
                    audioicon.setEnabled(true);


                }

            }
        });
        intro =findViewById(R.id.intro);
        para2nd=findViewById(R.id.para2nd);
        para3rd=findViewById(R.id.para3rd);



            audioicon.setOnClickListener(new View.OnClickListener() {


                @Override

               public void onClick(View view) {





                                speak(intro.getText().toString());
                                speak(para2nd.getText().toString());
                                speak(para3rd.getText().toString());










                }

            });

        //navigation bar colour

        //homeIcon
        homeIcon=findViewById(R.id.homeIcon);
        homeIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainMenu =new Intent(about_us.this,MainActivity.class);
                startActivity(mainMenu);
            }
        });


    }



    public void speak(String text)
    {

            speech.speak(text, TextToSpeech.QUEUE_ADD, null);





    }


    @Override
    protected void onDestroy() {

        if(speech != null )
        {

            speech.stop();

            speech.shutdown();
        }
        super.onDestroy();

    }




}