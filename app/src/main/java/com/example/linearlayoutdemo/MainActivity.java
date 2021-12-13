package com.example.linearlayoutdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView=findViewById(R.id.result);
    }

    public void clang(View view) {
        mTextView.setText("C language Selected");
    }

    public void cpp(View view) {
        mTextView.setText("Cpp Selected");
    }

    public void java(View view) {
        mTextView.setText("Java Selected");
    }

    public void python(View view) {
        mTextView.setText("Python Selected");
    }
}