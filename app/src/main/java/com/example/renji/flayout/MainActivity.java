package com.example.renji.flayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {


    RelativeLayout rlayout1;
    RelativeLayout rlayout2;
    Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rlayout1=(RelativeLayout)findViewById(R.id.rlayout1);
        rlayout2=(RelativeLayout)findViewById(R.id.rlayout2);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rlayout1.setVisibility(View.VISIBLE);
                rlayout2.setVisibility(View.GONE);

            }
        });
         button1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 rlayout1.setVisibility(View.GONE);
                 rlayout2.setVisibility(View.VISIBLE);
             }
         });

    }
}
