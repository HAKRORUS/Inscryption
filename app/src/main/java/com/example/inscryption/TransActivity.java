package com.example.inscryption;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class TransActivity extends AppCompatActivity {
    Hero hero4;
    TextView transTextView;
    ImageView imageObject;
    TextView aboutObjectTextView;
    ImageView fonImageView;
    TextView aboutLocationTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trans);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        hero4 = (Hero) getIntent().getSerializableExtra("hero");
        transTextView = findViewById(R.id.transTextView);
        imageObject = findViewById(R.id.imageObject);
        aboutObjectTextView = findViewById(R.id.aboutObjectTextView);
        fonImageView = findViewById(R.id.fonImageView);
        aboutLocationTextView = findViewById(R.id.aboutLocationTextView);

        imageObject.setVisibility(View.VISIBLE);

        Stats();
        int random = (int) (Math.random() * 4 + 1);
            switch (random) {
                case 1:
                    imageObject.setImageResource(R.drawable.knife);
                    aboutObjectTextView.setText(R.string.knife);
                    break;
                case 2:
                    imageObject.setImageResource(R.drawable.magickink);
                    aboutObjectTextView.setText(R.string.magickInk);
                    break;
                case 3:
                    imageObject.setImageResource(R.drawable.pig);
                    aboutObjectTextView.setText(R.string.pig);
                    break;
                case 4:
                    imageObject.setImageResource(R.drawable.slime);
                    aboutObjectTextView.setText(R.string.slime);
                    break;
            }
        if (hero4.getFirstCell() != 0) {
            if (hero4.getSecondCell() != 0) {
                if (hero4.getThirdCell() != 0) {
                    if (hero4.getFourthCell() != 0) {
                        if (hero4.getFifthCell() != 0) {
                            aboutObjectTextView.setText(R.string.fullCell);
                            imageObject.setVisibility(View.INVISIBLE);
                        } else {
                            hero4.setFifthCell(random);
                        }
                    } else {
                        hero4.setFourthCell(random);
                    }
                } else {
                    hero4.setThirdCell(random);
                }
            } else {
                hero4.setSecondCell(random);
            }
        } else {
            hero4.setFirstCell(random);
        }
        }


    public void toFight(View view) {
        hero4.setNumberOfLevel(hero4.getNumberOfLevel()+1);
        hero4.setFirstTime(true);
        Intent intent = new Intent(this, FightActivity.class);
        intent.putExtra("hero", hero4);
        startActivity(intent);
    }
    public void Stats() {
        switch ((int) (Math.random() * 5 + 1)) {
            case 1:
                transTextView.setText("Ты получил усиление физ.атаки на 10%");
                hero4.setPhysickAtack(hero4.getPhysickAtack() + hero4.getPhysickAtack() / 10);
                break;
            case 2:
                transTextView.setText("Ты получил усиление физ.защиты на 10%");
                if (hero4.getPhysickArmor() == 100) {
                    Stats();
                }
                hero4.setPhysickArmor(hero4.getPhysickArmor() + hero4.getPhysickArmor() / 10);
                if (hero4.getPhysickArmor() > 100) {
                    hero4.setPhysickArmor(100);
                }
                break;
            case 3:
                transTextView.setText("Ты получил усиление маг.атаки на 10%");
                hero4.setMagickAtack(hero4.getMagickAtack() + hero4.getMagickAtack() / 10);
                break;
            case 4:
                transTextView.setText("Ты получил усиление маг.защиты на 10%");
                if (hero4.getMagickArmor() == 100) {
                    Stats();
                }
                hero4.setMagickArmor(hero4.getMagickArmor() + hero4.getMagickArmor() / 10);
                if (hero4.getMagickArmor() > 100) {
                    hero4.setMagickArmor(100);
                }
                break;
            case 5:
                transTextView.setText("Ты получил усиление здоровья на 10%");
                hero4.setMaxhealth(hero4.getMaxhealth() + hero4.getMaxhealth() / 10);
                hero4.setHealth(hero4.getHealth() + hero4.getHealth() / 10);
                break;
        }
        switch (hero4.getLevels()) {
            case 12:
                switch (hero4.getNumberOfLevel()) {
                    case 0:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        aboutLocationTextView.setText(R.string.ghostLocation);
                        break;
                    case 1:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        break;
                    case 2:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        break;
                    case 3:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        break;
                    case 4:
                        aboutLocationTextView.setText(R.string.wizardLocation);
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        break;
                    case 5:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        break;
                    case 6:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        break;
                    case 7:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        break;
                    case 8:
                        aboutLocationTextView.setText(R.string.robotLocation);
                        fonImageView.setImageResource(R.drawable.robotfon);
                        break;
                    case 9:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        break;
                    case 10:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        break;
                    case 11:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        break;
                    case 12:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        break;
                }
                break;
            case 21:
                switch (hero4.getNumberOfLevel()) {
                    case 0:
                        aboutLocationTextView.setText(R.string.wizardLocation);
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        break;
                    case 1:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        break;
                    case 2:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        break;
                    case 3:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        break;
                    case 4:
                        aboutLocationTextView.setText(R.string.ghostLocation);
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        break;
                    case 5:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        break;
                    case 6:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        break;
                    case 7:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        break;
                    case 8:
                        aboutLocationTextView.setText(R.string.robotLocation);
                        fonImageView.setImageResource(R.drawable.robotfon);
                        break;
                    case 9:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        break;
                    case 10:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        break;
                    case 11:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        break;
                    case 12:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        break;
                }
                break;
            case 13:
                switch (hero4.getNumberOfLevel()) {
                    case 0:
                        aboutLocationTextView.setText(R.string.ghostLocation);
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        break;
                    case 1:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        break;
                    case 2:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        break;
                    case 3:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        break;
                    case 4:
                        aboutLocationTextView.setText(R.string.robotLocation);
                        fonImageView.setImageResource(R.drawable.robotfon);
                        break;
                    case 5:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        break;
                    case 6:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        break;
                    case 7:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        break;
                    case 8:
                        aboutLocationTextView.setText(R.string.wizardLocation);
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        break;
                    case 9:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        break;
                    case 10:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        break;
                    case 11:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        break;
                    case 12:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        break;
                }
                break;
            case 31:
                switch (hero4.getNumberOfLevel()) {
                    case 0:
                        aboutLocationTextView.setText(R.string.robotLocation);
                        fonImageView.setImageResource(R.drawable.robotfon);
                        break;
                    case 1:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        break;
                    case 2:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        break;
                    case 3:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        break;
                    case 4:
                        aboutLocationTextView.setText(R.string.ghostLocation);
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        break;
                    case 5:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        break;
                    case 6:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        break;
                    case 7:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        break;
                    case 8:
                        aboutLocationTextView.setText(R.string.wizardLocation);
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        break;
                    case 9:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        break;
                    case 10:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        break;
                    case 11:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        break;
                    case 12:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        break;
                }
                break;
            case 23:
                switch (hero4.getNumberOfLevel()) {
                    case 0:
                        aboutLocationTextView.setText(R.string.robotLocation);
                        fonImageView.setImageResource(R.drawable.robotfon);
                        break;
                    case 1:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        break;
                    case 2:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        break;
                    case 3:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        break;
                    case 4:
                        aboutLocationTextView.setText(R.string.wizardLocation);
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        break;
                    case 5:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        break;
                    case 6:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        break;
                    case 7:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        break;
                    case 8:
                        aboutLocationTextView.setText(R.string.ghostLocation);
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        break;
                    case 9:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        break;
                    case 10:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        break;
                    case 11:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        break;
                    case 12:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        break;
                }
                break;
            case 32:
                switch (hero4.getNumberOfLevel()) {
                    case 0:
                        aboutLocationTextView.setText(R.string.wizardLocation);
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        break;
                    case 1:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        break;
                    case 2:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        break;
                    case 3:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        break;
                    case 4:
                        aboutLocationTextView.setText(R.string.robotLocation);
                        fonImageView.setImageResource(R.drawable.robotfon);
                        break;
                    case 5:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        break;
                    case 6:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        break;
                    case 7:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        break;
                    case 8:
                        aboutLocationTextView.setText(R.string.ghostLocation);
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        break;
                    case 9:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        break;
                    case 10:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        break;
                    case 11:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        break;
                    case 12:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        break;
                }
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
        hero4.StopFon();
        super.onDestroy();
    }
}