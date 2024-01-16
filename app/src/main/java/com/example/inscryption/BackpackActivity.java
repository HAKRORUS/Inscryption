package com.example.inscryption;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BackpackActivity extends AppCompatActivity {
    TextView hiTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backpack);

        hiTextView = findViewById(R.id.hiTextView);

        if (getIntent().getBooleanExtra("hi",false)) {
            hiTextView.setVisibility(View.VISIBLE);
        } else {
            hiTextView.setVisibility(View.INVISIBLE);
        }
    }
}