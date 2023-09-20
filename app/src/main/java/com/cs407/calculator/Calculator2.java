package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Calculator2 extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator2);
        textView = (TextView) findViewById(R.id.textView2);
        Intent intent=getIntent();
        String str=intent.getStringExtra("message");
        textView.setText(str);
    }
}