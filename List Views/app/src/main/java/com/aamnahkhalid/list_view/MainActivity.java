package com.aamnahkhalid.list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> studentList = new ArrayList<String> ();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentList.add("Saad");
        studentList.add("Zahid");
        studentList.add("Saeed");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, studentList);

        listView = findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);

        Button buttonTaskAdd;
        TextView editTextTask;

        editTextTask=findViewById(R.id.editTextTextPersonName);
        buttonTaskAdd=findViewById(R.id.button);
        buttonTaskAdd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                studentList.add(editTextTask.getText().toString());
                arrayAdapter.notifyDataSetChanged();
            }
        });

    }
}