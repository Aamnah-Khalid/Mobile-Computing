package com.aamnahkhalid.kidsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class AlphabetActivity extends AppCompatActivity {
    private static final String TAG="AlphabetActivity";
    ImageView image;
    String letter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);
        Log.d(TAG, "onCreate: Alphabet Activity");
        image=findViewById(R.id.imageView);
        letter=getIntent().getStringExtra("input");

        switch(letter){
            case "a":
                image.setImageResource(R.drawable.a);
                break;
            case "b":
                image.setImageResource(R.drawable.b);
                break;
            case "c":
                image.setImageResource(R.drawable.c);
                break;
            case "d":
                image.setImageResource(R.drawable.d);
                break;
            case "e":
                image.setImageResource(R.drawable.e);
                break;
            case "f":
                image.setImageResource(R.drawable.f);
                break;
            case "g":
                image.setImageResource(R.drawable.g);
                break;
            case "h":
                image.setImageResource(R.drawable.h);
                break;
            case "i":
                image.setImageResource(R.drawable.i);
                break;
            case "j":
                image.setImageResource(R.drawable.j);
                break;
            case "k":
                image.setImageResource(R.drawable.k);
                break;
            case "l":
                image.setImageResource(R.drawable.l);
                break;
            case "m":
                image.setImageResource(R.drawable.m);
                break;
            case "n":
                image.setImageResource(R.drawable.n);
                break;
            case "o":
                image.setImageResource(R.drawable.o);
                break;
            case "p":
                image.setImageResource(R.drawable.p);
                break;
            case "q":
                image.setImageResource(R.drawable.q);
                break;
            case "r":
                image.setImageResource(R.drawable.r);
                break;
            case "s":
                image.setImageResource(R.drawable.s);
                break;
            case "t":
                image.setImageResource(R.drawable.t);
                break;
            case "u":
                image.setImageResource(R.drawable.u);
                break;
            case "v":
                image.setImageResource(R.drawable.v);
                break;
            case "w":
                image.setImageResource(R.drawable.w);
                break;
            case "x":
                image.setImageResource(R.drawable.x);
                break;
            case "y":
                image.setImageResource(R.drawable.y);
                break;
            default:
                image.setImageResource(R.drawable.z);
        }
    }
    @Override

    protected void onStart(){
        super.onStart();
        Log.d(TAG, " onStart Learning Activity");
    }

    @Override

    protected void onResume(){
        super.onResume();
        Log.d(TAG, " onResume Alphabet Activity");
    }

    @Override

    protected void onPause(){
        super.onPause();
        Log.d(TAG, " onPause Alphabet Activity");
    }

    @Override

    protected void onStop(){
        super.onStop();
        Log.d(TAG, " onStop Alphabet Activity");
    }

    @Override

    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, " onDestroy Alphabet Activity");
    }

    @Override

    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, " onRestart Alphabet Activity");
    }
}