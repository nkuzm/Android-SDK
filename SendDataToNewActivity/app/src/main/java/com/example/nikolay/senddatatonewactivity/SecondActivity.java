package com.example.nikolay.senddatatonewactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends Activity {

    private TextView txtLog;
    private TextView txtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        txtLog = (TextView) findViewById(R.id.txtLog);
        txtPass = (TextView) findViewById(R.id.txtPass);

        txtLog.setText(getIntent().getStringExtra("login"));
        txtPass.setText(getIntent().getStringExtra("pass"));
    }

    public void back(View view) {
        finish();
    }
}
