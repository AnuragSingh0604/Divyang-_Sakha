package com.example.divyangshakha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import java.util.ArrayList;

public class typesOfDisability extends AppCompatActivity {
    Window window;
    ArrayList<disabilityModel> str=new ArrayList<>();
    DisabilityAdapter adapt;
    Button homeIconOfTypes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types_of_disability);
        window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimaryVariant));
        //on click home icon
        homeIconOfTypes=findViewById(R.id.homeIconOfTypes);

        homeIconOfTypes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainMenus =new Intent(typesOfDisability.this,MainActivity.class);
                startActivity(mainMenus);
            }
        });
        RecyclerView recycle=findViewById(R.id.recycle);
        recycle.setLayoutManager(new LinearLayoutManager(this));
        str.add(new disabilityModel(R.drawable.ic_blindness_svg,"1.  Blindness"
               ));
        str.add(new disabilityModel(R.drawable.ic_lowvision,"2.  Low-vision"
        ));
        str.add(new disabilityModel(R.drawable.ic_leprosy,"3.  Leprosy cured persons"
        ));
        str.add(new disabilityModel(R.drawable.ic_hearing,"4.  Hearing impairment(deaf and hard of hearing)"
        ));
        str.add(new disabilityModel(R.drawable.ic_locomotive,"5.  Locomotor Disability"
        ));
        str.add(new disabilityModel(R.drawable.ic_boy,"6.  Dwarfism"
        ));
        str.add(new disabilityModel(R.drawable.ic_mental,"7.  Intellectual disability"
        ));
        str.add(new disabilityModel(R.drawable.ic_mental_health,"8.  Mental illness"
        ));
        str.add(new disabilityModel(R.drawable.ic_austim,"9.  Austim spectrum disorder"
        ));
        str.add(new disabilityModel(R.drawable.ic_cerebal,"10.  Cerebral palsy"
        ));
        str.add(new disabilityModel(R.drawable.dystophy,"11.  Muscular dystrophy"
        ));
        str.add(new disabilityModel(R.drawable.ic_chronic,"12.  Chronic Neurological conditions"
        ));
        str.add(new disabilityModel(R.drawable.ic_learning,"13.  Specific Learning disabilities"
        ));
        str.add(new disabilityModel(R.drawable.ic_sclerosis,"14.  Multiple Sclerosis"
        ));
        str.add(new disabilityModel(R.drawable.ic_language,"15.  Speech and Language disability"
        ));
        str.add(new disabilityModel(R.drawable.ic_thalassemia,"16.  Thalassemia"
        ));
        str.add(new disabilityModel(R.drawable.ic_hemophilia,"17.  Hemophilia"
        ));
        str.add(new disabilityModel(R.drawable.ic_sickle,"18.  Sickle cell disease"
        ));
        str.add(new disabilityModel(R.drawable.ic_multiple,"19. Multiple disabilities including deafblindness"
        ));
        str.add(new disabilityModel(R.drawable.ic_acid,"20. Acid Attack victim"
        ));
        str.add(new disabilityModel(R.drawable.ic_parkinson,"21. Parkinson's disease"
        ));

        adapt= new DisabilityAdapter(this,str);
        recycle.setAdapter(adapt);
    }
}