package com.aamnahkhalid.intents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuPresenter;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private MenuPresenter v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        public void onClick(View v)
        {

            Intent intent;

            switch (v.getId()) {

                case
                        R.id.button:

                    intent = new
                            Intent(MainActivity.this, MainActivity2.class);

                    startActivity(intent);

                    break;

                case R.id.button:

                    Uri uri =Uri.parse("tel:+923001234567");

                    intent = new
                            Intent(Intent.ACTION_DIAL, uri);

                    startActivity(intent);

                    break;

                default:

                    throw new
                            IllegalStateException("Unexpected value: "+ v.getId());
    }
}