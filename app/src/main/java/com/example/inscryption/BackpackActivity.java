package com.example.inscryption;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class BackpackActivity extends AppCompatActivity {
    TextView hiTextView;
    Hero hero3;
    Enemy enemy1;
    Button useButton;
    ImageButton firstButton;
    ImageButton secondButton;
    ImageButton thirdButton;
    ImageButton fourthButton;
    ImageButton fifthButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backpack);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        hero3 = (Hero) getIntent().getSerializableExtra("hero");
        enemy1 = (Enemy) getIntent().getSerializableExtra("enemy");
        useButton = findViewById(R.id.useButton);
        hiTextView = findViewById(R.id.hiTextView);
        firstButton = findViewById(R.id.firstButton);
        secondButton = findViewById(R.id.secondButton);
        thirdButton = findViewById(R.id.thirdButton);
        fourthButton = findViewById(R.id.fourthButton);
        fifthButton = findViewById(R.id.fifthButton);

        hiTextView.setText(R.string.hiBackpack);

        useButton.setVisibility(View.INVISIBLE);
        useButton.setClickable(false);

        switch (hero3.getFirstCell()) {
            case 0:
                firstButton.setVisibility(View.INVISIBLE);
                firstButton.setClickable(false);
                break;
            case 1:
                firstButton.setImageResource(R.drawable.knife);
                firstButton.setVisibility(View.VISIBLE);
                firstButton.setClickable(true);
                break;
            case 2:
                firstButton.setImageResource(R.drawable.magickink);
                firstButton.setVisibility(View.VISIBLE);
                firstButton.setClickable(true);
                break;
            case 3:
                firstButton.setImageResource(R.drawable.pig);
                firstButton.setVisibility(View.VISIBLE);
                firstButton.setClickable(true);
                break;
            case 4:
                firstButton.setImageResource(R.drawable.slime);
                firstButton.setVisibility(View.VISIBLE);
                firstButton.setClickable(true);
                break;
        }
        switch (hero3.getSecondCell()) {
            case 0:
                secondButton.setVisibility(View.INVISIBLE);
                secondButton.setClickable(false);
                break;
            case 1:
                secondButton.setImageResource(R.drawable.knife);
                secondButton.setVisibility(View.VISIBLE);
                secondButton.setClickable(true);
                break;
            case 2:
                secondButton.setImageResource(R.drawable.magickink);
                secondButton.setVisibility(View.VISIBLE);
                secondButton.setClickable(true);
                break;
            case 3:
                secondButton.setImageResource(R.drawable.pig);
                secondButton.setVisibility(View.VISIBLE);
                secondButton.setClickable(true);
                break;
            case 4:
                secondButton.setImageResource(R.drawable.slime);
                secondButton.setVisibility(View.VISIBLE);
                secondButton.setClickable(true);
                break;
        }
        switch (hero3.getThirdCell()) {
            case 0:
                thirdButton.setVisibility(View.INVISIBLE);
                thirdButton.setClickable(false);
                break;
            case 1:
                thirdButton.setImageResource(R.drawable.knife);
                thirdButton.setVisibility(View.VISIBLE);
                thirdButton.setClickable(true);
                break;
            case 2:
                thirdButton.setImageResource(R.drawable.magickink);
                thirdButton.setVisibility(View.VISIBLE);
                thirdButton.setClickable(true);
                break;
            case 3:
                thirdButton.setImageResource(R.drawable.pig);
                thirdButton.setVisibility(View.VISIBLE);
                thirdButton.setClickable(true);
                break;
            case 4:
                thirdButton.setImageResource(R.drawable.slime);
                thirdButton.setVisibility(View.VISIBLE);
                thirdButton.setClickable(true);
                break;
        }
        switch (hero3.getFourthCell()) {
            case 0:
                fourthButton.setVisibility(View.INVISIBLE);
                fourthButton.setClickable(false);
                break;
            case 1:
                fourthButton.setImageResource(R.drawable.knife);
                fourthButton.setVisibility(View.VISIBLE);
                fourthButton.setClickable(true);
                break;
            case 2:
                fourthButton.setImageResource(R.drawable.magickink);
                fourthButton.setVisibility(View.VISIBLE);
                fourthButton.setClickable(true);
                break;
            case 3:
                fourthButton.setImageResource(R.drawable.pig);
                fourthButton.setVisibility(View.VISIBLE);
                fourthButton.setClickable(true);
                break;
            case 4:
                fourthButton.setImageResource(R.drawable.slime);
                fourthButton.setVisibility(View.VISIBLE);
                fourthButton.setClickable(true);
                break;
        }
        switch (hero3.getFifthCell()) {
            case 0:
                fifthButton.setVisibility(View.INVISIBLE);
                fifthButton.setClickable(false);
                break;
            case 1:
                fifthButton.setImageResource(R.drawable.knife);
                fifthButton.setVisibility(View.VISIBLE);
                fifthButton.setClickable(true);
                break;
            case 2:
                fifthButton.setImageResource(R.drawable.magickink);
                fifthButton.setVisibility(View.VISIBLE);
                fifthButton.setClickable(true);
                break;
            case 3:
                fifthButton.setImageResource(R.drawable.pig);
                fifthButton.setVisibility(View.VISIBLE);
                fifthButton.setClickable(true);
                break;
            case 4:
                fifthButton.setImageResource(R.drawable.slime);
                fifthButton.setVisibility(View.VISIBLE);
                fifthButton.setClickable(true);
                break;
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

    public void use(View view) {
        useButton.setVisibility(View.INVISIBLE);
        useButton.setClickable(false);
        switch (hero3.getSelectCell()) {
            case 1:
                switch (hero3.getFirstCell()) {
                    case 1:
                        hiTextView.setText(R.string.damageAded);
                        hiTextView.append((int)(30 - (30 * ((double)enemy1.getPhysickArmor() / 100))) + " ед. физ. урона");
                        enemy1.setHealth(enemy1.getHealth() - (int)(30 - (30 * ((double)enemy1.getPhysickArmor() / 100))));
                        break;
                    case 2:
                        hiTextView.setText(R.string.damageAded);
                        hiTextView.append((int)(30 - (30 * ((double)enemy1.getMagickArmor() / 100))) + " ед. маг. урона");
                        enemy1.setHealth(enemy1.getHealth() - (int)(30 - (30 * ((double)enemy1.getMagickArmor() / 100))));
                        break;
                    case 3:
                        hero3.setHealth(hero3.getHealth() + 30);
                        if (hero3.getHealth() > hero3.getMaxhealth()) {
                            hero3.setHealth(hero3.getMaxhealth());
                        }
                        break;
                    case 4:
                        switch ((int) (Math.random() * 5 + 1)) {
                            case 1:
                                hiTextView.setText(R.string.slimePAt);
                                hero3.setPhysickAtack(hero3.getPhysickAtack() + hero3.getPhysickAtack() / 10);
                                break;
                            case 2:
                                hiTextView.setText(R.string.slimePAr);
                                hero3.setPhysickArmor(hero3.getPhysickArmor() + hero3.getPhysickArmor() / 10);
                                break;
                            case 3:
                                hiTextView.setText(R.string.slimeMAt);
                                hero3.setMagickAtack(hero3.getMagickAtack() + hero3.getMagickAtack() / 10);
                                break;
                            case 4:
                                hiTextView.setText(R.string.slimeMAr);
                                hero3.setMagickArmor(hero3.getMagickArmor() + hero3.getMagickArmor() / 10);
                                break;
                            case 5:
                                hiTextView.setText(R.string.slimeHP);
                                hero3.setMaxhealth(hero3.getMaxhealth() + hero3.getMaxhealth() / 10);
                                hero3.setHealth(hero3.getHealth() + hero3.getHealth() / 10);
                                break;
                        }
                }
                First();
                hero3.setFirstCell(0);
                break;
            case 2:
                switch (hero3.getSecondCell()) {
                    case 1:
                        hiTextView.setText(R.string.damageAded);
                        hiTextView.append((int)(30 - (30 * ((double)enemy1.getPhysickArmor() / 100))) + " ед. физ. урона");
                        enemy1.setHealth(enemy1.getHealth() - (int)(30 - (30 * ((double)enemy1.getPhysickArmor() / 100))));
                        break;
                    case 2:
                        hiTextView.setText(R.string.damageAded);
                        hiTextView.append((int)(30 - (30 * ((double)enemy1.getMagickArmor() / 100))) + " ед. маг. урона");
                        enemy1.setHealth(enemy1.getHealth() - (int)(30 - (30 * ((double)enemy1.getMagickArmor() / 100))));
                        break;
                    case 3:
                        hero3.setHealth(hero3.getHealth() + 30);
                        if (hero3.getHealth() > hero3.getMaxhealth()) {
                            hero3.setHealth(hero3.getMaxhealth());
                        }
                        break;
                    case 4:
                        switch ((int) (Math.random() * 5 + 1)) {
                            case 1:
                                hiTextView.setText(R.string.slimePAt);
                                hero3.setPhysickAtack(hero3.getPhysickAtack() + hero3.getPhysickAtack() / 10);
                                break;
                            case 2:
                                hiTextView.setText(R.string.slimePAr);
                                hero3.setPhysickArmor(hero3.getPhysickArmor() + hero3.getPhysickArmor() / 10);
                                break;
                            case 3:
                                hiTextView.setText(R.string.slimeMAt);
                                hero3.setMagickAtack(hero3.getMagickAtack() + hero3.getMagickAtack() / 10);
                                break;
                            case 4:
                                hiTextView.setText(R.string.slimeMAr);
                                hero3.setMagickArmor(hero3.getMagickArmor() + hero3.getMagickArmor() / 10);
                                break;
                            case 5:
                                hiTextView.setText(R.string.slimeHP);
                                hero3.setMaxhealth(hero3.getMaxhealth() + hero3.getMaxhealth() / 10);
                                hero3.setHealth(hero3.getHealth() + hero3.getHealth() / 10);
                                break;
                        }
                }
                hero3.setSecondCell(0);
                Second();
                break;
            case 3:
                switch (hero3.getThirdCell()) {
                    case 1:
                        hiTextView.setText(R.string.damageAded);
                        hiTextView.append((int)(30 - (30 * ((double)enemy1.getPhysickArmor() / 100))) + " ед. физ. урона");
                        enemy1.setHealth(enemy1.getHealth() - (int)(30 - (30 * ((double)enemy1.getPhysickArmor() / 100))));
                        break;
                    case 2:
                        hiTextView.setText(R.string.damageAded);
                        hiTextView.append((int)(30 - (30 * ((double)enemy1.getMagickArmor() / 100))) + " ед. маг. урона");
                        enemy1.setHealth(enemy1.getHealth() - (int)(30 - (30 * ((double)enemy1.getMagickArmor() / 100))));
                        break;
                    case 3:
                        hero3.setHealth(hero3.getHealth() + 30);
                        if (hero3.getHealth() > hero3.getMaxhealth()) {
                            hero3.setHealth(hero3.getMaxhealth());
                        }
                        break;
                    case 4:
                        switch ((int) (Math.random() * 5 + 1)) {
                            case 1:
                                hiTextView.setText(R.string.slimePAt);
                                hero3.setPhysickAtack(hero3.getPhysickAtack() + hero3.getPhysickAtack() / 10);
                                break;
                            case 2:
                                hiTextView.setText(R.string.slimePAr);
                                hero3.setPhysickArmor(hero3.getPhysickArmor() + hero3.getPhysickArmor() / 10);
                                break;
                            case 3:
                                hiTextView.setText(R.string.slimeMAt);
                                hero3.setMagickAtack(hero3.getMagickAtack() + hero3.getMagickAtack() / 10);
                                break;
                            case 4:
                                hiTextView.setText(R.string.slimeMAr);
                                hero3.setMagickArmor(hero3.getMagickArmor() + hero3.getMagickArmor() / 10);
                                break;
                            case 5:
                                hiTextView.setText(R.string.slimeHP);
                                hero3.setMaxhealth(hero3.getMaxhealth() + hero3.getMaxhealth() / 10);
                                hero3.setHealth(hero3.getHealth() + hero3.getHealth() / 10);
                                break;
                        }
                }
                hero3.setThirdCell(0);
                Third();
                break;
            case 4:
                switch (hero3.getFourthCell()) {
                    case 1:
                        hiTextView.setText(R.string.damageAded);
                        hiTextView.append((int)(30 - (30 * ((double)enemy1.getPhysickArmor() / 100))) + " ед. физ. урона");
                        enemy1.setHealth(enemy1.getHealth() - (int)(30 - (30 * ((double)enemy1.getPhysickArmor() / 100))));
                        break;
                    case 2:
                        hiTextView.setText(R.string.damageAded);
                        hiTextView.append((int)(30 - (30 * ((double)enemy1.getMagickArmor() / 100))) + " ед. маг. урона");
                        enemy1.setHealth(enemy1.getHealth() - (int)(30 - (30 * ((double)enemy1.getMagickArmor() / 100))));
                        break;
                    case 3:
                        hero3.setHealth(hero3.getHealth() + 30);
                        if (hero3.getHealth() > hero3.getMaxhealth()) {
                            hero3.setHealth(hero3.getMaxhealth());
                        }
                        break;
                    case 4:
                        switch ((int) (Math.random() * 5 + 1)) {
                            case 1:
                                hiTextView.setText(R.string.slimePAt);
                                hero3.setPhysickAtack(hero3.getPhysickAtack() + hero3.getPhysickAtack() / 10);
                                break;
                            case 2:
                                hiTextView.setText(R.string.slimePAr);
                                hero3.setPhysickArmor(hero3.getPhysickArmor() + hero3.getPhysickArmor() / 10);
                                break;
                            case 3:
                                hiTextView.setText(R.string.slimeMAt);
                                hero3.setMagickAtack(hero3.getMagickAtack() + hero3.getMagickAtack() / 10);
                                break;
                            case 4:
                                hiTextView.setText(R.string.slimeMAr);
                                hero3.setMagickArmor(hero3.getMagickArmor() + hero3.getMagickArmor() / 10);
                                break;
                            case 5:
                                hiTextView.setText(R.string.slimeHP);
                                hero3.setMaxhealth(hero3.getMaxhealth() + hero3.getMaxhealth() / 10);
                                hero3.setHealth(hero3.getHealth() + hero3.getHealth() / 10);
                                break;
                        }
                }
                hero3.setFourthCell(0);
                Fourth();
                break;
            case 5:
                switch (hero3.getFifthCell()) {
                    case 1:
                        hiTextView.setText(R.string.damageAded);
                        hiTextView.append((int)(30 - (30 * ((double)enemy1.getPhysickArmor() / 100))) + " ед. физ. урона");
                        enemy1.setHealth(enemy1.getHealth() - (int)(30 - (30 * ((double)enemy1.getPhysickArmor() / 100))));
                        break;
                    case 2:
                        hiTextView.setText(R.string.damageAded);
                        hiTextView.append((int)(30 - (30 * ((double)enemy1.getMagickArmor() / 100))) + " ед. маг. урона");
                        enemy1.setHealth(enemy1.getHealth() - (int)(30 - (30 * ((double)enemy1.getMagickArmor() / 100))));
                        break;
                    case 3:
                        hero3.setHealth(hero3.getHealth() + 30);
                        if (hero3.getHealth() > hero3.getMaxhealth()) {
                            hero3.setHealth(hero3.getMaxhealth());
                        }
                        break;
                    case 4:
                        switch ((int) (Math.random() * 5 + 1)) {
                            case 1:
                                hiTextView.setText(R.string.slimePAt);
                                hero3.setPhysickAtack(hero3.getPhysickAtack() + hero3.getPhysickAtack() / 10);
                                break;
                            case 2:
                                hiTextView.setText(R.string.slimePAr);
                                hero3.setPhysickArmor(hero3.getPhysickArmor() + hero3.getPhysickArmor() / 10);
                                break;
                            case 3:
                                hiTextView.setText(R.string.slimeMAt);
                                hero3.setMagickAtack(hero3.getMagickAtack() + hero3.getMagickAtack() / 10);
                                break;
                            case 4:
                                hiTextView.setText(R.string.slimeMAr);
                                hero3.setMagickArmor(hero3.getMagickArmor() + hero3.getMagickArmor() / 10);
                                break;
                            case 5:
                                hiTextView.setText(R.string.slimeHP);
                                hero3.setMaxhealth(hero3.getMaxhealth() + hero3.getMaxhealth() / 10);
                                hero3.setHealth(hero3.getHealth() + hero3.getHealth() / 10);
                                break;
                        }
                }
                hero3.setFifthCell(0);
                Fifth();
                break;
        }
    }
    public void First() {
        firstButton.setClickable(false);
        firstButton.setVisibility(View.INVISIBLE);
    }
    public void Second() {
        secondButton.setClickable(false);
        secondButton.setVisibility(View.INVISIBLE);
    }
    public void Third() {
        thirdButton.setClickable(false);
        thirdButton.setVisibility(View.INVISIBLE);
    }
    public void Fourth() {
        fourthButton.setClickable(false);
        fourthButton.setVisibility(View.INVISIBLE);
    }
    public void Fifth() {
        fifthButton.setClickable(false);
        fifthButton.setVisibility(View.INVISIBLE);
    }

    public void first(View view) {
        hero3.setSelectCell(1);
        switch (hero3.getFirstCell()) {
            case 1:
                hiTextView.setText(R.string.knife);
                break;
            case 2:
                hiTextView.setText(R.string.magickInk);
                break;
            case 3:
                hiTextView.setText(R.string.pig);
                break;
            case 4:
                hiTextView.setText(R.string.slime);
                break;
        }
        useButton.setVisibility(View.VISIBLE);
        useButton.setClickable(true);
    }

    public void second(View view) {
        hero3.setSelectCell(2);
        switch (hero3.getSecondCell()) {
            case 1:
                hiTextView.setText(R.string.knife);
                break;
            case 2:
                hiTextView.setText(R.string.magickInk);
                break;
            case 3:
                hiTextView.setText(R.string.pig);
                break;
            case 4:
                hiTextView.setText(R.string.slime);
                break;
        }
        useButton.setVisibility(View.VISIBLE);
        useButton.setClickable(true);
    }

    public void third(View view) {
        hero3.setSelectCell(3);
        switch (hero3.getThirdCell()) {
            case 1:
                hiTextView.setText(R.string.knife);
                break;
            case 2:
                hiTextView.setText(R.string.magickInk);
                break;
            case 3:
                hiTextView.setText(R.string.pig);
                break;
            case 4:
                hiTextView.setText(R.string.slime);
                break;
        }
        useButton.setVisibility(View.VISIBLE);
        useButton.setClickable(true);
    }

    public void fourth(View view) {
        hero3.setSelectCell(4);
        switch (hero3.getFourthCell()) {
            case 1:
                hiTextView.setText(R.string.knife);
                break;
            case 2:
                hiTextView.setText(R.string.magickInk);
                break;
            case 3:
                hiTextView.setText(R.string.pig);
                break;
            case 4:
                hiTextView.setText(R.string.slime);
                break;
        }
        useButton.setVisibility(View.VISIBLE);
        useButton.setClickable(true);
    }

    public void fifth(View view) {
        hero3.setSelectCell(5);
        switch (hero3.getFifthCell()) {
            case 1:
                hiTextView.setText(R.string.knife);
                break;
            case 2:
                hiTextView.setText(R.string.magickInk);
                break;
            case 3:
                hiTextView.setText(R.string.pig);
                break;
            case 4:
                hiTextView.setText(R.string.slime);
                break;
        }
        useButton.setVisibility(View.VISIBLE);
        useButton.setClickable(true);
    }
}