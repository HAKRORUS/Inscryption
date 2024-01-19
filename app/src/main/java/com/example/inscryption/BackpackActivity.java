package com.example.inscryption;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BackpackActivity extends AppCompatActivity {
    TextView hiTextView;
    Hero hero3;
    Enemy enemy1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backpack);

        hero3 = (Hero) getIntent().getSerializableExtra("hero");
        enemy1 = (Enemy) getIntent().getSerializableExtra("enemy");

        hiTextView = findViewById(R.id.hiTextView);

        if (hero3.isHi()) {
            hiTextView.setVisibility(View.VISIBLE);
        } else {
            hiTextView.setVisibility(View.INVISIBLE);
        }
    }

    public void Back(View view) {
        if (hero3.isHi()) {
            hero3.setHi(false);
            Intent intent = new Intent(this, HiMainActivity.class);
            intent.putExtra("hero", hero3);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, FightActivity.class);
            intent.putExtra("hero", hero3);
            intent.putExtra("enemy", enemy1);
            startActivity(intent);
        }
    }
}