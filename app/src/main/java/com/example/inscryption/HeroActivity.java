package com.example.inscryption;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class HeroActivity extends AppCompatActivity {

    TextView heroTextView;
    TextView heroAboutTextView;
    TextView heroStatsTextView;
    Button chooseButton;

    Hero hero1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        heroTextView = findViewById(R.id.heroTextView);
        heroStatsTextView = findViewById(R.id.statsTextView);
        heroAboutTextView = findViewById(R.id.heroAboutTextView);
        chooseButton = findViewById(R.id.chooseButton);

        hero1 = (Hero) getIntent().getSerializableExtra("hero");
    }

    public void robot(View view) {
        heroTextView.setText(R.string.Robot);
        heroAboutTextView.setText(R.string.RobotAbout);
        heroStatsTextView.setText(R.string.RobotStats);
        chooseButton.setVisibility(View.VISIBLE);
        chooseButton.setClickable(true);
        hero1.setNumberOfHero(1);
    }

    public void sceleton(View view) {
        heroTextView.setText(R.string.Sceleton);
        heroAboutTextView.setText(R.string.SceletonAbout);
        heroStatsTextView.setText(R.string.SceletonStats);
        chooseButton.setVisibility(View.VISIBLE);
        chooseButton.setClickable(true);
        hero1.setNumberOfHero(2);
    }

    public void wizard(View view) {
        heroTextView.setText(R.string.Wizard);
        heroAboutTextView.setText(R.string.WizardAbout);
        heroStatsTextView.setText(R.string.WizardStats);
        chooseButton.setVisibility(View.VISIBLE);
        chooseButton.setClickable(true);
        hero1.setNumberOfHero(3);
    }

    public void choose(View view) {
        hero1.setHealth(100);
        hero1.setMaxhealth(100);
        switch (hero1.getNumberOfHero()) {
            case 1:
                hero1.setPhysickAtack(30);
                hero1.setPhysickArmor(50);
                hero1.setMagickAtack(15);
                hero1.setMagickArmor(20);
                break;
            case 2:
                hero1.setPhysickAtack(20);
                hero1.setPhysickArmor(30);
                hero1.setMagickAtack(20);
                hero1.setMagickArmor(30);
                break;
            case  3:
                hero1.setPhysickAtack(15);
                hero1.setPhysickArmor(20);
                hero1.setMagickAtack(30);
                hero1.setMagickArmor(50);
                break;
        }

        Intent intent = new Intent(this,HiMainActivity.class);
        intent.putExtra("hero",hero1);
        startActivity(intent);
    }
}