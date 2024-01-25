package com.example.inscryption;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class FightActivity extends AppCompatActivity {
    Hero hero5;

    TextView infoFightTextView;
    TextView statsEnemyTextView;
    TextView statsMeTextView;
    Enemy enemy;
    Button endTurnButton;
    Button chooseAttackAndArmorButton;
    Button backpackbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        hero5 = (Hero) getIntent().getSerializableExtra("hero");

        infoFightTextView = findViewById(R.id.infoFightTextView);
        statsEnemyTextView = findViewById(R.id.statsEnemyTextView);
        statsMeTextView = findViewById(R.id.statsMeTextView);
        endTurnButton = findViewById(R.id.endTurnButton);
        chooseAttackAndArmorButton = findViewById(R.id.chooseAttackAndArmorButton);
        backpackbutton = findViewById(R.id.backpackbutton);

        if (getIntent().getSerializableExtra("enemy") != null) {
            enemy = (Enemy) getIntent().getSerializableExtra("enemy");
        } else {
            enemy = new Enemy();
        }
        if (hero5.isFirstTime()) {
            infoFightTextView.setText(R.string.enemyWizard);
            switch (hero5.getNumberOfLevel()) {
                case 1:
                    enemy.setHealth((int)(Math.random()*10+1));
                    enemy.setPhysickAtack((int)(Math.random()*5+5));
                    enemy.setPhysickArmor(0);
                    enemy.setMagickAtack((int)(Math.random()*5+5));
                    enemy.setMagickArmor(0);
                    break;
                case 2:
                    enemy.setHealth((int)(Math.random()*10+10));
                    enemy.setPhysickAtack((int)(Math.random()*5+5));
                    enemy.setPhysickArmor(0);
                    enemy.setMagickAtack((int)(Math.random()*5+5));
                    enemy.setMagickArmor(0);
                    break;
                case 3:
                    enemy.setHealth((int)(Math.random()*10+20));
                    enemy.setPhysickAtack((int)(Math.random()*5+10));
                    enemy.setPhysickArmor((int)(Math.random()*5+5));
                    enemy.setMagickAtack((int)(Math.random()*5+10));
                    enemy.setMagickArmor((int)(Math.random()*5+5));
                    break;
                case 4:
                    enemy.setHealth((int)(Math.random()*10+30));
                    enemy.setPhysickAtack((int)(Math.random()*5+10));
                    enemy.setPhysickArmor((int)(Math.random()*5+5));
                    enemy.setMagickAtack((int)(Math.random()*5+10));
                    enemy.setMagickArmor((int)(Math.random()*5+5));
                    break;
                case 5:
                    enemy.setHealth((int)(Math.random()*10+50));
                    enemy.setPhysickAtack((int)(Math.random()*5+10));
                    enemy.setPhysickArmor((int)(Math.random()*5+5));
                    enemy.setMagickAtack((int)(Math.random()*5+10));
                    enemy.setMagickArmor((int)(Math.random()*5+5));
                    break;
                case 6:
                    enemy.setHealth((int)(Math.random()*10+60));
                    enemy.setPhysickAtack((int)(Math.random()*5+15));
                    enemy.setPhysickArmor((int)(Math.random()*5+15));
                    enemy.setMagickAtack((int)(Math.random()*5+15));
                    enemy.setMagickArmor((int)(Math.random()*5+15));
                    break;
                case 7:
                    enemy.setHealth((int)(Math.random()*10+70));
                    enemy.setPhysickAtack((int)(Math.random()*5+15));
                    enemy.setPhysickArmor((int)(Math.random()*5+15));
                    enemy.setMagickAtack((int)(Math.random()*5+15));
                    enemy.setMagickArmor((int)(Math.random()*5+15));
                    break;
                case 8:
                    enemy.setHealth((int)(Math.random()*10+80));
                    enemy.setPhysickAtack((int)(Math.random()*5+15));
                    enemy.setPhysickArmor((int)(Math.random()*5+15));
                    enemy.setMagickAtack((int)(Math.random()*5+15));
                    enemy.setMagickArmor((int)(Math.random()*5+15));
                    break;
                case 9:
                    enemy.setHealth((int)(Math.random()*10+90));
                    enemy.setPhysickAtack((int)(Math.random()*5+20));
                    enemy.setPhysickArmor((int)(Math.random()*5+20));
                    enemy.setMagickAtack((int)(Math.random()*5+20));
                    enemy.setMagickArmor(((int)(Math.random()*5+20)));
                    break;
                case 10:
                    enemy.setHealth(150);
                    enemy.setPhysickAtack(30);
                    enemy.setPhysickArmor(50);
                    enemy.setMagickAtack(30);
                    enemy.setMagickArmor(50);
                    break;
            }
        }
        Text();
    }

    public void chooseAttackAndArmor(View view) {
        hero5.setFirstTime(false);
        Intent intent = new Intent(this, AtackAndArmorActivity.class);
        intent.putExtra("enemy",enemy);
        intent.putExtra("hero", hero5);
        startActivity(intent);
    }

    public void toBackpack(View view) {
        hero5.setFirstTime(false);
        Intent intent = new Intent(this, BackpackActivity.class);
        intent.putExtra("enemy",enemy);
        intent.putExtra("hero", hero5);
        startActivity(intent);
    }

    public void endTurn(View view) {
        switch ((int)(Math.random()*2+1)) {
            case 1:
                if (hero5.getAttack() == 1) {
                    infoFightTextView.setText("Вы нанесли врагу: " + (int)(hero5.getPhysickAtack() - (double)hero5.getPhysickAtack() * ((double)enemy.getPhysickArmor() / 100)) + " физ. урона.");
                    enemy.setHealth(enemy.getHealth() - (int)(hero5.getPhysickAtack() - (double)hero5.getPhysickAtack() * ((double)enemy.getPhysickArmor() / 100)));
                } else  if (hero5.getAttack() == 2){
                    infoFightTextView.setText("Вы нанесли врагу: " + hero5.getMagickAtack() + " маг. урона.");
                    enemy.setHealth(enemy.getHealth() - hero5.getMagickAtack());
                }
                break;
            case 2:
                if (hero5.getAttack() == 2) {
                    infoFightTextView.setText("Вы нанесли врагу: " + (int)(hero5.getMagickAtack() - (double)hero5.getMagickAtack() * ((double)enemy.getMagickArmor() / 100)) + " маг. урона");
                    enemy.setHealth(enemy.getHealth() - (int)(hero5.getMagickAtack() - (double)hero5.getMagickAtack() * ((double)enemy.getMagickArmor() / 100)));
                } else if (hero5.getAttack() == 1){
                    infoFightTextView.setText("Вы нанесли врагу: " + hero5.getPhysickAtack() + " физ. урона");
                    enemy.setHealth(enemy.getHealth() - hero5.getPhysickAtack());
                }
                break;
        }
        if (enemy.getHealth() >0) {
            switch ((int) (Math.random() * 2 + 1)) {
                case 1:
                    if (hero5.getArmor() == 1) {
                        infoFightTextView.append("Враг нанес вам: " + (int) (enemy.getPhysickAtack() - ((double) enemy.getPhysickAtack() * ((double) hero5.getPhysickArmor() / 100))) + " физ. урона; ");
                        hero5.setHealth(hero5.getHealth() - (int) (enemy.getPhysickAtack() - ((double) enemy.getPhysickAtack() * ((double) hero5.getPhysickArmor() / 100))));
                    } else {
                        infoFightTextView.append("Враг нанес вам: " + enemy.getPhysickAtack() + " физ. урона; ");
                        hero5.setHealth(hero5.getHealth() - enemy.getPhysickAtack());
                    }
                    break;
                case 2:
                    if (hero5.getArmor() == 2) {
                        infoFightTextView.append("Враг нанес вам: " + (int) (enemy.getMagickAtack() - ((double) enemy.getMagickAtack() * ((double) hero5.getMagickArmor() / 100))) + " маг. урона; ");
                        hero5.setHealth(hero5.getHealth() - (int) (enemy.getMagickAtack() - ((double) enemy.getMagickAtack() * ((double) hero5.getMagickArmor() / 100))));
                    } else {
                        infoFightTextView.append("Враг нанес вам: " + enemy.getMagickAtack() + " маг. урона; ");
                        hero5.setHealth(hero5.getHealth() - enemy.getMagickAtack());
                    }
                    break;
            }
        }
        hero5.setAttack(0);
        hero5.setArmor(0);
        if (hero5.isLast()) {
            hero5.setLast(false);
            Intent intent = new Intent(this, TransActivity.class);
            intent.putExtra("hero", hero5);
            startActivity(intent);
            endTurnButton.setText("Закончить ход.");
            backpackbutton.setClickable(true);
            chooseAttackAndArmorButton.setClickable(true);
        }
        Last();
        Text();
    }
    private void Text() {
            statsEnemyTextView.setText("Здоровье: " + enemy.getHealth() + "; Физ. атака: " + enemy.getPhysickAtack() + "; Физ. защита: -" + enemy.getPhysickArmor() + "%; Маг. атака: " + enemy.getMagickAtack() + "; Маг. защита: -" + enemy.getMagickArmor() + "%.");
            statsMeTextView.setText("Здоровье: " + hero5.getHealth() + "/" + hero5.getMaxhealth() + "; Физ. атака: " + hero5.getPhysickAtack() + "; Физ. защита: -" + hero5.getPhysickArmor() + "%; Маг. атака: " + hero5.getMagickAtack() + "; Маг. защита: -" + hero5.getMagickArmor() + "%.");
    }
    private void Last() {
        if (enemy.getHealth() <= 0) {
            hero5.setLast(true);
            infoFightTextView.setText(R.string.last);
            endTurnButton.setText("Далее");
            backpackbutton.setClickable(false);
            chooseAttackAndArmorButton.setClickable(false);
        }
    }
}
