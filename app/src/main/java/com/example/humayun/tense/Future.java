package com.example.humayun.tense;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Future extends AppCompatActivity {

    private Button future1;
    private Button future2;
    private Button future3;
    private Button future4;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_future);

        future1=(Button) findViewById(R.id.future_inde);
        future2=(Button) findViewById(R.id.future_cont);
        future3=(Button) findViewById(R.id.future_per);
        future4= (Button) findViewById(R.id.future_per_cont);

        future1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent future_inde= new Intent(Future.this,Future_Inde_T.class);
                startActivity(future_inde);
            }
        });
        future2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent future_cont=new Intent(Future.this,Future_Cont_T.class);
                startActivity(future_cont);
            }
        });
        future3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent future_perf = new Intent(Future.this,Future_Perf_T.class);
                startActivity(future_perf);
            }
        });
        future4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent future_per_cont=new Intent(Future.this,Futute_Perf_Con_tense.class);
                startActivity(future_per_cont);
            }
        });
    }
}
