package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        double first = (double) Integer.parseInt(editText.getText().toString());
        double second = (double) Integer.parseInt(editText2.getText().toString());
        String result = Double.toString(first + second);
        goToActivity(result);
    }

    public void subtract(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        double first = (double) Integer.parseInt(editText.getText().toString());
        double second = (double) Integer.parseInt(editText2.getText().toString());
        String result = Double.toString(first - second);
        goToActivity(result);
    }
    public void multiply(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        double first = (double) Integer.parseInt(editText.getText().toString());
        double second = (double) Integer.parseInt(editText2.getText().toString());
        String result = Double.toString(first * second);
        goToActivity(result);
    }

    public void divide(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        double first = (double) Integer.parseInt(editText.getText().toString());
        double second = (double) Integer.parseInt(editText2.getText().toString());
        String result = "";
        if(second == 0) {
            result = "Error, divide by zero";
        }
        else {
            result = Double.toString(first / second);
        }
        goToActivity(result);
    }

    public void goToActivity(String s) {
        Intent intent = new Intent(this, Calculator2.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }
}