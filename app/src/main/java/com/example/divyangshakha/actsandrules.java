package com.example.divyangshakha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class actsandrules extends AppCompatActivity {
    Window window;
    Button austim,barrier,certification,national,
            incheon,trust,written,rehabilitation,rights,
            un,homeIconOfScheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actsandrules);
        window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimaryVariant));
        austim=findViewById(R.id.austim);
        barrier=findViewById(R.id.barrier);
        certification=findViewById(R.id.certification);
        national=findViewById(R.id.national);
        incheon=findViewById(R.id.incheon);
        trust=findViewById(R.id.trust);
        written=findViewById(R.id.written);
        rehabilitation=findViewById(R.id.rehabilitation);
        rights=findViewById(R.id.rights);
        un=findViewById(R.id.un);

        //on click home icon
        homeIconOfScheme=findViewById(R.id.homeIconOfScheme);
        homeIconOfScheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainMenus =new Intent(actsandrules.this,MainActivity.class);
                startActivity(mainMenus);
            }
        });



    }
    public  void check(View view)
    {
        Button b=(Button)view;
        if(b==austim)
        {
            Intent mainMenus = new Intent(actsandrules.this, ActsPdf.class);
            mainMenus.putExtra("id",R.id.austim);

            startActivity(mainMenus);

        }
        else if(b==barrier)
        {
            Intent mainMenus = new Intent(actsandrules.this,  ActsPdf.class);
            mainMenus.putExtra("id",R.id.barrier);
            startActivity(mainMenus);
        }
        else if(b==certification)
        {
            Intent mainMenus = new Intent(actsandrules.this,  ActsPdf.class);
            mainMenus.putExtra("id",R.id.certification);
            startActivity(mainMenus);
        }
        else if(b==national)
        {
            Intent mainMenus = new Intent(actsandrules.this,  ActsPdf.class);
            mainMenus.putExtra("id",R.id.national);
            startActivity(mainMenus);
        }
        else if(b== incheon)
        {
            Intent mainMenus = new Intent(actsandrules.this,  ActsPdf.class);
            mainMenus.putExtra("id",R.id. incheon);
            startActivity(mainMenus);
        }
        else if(b==trust)
        {
            Intent mainMenus = new Intent(actsandrules.this,  ActsPdf.class);
            mainMenus.putExtra("id",R.id.trust);
            startActivity(mainMenus);
        }
        else if(b==written)
        {
            Intent mainMenus = new Intent(actsandrules.this,  ActsPdf.class);
            mainMenus.putExtra("id",R.id.written);
            startActivity(mainMenus);
        }
        else if(b==rehabilitation)
        {
            Intent mainMenus = new Intent(actsandrules.this,  ActsPdf.class);
            mainMenus.putExtra("id",R.id.rehabilitation);
            startActivity(mainMenus);
        }
        else if(b==rights)
        {
            Intent mainMenus = new Intent(actsandrules.this,  ActsPdf.class);
            mainMenus.putExtra("id",R.id.rights);
            startActivity(mainMenus);
        }
        else if(b==un)
        {
            Intent mainMenus = new Intent(actsandrules.this,  ActsPdf.class);
            mainMenus.putExtra("id",R.id.un);
            startActivity(mainMenus);
        }

    }


}