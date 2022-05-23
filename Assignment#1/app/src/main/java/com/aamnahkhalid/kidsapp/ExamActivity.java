package com.aamnahkhalid.kidsapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ExamActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG="ExamActivity";
    Button op1,op2,op3,op4,exitBtn;
    public int mcq=1;
    public int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        Log.d(TAG, "onCreate: Exam Activity");
        op1=findViewById(R.id.Op1);
        op1.setOnClickListener(this);

        op2=findViewById(R.id.Op2);
        op2.setOnClickListener(this);

        op3=findViewById(R.id.Op3);
        op3.setOnClickListener(this);

        op4=findViewById(R.id.Op4);
        op4.setOnClickListener(this);

        exitBtn=findViewById(R.id.exit);
        exitBtn.setOnClickListener(this);

    }
    @Override

    public void onClick(View v) {

        ImageView CurImg=findViewById(R.id.imageView2);

        if(v.getId()==R.id.exit) {
            Intent intent = new Intent(ExamActivity.this, MainActivity.class);
            startActivity(intent);
        }

        if(mcq==1)
        {
            if(v.getId()==R.id.Op1)
            {
                CurImg.setImageResource(R.drawable.fan);
                op1.setText("M");
                op2.setText("F");
                op3.setText("Z");
                op4.setText("P");
                restoreSettings();
                mcq++;
                score++;
            }
            else
            {
                v.setBackgroundColor(Color.parseColor("#fadbd8"));
                v.setEnabled(false);
            }

        }
        else if(mcq==2)
        {
            if(v.getId()==R.id.Op2)
            {

                CurImg.setImageResource(R.drawable.balloon);
                op1.setText("D");
                op2.setText("R");
                op3.setText("Z");
                op4.setText("B");
                restoreSettings();
                mcq++;
                score++;
            }
            else
            {
                v.setBackgroundColor(Color.parseColor("#fadbd8"));
                v.setEnabled(false);
            }
        }
        else if(mcq==3)
        {
            if(v.getId()==R.id.Op4)
            {

                CurImg.setImageResource(R.drawable.drum);
                op1.setText("C");
                op2.setText("D");
                op3.setText("Z");
                op4.setText("P");
                mcq++;
                score++;
                restoreSettings();
            }
            else
            {
                v.setBackgroundColor(Color.parseColor("#fadbd8"));
                v.setEnabled(false);
            }

        }
        else if(mcq==4)
        {
            if(v.getId()==R.id.Op2)
            {

                CurImg.setImageResource(R.drawable.giraffe);
                op1.setText("X");
                op2.setText("  G");
                op3.setText(" O");
                op4.setText("  R");
                mcq++;
                score++;
                restoreSettings();
            }
            else
            {
                v.setBackgroundColor(Color.parseColor("#fadbd8"));
                v.setEnabled(false);
            }

        }
        else if(mcq==5)
        {
            if(v.getId()==R.id.Op2)
            {

                CurImg.setImageResource(R.drawable.lemon);
                op1.setText(" S");
                op2.setText("  D");
                op3.setText("  L");
                op4.setText("  P");
                mcq++;
                score++;
                restoreSettings();
            }
            else
            {
                v.setBackgroundColor(Color.parseColor("#fadbd8"));
                v.setEnabled(false);
            }

        }
        else if(mcq==6)
        {
            if(v.getId()==R.id.Op3)
            {

                CurImg.setImageResource(R.drawable.key);
                op1.setText("  K");
                op2.setText("  I");
                op3.setText("  S");
                op4.setText("  Q");
                mcq++;
                score++;
                restoreSettings();
            }
            else
            {
                v.setBackgroundColor(Color.parseColor("#fadbd8"));
                v.setEnabled(false);
            }

        }
        else if(mcq==7)
        {
            if(v.getId()==R.id.Op1)
            {

                CurImg.setImageResource(R.drawable.nest);
                op1.setText("  M");
                op2.setText("  A");
                op3.setText("  N");
                op4.setText("  P");
                restoreSettings();
                mcq++;
                score++;
            }
            else
            {
                v.setBackgroundColor(Color.parseColor("#fadbd8"));
                v.setEnabled(false);
            }
        }
        else if(mcq==8)
        {
            if(v.getId()==R.id.Op3)
            {
                CurImg.setImageResource(R.drawable.rabbitt);
                op1.setText("  M");
                op2.setText("  R");
                op3.setText("  N");
                op4.setText("  P");
                restoreSettings();
                mcq++;
                score++;
            }
            else
            {
                v.setBackgroundColor(Color.parseColor("#fadbd8"));
                v.setEnabled(false);
            }
        }
        else if(mcq==9)
        {
            if(v.getId()==R.id.Op2)
            {

                CurImg.setImageResource(R.drawable.zip);
                op1.setText(" M");
                op2.setText("  A");
                op3.setText("  Z");
                op4.setText("  P");
                restoreSettings();
                mcq++;
                score++;
            }
            else
            {
                v.setBackgroundColor(Color.parseColor("#fadbd8"));
                v.setEnabled(false);
            }
        }
        else
        {
            if(v.getId()==R.id.Op3)
            {
                score++;
                Intent intent = new Intent(ExamActivity.this, ResultActivity.class);
                intent.putExtra("value", score);
                startActivity(intent);
            }
            else
            {
                v.setBackgroundColor(Color.parseColor("#fadbd8"));
                v.setEnabled(false);
            }
        }


    }
    private void restoreSettings()
    {
        op1.setBackgroundColor(Color.parseColor("#FFFFFF"));
        op2.setBackgroundColor(Color.parseColor("#FFFFFF"));
        op3.setBackgroundColor(Color.parseColor("#FFFFFF"));
        op4.setBackgroundColor(Color.parseColor("#FFFFFF"));
        op1.setEnabled(true);
        op2.setEnabled(true);
        op3.setEnabled(true);
        op4.setEnabled(true);
    }

    @Override

    protected void onStart(){
        super.onStart();
        Log.d(TAG, " onStart Exam Activity");
    }

    @Override

    protected void onResume(){
        super.onResume();
        Log.d(TAG, " onResume Exam Activity");
    }

    @Override

    protected void onPause(){
        super.onPause();
        Log.d(TAG, " onPause Exam Activity");
    }

    @Override

    protected void onStop(){
        super.onStop();
        Log.d(TAG, " onStop Exam Activity");
    }

    @Override

    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, " onDestroy Exam Activity");
    }

    @Override

    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, " onRestart Exam Activity");
    }

}