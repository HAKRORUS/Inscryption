package com.example.inscryption;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HeroActivity extends AppCompatActivity {

    TextView heroTextView;
    TextView heroAboutTextView;
    Button chooseButton;
    int hero=0;

    Hero hero1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero);

        heroTextView = findViewById(R.id.heroTextView);
        heroAboutTextView = findViewById(R.id.heroAboutTextView);
        chooseButton = findViewById(R.id.chooseButton);

        hero1 = new Hero();
    }

    public void robot(View view) {
        heroTextView.setText(R.string.Robot);
        heroAboutTextView.setText(R.string.RobotAbout);
        chooseButton.setVisibility(View.VISIBLE);
        chooseButton.setClickable(true);
        hero=1;
    }

    public void sceleton(View view) {
        heroTextView.setText(R.string.Sceleton);
        heroAboutTextView.setText(R.string.SceletonAbout);
        chooseButton.setVisibility(View.VISIBLE);
        chooseButton.setClickable(true);
        hero=2;
    }

    public void wizard(View view) {
        heroTextView.setText(R.string.Wizard);
        heroAboutTextView.setText(R.string.WizardAbout);
        chooseButton.setVisibility(View.VISIBLE);
        chooseButton.setClickable(true);
        hero=3;
    }

    public void choose(View view) {
        Intent intent = new Intent(this,HiMainActivity.class);
        intent.putExtra("Name",getIntent().getStringExtra("Name"));
        intent.putExtra("Hero",hero);
        startActivity(intent);
    }
}