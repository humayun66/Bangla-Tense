package com.example.humayun.tense;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Past extends AppCompatActivity {
    private Button past1;
    private Button past2;
    private Button past3;
    private Button past4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past);

        past1=(Button) findViewById(R.id.p_in1);
        past2=(Button) findViewById(R.id.p_con1);
        past3=(Button) findViewById(R.id.p_perf);
        past4=(Button)findViewById(R.id.p_per_cont);


        past1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent past_indef=new Intent(Past.this,Past_Inde_tense.class);
                startActivity(past_indef);
            }
        });

        past2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent past_cont= new Intent(Past.this,Past_Cont_Ten.class);
                startActivity(past_cont);
            }
        });
        past3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent past_perf = new Intent(Past.this,Past_Perf_Ten.class);
                startActivity(past_perf);
            }
        });
        past4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent past_perf_cont = new Intent(Past.this, Past_Perf_Cont_T.class);
                startActivity(past_perf_cont);
            }
        });
    }
}
