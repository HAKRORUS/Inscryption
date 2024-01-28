package com.example.inscryption;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class WinActivity extends AppCompatActivity {
    TextView winTextView;
    ImageView winImageView;
    Hero hero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_win);
        winTextView = findViewById(R.id.winTextView);
        winImageView = findViewById(R.id.winImageView);
        hero = (Hero) getIntent().getSerializableExtra("hero");
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        hero.StopFon();
        hero.Fon(this,R.raw.fon);


        switch (hero.getNumberOfHero()) {
            case 1:
                winTextView.setText(R.string.RobotWin);
                winImageView.setImageResource(R.drawable.robotwin);
                break;
            case 2:
                winTextView.setText(R.string.SceletonWin);
                winImageView.setImageResource(R.drawable.ghostwin);
                break;
            case 3:
                winTextView.setText(R.string.WizardWin);
                winImageView.setImageResource(R.drawable.wizardwin);
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