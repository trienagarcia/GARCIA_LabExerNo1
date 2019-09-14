package com.example.garcia_labexerno1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
    }
    public void displayMsg1(View v){
        Intent i = new Intent (Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://en.wikipedia.org/wiki/University_of_Santo_Tomas_Faculty_of_Engineering"));
        startActivity(i);
        // ruano
    }
    public void displayMsg2(View v){
        Intent i = new Intent (Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://varsitarian.net/20180102/circle/ust-main-building-at-90"));
        startActivity(i);
        // main
    }
    public void displayMsg3(View v){
        Intent i = new Intent (Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://varsitarian.net/news/20100126/ust_sites_declared_national_treasures"));
        startActivity(i);
        // field
    }
    public void displayMsg4(View v){
        Intent i = new Intent (Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://library.ust.edu.ph"));
        startActivity(i);
        // lib
    }
}
