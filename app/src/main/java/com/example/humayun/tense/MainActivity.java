package com.example.humayun.tense;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button1;
    private  Button button2;
    private  Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =(Button) findViewById(R.id.button);
        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_tense=new Intent(MainActivity.this,Tense.class);
                startActivity(intent_tense);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_present=new Intent(MainActivity.this,Present.class);
                startActivity(intent_present);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_past=new Intent(MainActivity.this,Past.class);
                startActivity(intent_past);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_future=new Intent(MainActivity.this,Future.class);
                startActivity(intent_future);
            }
        });
    }
}
