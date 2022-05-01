package com.aamnahkhalid.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private int mCounter = 0;
    Button btn;
    TextView txv;
    Button rst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn= findViewById(R.id.bt);
        TextView txv= findViewById(R.id.tx);
        Button rst=findViewById(R.id.rs);

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                mCounter ++;
                txv.setText(Integer.toString(mCounter));
            }
        });

        rst.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                mCounter=0;
                txv.setText(Integer.toString(mCounter));
            }
        });
    }
}