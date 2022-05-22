package com.aamnahkhalid.kidsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView Score;
    private static final String TAG="ResultActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Log.d(TAG, "onCreate: Result Activity");
    }
    @Override

    protected void onStart(){
        super.onStart();
        Log.d(TAG, " onStart Result Activity");
    }

    @Override

    protected void onResume(){
        super.onResume();
        Log.d(TAG, " onResume Result Activity");
    }

    @Override

    protected void onPause(){
        super.onPause();
        Log.d(TAG, " onPause Result Activity");
    }

    @Override

    protected void onStop(){
        super.onStop();
        Log.d(TAG, " onStop Result Activity");
    }

    @Override

    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, " onDestroy Result Activity");
    }

    @Override

    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, " onRestart Result Activity");
    }
}