package com.example.humayun.tense;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Present extends AppCompatActivity {

    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_present);

        button=(Button) findViewById(R.id.ptt1);
        button2=(Button) findViewById(R.id.ptt2);
        button3=(Button) findViewById(R.id.ptt3);
        button4=(Button) findViewById(R.id.ptt4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent present1=new Intent(Present.this,present_Indef_tense.class);
                startActivity(present1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent present2=new Intent(Present.this,pres_contin_tense.class);
                startActivity(present2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent present3=new Intent(Present.this,Prese_perfect.class);
                startActivity(present3);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent present4=new Intent(Present.this,Presen_perf_continu_tense.class);
                startActivity(present4);
            }
        });
    }
}
