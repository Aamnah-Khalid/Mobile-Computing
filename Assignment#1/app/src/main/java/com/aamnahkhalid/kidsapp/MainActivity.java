package com.aamnahkhalid.kidsapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    Button learn,exam,github;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        learn=findViewById(R.id.btn_learn);
        learn.setOnClickListener(this);

        exam=findViewById(R.id.btn_exam);
        exam.setOnClickListener(this);

        github=findViewById(R.id.btn_git);
        github.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_learn:
                Intent intent=new Intent(MainActivity.this,LearningActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_exam:
                intent=new Intent(MainActivity.this,ExamActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_git:
                Uri uri=Uri.parse("https://github.com/Aamnah-Khalid/Mobile-Computing");
                intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
                break;
        }
    }
}

