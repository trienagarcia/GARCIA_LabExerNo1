package com.example.garcia_labexerno1;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
public class MyService extends IntentService {
    public MyService() {
        super("MyService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

            Log.d("fave", "favorite places");
            Log.d("fave", "favorite places");

    }
}
