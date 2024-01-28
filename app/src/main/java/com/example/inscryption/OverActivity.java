package com.example.inscryption;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class OverActivity extends AppCompatActivity {
    TextView overTextView;
    ImageView overImageView;
    Hero hero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_over);

        overTextView = findViewById(R.id.overTextView);
        overImageView = findViewById(R.id.overImageView);
        hero = (Hero) getIntent().getSerializableExtra("hero");
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        hero.StopFon();
        hero.Fon(this,R.raw.fon);


        switch (hero.getNumberOfHero()) {
            case 1:
                overTextView.setText(R.string.RobotLoss);
                overImageView.setImageResource(R.drawable.robotover);
                break;
            case 2:
                overTextView.setText(R.string.SceletonLoss);
                overImageView.setImageResource(R.drawable.ghostover);
                break;
            case 3:
                overTextView.setText(R.string.WizardLoss);
                overImageView.setImageResource(R.drawable.wizardover);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        moveTaskToBack(true);
    }
    @Override
    public void onDestroy()
    {
        hero.StopFon();
        super.onDestroy();
    }
}