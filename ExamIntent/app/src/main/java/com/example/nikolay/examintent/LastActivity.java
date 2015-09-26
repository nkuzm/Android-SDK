package com.example.nikolay.examintent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class LastActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.last_layout);
    }

    public void onBack(View view) {
        finish();
    }
}
