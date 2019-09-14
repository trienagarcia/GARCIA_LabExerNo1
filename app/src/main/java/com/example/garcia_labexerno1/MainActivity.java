package com.example.garcia_labexerno1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    //Button button;
    //Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // button = findViewById(R.id.button);
    }

    public void displayMsg(View v) {
       // Intent i = new Intent(Intent.ACTION_VIEW);
        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);


    }
    public void ser(View v) {
        // Intent i = new Intent(Intent.ACTION_VIEW);
        super.onResume();
        Intent i = new Intent(this, MyService.class);
        startActivity(i);
    }

}
