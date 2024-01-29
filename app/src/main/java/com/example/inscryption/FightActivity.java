package com.example.inscryption;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class FightActivity extends AppCompatActivity {
    Hero hero5;

    TextView infoFightTextView;
    TextView statsEnemyTextView;
    TextView statsMeTextView;
    Enemy enemy;
    ImageButton endTurnButton;
    ImageButton chooseAttackAndArmorButton;
    ImageButton backpackbutton;
    ImageView enemyImageView;
    ImageView fonImageView;

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
        enemyImageView = findViewById(R.id.enemyImageView);
        fonImageView = findViewById(R.id.fonimageView);

        if (hero5.isIs1Fon()) {
            hero5.StopFon();
            hero5.setIs1Fon(false);
        }
        if (getIntent().getSerializableExtra("enemy") != null) {
            enemy = (Enemy) getIntent().getSerializableExtra("enemy");
        } else {
            enemy = new Enemy();
        }
        if (hero5.isFirstTime()) {
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
                    enemy.setPhysickAtack((int)(Math.random()*5+5));
                    enemy.setPhysickArmor(0);
                    enemy.setMagickAtack((int)(Math.random()*5+5));
                    enemy.setMagickArmor(0);
                    break;
                case 4:
                    enemy.setHealth((int)(Math.random()*10+30));
                    enemy.setPhysickAtack((int)(Math.random()*5+10));
                    enemy.setPhysickArmor((int)(Math.random()*5+5));
                    enemy.setMagickAtack((int)(Math.random()*5+10));
                    enemy.setMagickArmor((int)(Math.random()*5+5));
                    break;
                case 5:
                    enemy.setHealth((int)(Math.random()*10+40));
                    enemy.setPhysickAtack((int)(Math.random()*5+10));
                    enemy.setPhysickArmor((int)(Math.random()*5+5));
                    enemy.setMagickAtack((int)(Math.random()*5+10));
                    enemy.setMagickArmor((int)(Math.random()*5+5));
                    break;
                case 6:
                    enemy.setHealth((int)(Math.random()*10+50));
                    enemy.setPhysickAtack((int)(Math.random()*5+10));
                    enemy.setPhysickArmor((int)(Math.random()*5+5));
                    enemy.setMagickAtack((int)(Math.random()*5+10));
                    enemy.setMagickArmor((int)(Math.random()*5+5));
                    break;
                case 7:
                    enemy.setHealth((int)(Math.random()*10+60));
                    enemy.setPhysickAtack((int)(Math.random()*5+10));
                    enemy.setPhysickArmor((int)(Math.random()*5+5));
                    enemy.setMagickAtack((int)(Math.random()*5+10));
                    enemy.setMagickArmor((int)(Math.random()*5+5));
                    break;
                case 8:
                    enemy.setHealth((int)(Math.random()*10+70));
                    enemy.setPhysickAtack((int)(Math.random()*5+15));
                    enemy.setPhysickArmor((int)(Math.random()*5+15));
                    enemy.setMagickAtack((int)(Math.random()*5+15));
                    enemy.setMagickArmor((int)(Math.random()*5+15));
                    break;
                case 9:
                    enemy.setHealth((int)(Math.random()*10+80));
                    enemy.setPhysickAtack((int)(Math.random()*5+15));
                    enemy.setPhysickArmor((int)(Math.random()*5+15));
                    enemy.setMagickAtack((int)(Math.random()*5+15));
                    enemy.setMagickArmor((int)(Math.random()*5+15));
                    break;
                case 10:
                    enemy.setHealth((int)(Math.random()*10+90));
                    enemy.setPhysickAtack((int)(Math.random()*5+15));
                    enemy.setPhysickArmor((int)(Math.random()*5+15));
                    enemy.setMagickAtack((int)(Math.random()*5+15));
                    enemy.setMagickArmor((int)(Math.random()*5+15));
                    break;
                case 11:
                    enemy.setHealth((int)(Math.random()*10+100));
                    enemy.setPhysickAtack((int)(Math.random()*5+20));
                    enemy.setPhysickArmor((int)(Math.random()*5+20));
                    enemy.setMagickAtack((int)(Math.random()*5+20));
                    enemy.setMagickArmor(((int)(Math.random()*5+20)));
                    break;
                case 12:
                    enemy.setHealth(150);
                    enemy.setPhysickAtack(30);
                    enemy.setPhysickArmor(50);
                    enemy.setMagickAtack(30);
                    enemy.setMagickArmor(50);
                    break;
            }
            switch (hero5.getLevels()) {
                case 12:
                    switch (hero5.getNumberOfLevel()) {
                        case 1:
                            hero5.Fon(this,R.raw.ghostfon);
                            break;
                        case 5:
                            hero5.StopFon();
                            hero5.Fon(this,R.raw.wizardfon);
                            break;
                        case 9:
                            hero5.StopFon();
                            hero5.Fon(this,R.raw.robotfon);
                            break;
                    }
                    break;
                case 21:
                    switch (hero5.getNumberOfLevel()) {
                        case 1:
                            hero5.Fon(this,R.raw.wizardfon);
                            break;
                        case 5:
                            hero5.StopFon();
                            hero5.Fon(this,R.raw.ghostfon);
                            break;
                        case 9:
                            hero5.StopFon();
                            hero5.Fon(this,R.raw.robotfon);
                            break;
                    }
                    break;
                case 13:
                    switch (hero5.getNumberOfLevel()) {
                        case 1:
                            hero5.Fon(this,R.raw.ghostfon);
                            break;
                        case 5:
                            hero5.StopFon();
                            hero5.Fon(this,R.raw.robotfon);
                            break;
                        case 9:
                            hero5.StopFon();
                            hero5.Fon(this,R.raw.wizardfon);
                            break;
                    }
                    break;
                case 31:
                    switch (hero5.getNumberOfLevel()) {
                        case 1:
                            hero5.Fon(this,R.raw.robotfon);
                            break;
                        case 5:
                            hero5.StopFon();
                            hero5.Fon(this,R.raw.ghostfon);
                            break;
                        case 9:
                            hero5.StopFon();
                            hero5.Fon(this,R.raw.wizardfon);
                            break;
                    }
                    break;
                case 23:
                    switch (hero5.getNumberOfLevel()) {
                        case 1:
                            hero5.Fon(this,R.raw.robotfon);
                            break;
                        case 5:
                            hero5.StopFon();
                            hero5.Fon(this,R.raw.wizardfon);
                            break;
                        case 9:
                            hero5.StopFon();
                            hero5.Fon(this,R.raw.ghostfon);
                            break;
                    }
                    break;
                case 32:
                    switch (hero5.getNumberOfLevel()) {
                        case 1:
                            hero5.Fon(this,R.raw.wizardfon);
                            break;
                        case 5:
                            hero5.StopFon();
                            hero5.Fon(this,R.raw.robotfon);
                            break;
                        case 9:
                            hero5.StopFon();
                            hero5.Fon(this,R.raw.ghostfon);
                            break;
                    }
                    break;
            }
        }
        switch (hero5.getLevels()) {
            case 12:
                switch (hero5.getNumberOfLevel()) {
                    case 1:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        infoFightTextView.setText(R.string.ghostdogToBot);
                        enemyImageView.setImageResource(R.drawable.ghostdog2);
                        break;
                    case 2:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        enemyImageView.setImageResource(R.drawable.ghostpirate);
                        infoFightTextView.setText(R.string.ghostPirateToBot);
                        break;
                    case 3:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        enemyImageView.setImageResource(R.drawable.gravedigger1);
                        infoFightTextView.setText(R.string.graveDiggerToBot);
                        break;
                    case 4:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        enemyImageView.setImageResource(R.drawable.grimora1);
                        infoFightTextView.setText(R.string.grimoraToBot);
                        break;
                    case 5:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        enemyImageView.setImageResource(R.drawable.black_wizard);
                        infoFightTextView.setText(R.string.blackWizardToBot);
                        break;
                    case 6:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        enemyImageView.setImageResource(R.drawable.spearwizard1);
                        infoFightTextView.setText(R.string.spearWizardToBot);
                        break;
                    case 7:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        enemyImageView.setImageResource(R.drawable.gadalka);
                        infoFightTextView.setText(R.string.gadalkaToBot);
                        break;
                    case 8:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        enemyImageView.setImageResource(R.drawable.magnificus1);
                        infoFightTextView.setText(R.string.magnificusToBot);
                        break;
                    case 9:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        enemyImageView.setImageResource(R.drawable.inspector1);
                        infoFightTextView.setText(R.string.inspectorToBot);
                        break;
                    case 10:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        enemyImageView.setImageResource(R.drawable.smelter1);
                        infoFightTextView.setText(R.string.smelterToBot);
                        break;
                    case 11:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        enemyImageView.setImageResource(R.drawable.mechanic1);
                        infoFightTextView.setText(R.string.mechanicToBot);
                        break;
                    case 12:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        enemyImageView.setImageResource(R.drawable.po31);
                        infoFightTextView.setText(R.string.PO3ToBot);
                        break;
                }
                break;
            case 21:
                switch (hero5.getNumberOfLevel()) {
                    case 1:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        enemyImageView.setImageResource(R.drawable.black_wizard);
                        infoFightTextView.setText(R.string.blackWizardToBot);
                        break;
                    case 2:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        enemyImageView.setImageResource(R.drawable.spearwizard1);
                        infoFightTextView.setText(R.string.spearWizardToBot);
                        break;
                    case 3:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        enemyImageView.setImageResource(R.drawable.gadalka);
                        infoFightTextView.setText(R.string.gadalkaToBot);
                        break;
                    case 4:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        enemyImageView.setImageResource(R.drawable.magnificus1);
                        infoFightTextView.setText(R.string.magnificusToBot);
                        break;
                    case 5:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        enemyImageView.setImageResource(R.drawable.ghostdog1);
                        infoFightTextView.setText(R.string.ghostdogToBot);
                        break;
                    case 6:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        enemyImageView.setImageResource(R.drawable.ghostpirate);
                        infoFightTextView.setText(R.string.ghostPirateToBot);
                        break;
                    case 7:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        enemyImageView.setImageResource(R.drawable.gravedigger1);
                        infoFightTextView.setText(R.string.graveDiggerToBot);
                        break;
                    case 8:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        enemyImageView.setImageResource(R.drawable.grimora1);
                        infoFightTextView.setText(R.string.grimoraToBot);
                        break;
                    case 9:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        enemyImageView.setImageResource(R.drawable.inspector1);
                        infoFightTextView.setText(R.string.inspectorToBot);
                        break;
                    case 10:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        enemyImageView.setImageResource(R.drawable.smelter1);
                        infoFightTextView.setText(R.string.smelterToBot);
                        break;
                    case 11:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        enemyImageView.setImageResource(R.drawable.mechanic1);
                        infoFightTextView.setText(R.string.mechanicToBot);
                        break;
                    case 12:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        enemyImageView.setImageResource(R.drawable.po31);
                        infoFightTextView.setText(R.string.PO3ToBot);
                        break;
                }
                break;
            case 13:
                switch (hero5.getNumberOfLevel()) {
                    case 1:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        enemyImageView.setImageResource(R.drawable.ghostdog1);
                        infoFightTextView.setText(R.string.ghostdogTowizard);
                        break;
                    case 2:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        enemyImageView.setImageResource(R.drawable.ghostpirate);
                        infoFightTextView.setText(R.string.ghostPirateTowizard);
                        break;
                    case 3:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        enemyImageView.setImageResource(R.drawable.gravedigger1);
                        infoFightTextView.setText(R.string.graveDiggerTowizard);
                        break;
                    case 4:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        enemyImageView.setImageResource(R.drawable.grimora1);
                        infoFightTextView.setText(R.string.grimoraTowizard);
                        break;
                    case 5:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        enemyImageView.setImageResource(R.drawable.inspector1);
                        infoFightTextView.setText(R.string.inspectorTowizard);
                        break;
                    case 6:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        enemyImageView.setImageResource(R.drawable.smelter1);
                        infoFightTextView.setText(R.string.smelterTowizard);
                        break;
                    case 7:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        enemyImageView.setImageResource(R.drawable.mechanic1);
                        infoFightTextView.setText(R.string.mechanicTowizard);
                        break;
                    case 8:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        enemyImageView.setImageResource(R.drawable.po31);
                        infoFightTextView.setText(R.string.PO3Towizard);
                        break;
                    case 9:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        enemyImageView.setImageResource(R.drawable.black_wizard);
                        infoFightTextView.setText(R.string.blackWizardTowizard);
                        break;
                    case 10:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        enemyImageView.setImageResource(R.drawable.spearwizard1);
                        infoFightTextView.setText(R.string.spearWizardTowizard);
                        break;
                    case 11:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        enemyImageView.setImageResource(R.drawable.gadalka);
                        infoFightTextView.setText(R.string.gadalkaTowizard);
                        break;
                    case 12:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        enemyImageView.setImageResource(R.drawable.magnificus1);
                        infoFightTextView.setText(R.string.magnificusTowizard);
                        break;
                }
                break;
            case 31:
                switch (hero5.getNumberOfLevel()) {
                    case 1:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        enemyImageView.setImageResource(R.drawable.inspector1);
                        infoFightTextView.setText(R.string.inspectorTowizard);
                        break;
                    case 2:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        enemyImageView.setImageResource(R.drawable.smelter1);
                        infoFightTextView.setText(R.string.smelterTowizard);
                        break;
                    case 3:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        enemyImageView.setImageResource(R.drawable.mechanic1);
                        infoFightTextView.setText(R.string.mechanicTowizard);
                        break;
                    case 4:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        enemyImageView.setImageResource(R.drawable.po31);
                        infoFightTextView.setText(R.string.PO3Towizard);
                        break;
                    case 5:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        enemyImageView.setImageResource(R.drawable.ghostdog1);
                        infoFightTextView.setText(R.string.ghostdogTowizard);
                        break;
                    case 6:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        enemyImageView.setImageResource(R.drawable.ghostpirate);
                        infoFightTextView.setText(R.string.ghostPirateTowizard);
                        break;
                    case 7:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        enemyImageView.setImageResource(R.drawable.gravedigger1);
                        infoFightTextView.setText(R.string.graveDiggerTowizard);
                        break;
                    case 8:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        enemyImageView.setImageResource(R.drawable.grimora1);
                        infoFightTextView.setText(R.string.grimoraTowizard);
                        break;
                    case 9:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        enemyImageView.setImageResource(R.drawable.black_wizard);
                        infoFightTextView.setText(R.string.blackWizardTowizard);
                        break;
                    case 10:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        enemyImageView.setImageResource(R.drawable.spearwizard1);
                        infoFightTextView.setText(R.string.spearWizardTowizard);
                        break;
                    case 11:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        enemyImageView.setImageResource(R.drawable.gadalka);
                        infoFightTextView.setText(R.string.gadalkaTowizard);
                        break;
                    case 12:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        enemyImageView.setImageResource(R.drawable.magnificus1);
                        infoFightTextView.setText(R.string.magnificusTowizard);
                        break;
                }
                break;
            case 23:
                switch (hero5.getNumberOfLevel()) {
                    case 1:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        enemyImageView.setImageResource(R.drawable.inspector1);
                        infoFightTextView.setText(R.string.inspectorToghost);
                        break;
                    case 2:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        enemyImageView.setImageResource(R.drawable.smelter1);
                        infoFightTextView.setText(R.string.smelteraToghost);
                        break;
                    case 3:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        enemyImageView.setImageResource(R.drawable.mechanic1);
                        infoFightTextView.setText(R.string.mechanicToghost);
                        break;
                    case 4:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        enemyImageView.setImageResource(R.drawable.po31);
                        infoFightTextView.setText(R.string.PO3Toghost);
                        break;
                    case 5:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        enemyImageView.setImageResource(R.drawable.black_wizard);
                        infoFightTextView.setText(R.string.blackWizardToghost);
                        break;
                    case 6:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        enemyImageView.setImageResource(R.drawable.spearwizard1);
                        infoFightTextView.setText(R.string.spearWizardToghost);
                        break;
                    case 7:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        enemyImageView.setImageResource(R.drawable.gadalka);
                        infoFightTextView.setText(R.string.gadalkaToghost);
                        break;
                    case 8:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        enemyImageView.setImageResource(R.drawable.magnificus1);
                        infoFightTextView.setText(R.string.magnificusToghost);
                        break;
                    case 9:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        enemyImageView.setImageResource(R.drawable.ghostdog1);
                        infoFightTextView.setText(R.string.ghostdogToghost);
                        break;
                    case 10:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        enemyImageView.setImageResource(R.drawable.ghostpirate);
                        infoFightTextView.setText(R.string.ghostPirateToghost);
                        break;
                    case 11:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        enemyImageView.setImageResource(R.drawable.gravedigger1);
                        infoFightTextView.setText(R.string.graveDiggerToghost);
                        break;
                    case 12:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        enemyImageView.setImageResource(R.drawable.grimora1);
                        infoFightTextView.setText(R.string.grimoraToghost);
                        break;
                }
                break;
            case 32:
                switch (hero5.getNumberOfLevel()) {
                    case 1:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        enemyImageView.setImageResource(R.drawable.black_wizard);
                        infoFightTextView.setText(R.string.blackWizardToghost);
                        break;
                    case 2:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        enemyImageView.setImageResource(R.drawable.spearwizard1);
                        infoFightTextView.setText(R.string.spearWizardToghost);
                        break;
                    case 3:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        enemyImageView.setImageResource(R.drawable.gadalka);
                        infoFightTextView.setText(R.string.gadalkaToghost);
                        break;
                    case 4:
                        fonImageView.setImageResource(R.drawable.wizardfon);
                        enemyImageView.setImageResource(R.drawable.magnificus1);
                        infoFightTextView.setText(R.string.magnificusToghost);
                        break;
                    case 5:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        enemyImageView.setImageResource(R.drawable.inspector1);
                        infoFightTextView.setText(R.string.inspectorToghost);
                        break;
                    case 6:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        enemyImageView.setImageResource(R.drawable.smelter1);
                        infoFightTextView.setText(R.string.smelteraToghost);
                        break;
                    case 7:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        enemyImageView.setImageResource(R.drawable.mechanic1);
                        infoFightTextView.setText(R.string.mechanicToghost);
                        break;
                    case 8:
                        fonImageView.setImageResource(R.drawable.robotfon);
                        enemyImageView.setImageResource(R.drawable.po31);
                        infoFightTextView.setText(R.string.PO3Toghost);
                        break;
                    case 9:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        enemyImageView.setImageResource(R.drawable.ghostdog1);
                        infoFightTextView.setText(R.string.ghostdogToghost);
                        break;
                    case 10:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        enemyImageView.setImageResource(R.drawable.ghostpirate);
                        infoFightTextView.setText(R.string.ghostPirateToghost);
                        break;
                    case 11:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        enemyImageView.setImageResource(R.drawable.gravedigger1);
                        infoFightTextView.setText(R.string.graveDiggerToghost);
                        break;
                    case 12:
                        fonImageView.setImageResource(R.drawable.ghostfon);
                        enemyImageView.setImageResource(R.drawable.grimora1);
                        infoFightTextView.setText(R.string.grimoraToghost);
                        break;
                }
                break;
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
        infoFightTextView.setText("");
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
        if (hero5.getHealth() <= 0) {
            Intent intent = new Intent(this, OverActivity.class);
            intent.putExtra("hero", hero5);
            startActivity(intent);
        }
        hero5.setAttack(0);
        hero5.setArmor(0);
        if (hero5.isLast()) {
            hero5.setLast(false);
            Intent intent = new Intent(this, TransActivity.class);
            intent.putExtra("hero", hero5);
            startActivity(intent);
            backpackbutton.setClickable(true);
            chooseAttackAndArmorButton.setClickable(true);
        }
        Last();
        Text();
        switch (hero5.getLevels()) {
            case 12:
                switch (hero5.getNumberOfLevel()) {
                    case 1:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.ghostdog2);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.ghostdog1);
                                break;
                        }
                        break;
                    case 3:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.gravedigger1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.gravedigger2);
                                break;
                        }
                        break;
                    case 4:
                        switch ((int)(Math.random() * 3+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.grimora1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.grimora2);
                                break;
                            case 3:
                                enemyImageView.setImageResource(R.drawable.grimora3);
                                break;
                        }
                        break;
                    case 6:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.spearwizard1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.spearwizard2);
                                break;
                        }
                        break;
                    case 8:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.magnificus1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.magnificus2);
                                break;
                        }
                        break;
                    case 9:
                        switch ((int)(Math.random() * 4+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.inspector1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.inspector2);
                                break;
                            case 3:
                                enemyImageView.setImageResource(R.drawable.inspector3);
                                break;
                            case 4:
                                enemyImageView.setImageResource(R.drawable.inspector4);
                                break;
                        }

                        break;
                    case 10:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.smelter1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.smelter2);
                                break;
                        }
                        break;
                    case 11:
                        switch ((int)(Math.random() * 3+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.mechanic1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.mechanic2);
                                break;
                            case 3:
                                enemyImageView.setImageResource(R.drawable.mechanic3);
                                break;
                        }
                        break;
                    case 12:
                        switch ((int)(Math.random() * 8+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.po31);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.po32);
                                break;
                            case 3:
                                enemyImageView.setImageResource(R.drawable.po33);
                                break;
                            case 4:
                                enemyImageView.setImageResource(R.drawable.po34);
                                break;
                            case 5:
                                enemyImageView.setImageResource(R.drawable.po35);
                                break;
                            case 6:
                                enemyImageView.setImageResource(R.drawable.po36);
                                break;
                            case 7:
                                enemyImageView.setImageResource(R.drawable.po37);
                                break;
                            case 8:
                                enemyImageView.setImageResource(R.drawable.po38);
                                break;
                            case 9:
                                enemyImageView.setImageResource(R.drawable.po39);
                                break;
                        }
                        break;
                }
                break;
            case 21:
                switch (hero5.getNumberOfLevel()) {
                    case 2:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.spearwizard1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.spearwizard2);
                                break;
                        }
                        break;
                    case 4:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.magnificus1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.magnificus2);
                                break;
                        }
                        break;
                    case 5:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.ghostdog2);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.ghostdog1);
                                break;
                        }
                        break;
                    case 7:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.gravedigger1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.gravedigger2);
                                break;
                        }
                        break;
                    case 8:
                        switch ((int)(Math.random() * 3+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.grimora1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.grimora2);
                                break;
                            case 3:
                                enemyImageView.setImageResource(R.drawable.grimora3);
                                break;
                        }
                        break;
                    case 9:
                        switch ((int)(Math.random() * 4+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.inspector1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.inspector2);
                                break;
                            case 3:
                                enemyImageView.setImageResource(R.drawable.inspector3);
                                break;
                            case 4:
                                enemyImageView.setImageResource(R.drawable.inspector4);
                                break;
                        }

                        break;
                    case 10:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.smelter1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.smelter2);
                                break;
                        }
                        break;
                    case 11:
                        switch ((int)(Math.random() * 3+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.mechanic1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.mechanic2);
                                break;
                            case 3:
                                enemyImageView.setImageResource(R.drawable.mechanic3);
                                break;
                        }
                        break;
                    case 12:
                        switch ((int)(Math.random() * 8+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.po31);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.po32);
                                break;
                            case 3:
                                enemyImageView.setImageResource(R.drawable.po33);
                                break;
                            case 4:
                                enemyImageView.setImageResource(R.drawable.po34);
                                break;
                            case 5:
                                enemyImageView.setImageResource(R.drawable.po35);
                                break;
                            case 6:
                                enemyImageView.setImageResource(R.drawable.po36);
                                break;
                            case 7:
                                enemyImageView.setImageResource(R.drawable.po37);
                                break;
                            case 8:
                                enemyImageView.setImageResource(R.drawable.po38);
                                break;
                            case 9:
                                enemyImageView.setImageResource(R.drawable.po39);
                                break;
                        }
                        break;
                }
                break;
            case 13:
                switch (hero5.getNumberOfLevel()) {
                    case 1:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.ghostdog2);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.ghostdog1);
                                break;
                        }
                        break;
                    case 3:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.gravedigger1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.gravedigger2);
                                break;
                        }
                        break;
                    case 4:
                        switch ((int)(Math.random() * 3+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.grimora1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.grimora2);
                                break;
                            case 3:
                                enemyImageView.setImageResource(R.drawable.grimora3);
                                break;
                        }
                        break;
                    case 5:
                        switch ((int)(Math.random() * 4+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.inspector1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.inspector2);
                                break;
                            case 3:
                                enemyImageView.setImageResource(R.drawable.inspector3);
                                break;
                            case 4:
                                enemyImageView.setImageResource(R.drawable.inspector4);
                                break;
                        }

                        break;
                    case 6:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.smelter1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.smelter2);
                                break;
                        }
                        break;
                    case 7:
                        switch ((int)(Math.random() * 3+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.mechanic1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.mechanic2);
                                break;
                            case 3:
                                enemyImageView.setImageResource(R.drawable.mechanic3);
                                break;
                        }
                        break;
                    case 8:
                        switch ((int)(Math.random() * 8+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.po31);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.po32);
                                break;
                            case 3:
                                enemyImageView.setImageResource(R.drawable.po33);
                                break;
                            case 4:
                                enemyImageView.setImageResource(R.drawable.po34);
                                break;
                            case 5:
                                enemyImageView.setImageResource(R.drawable.po35);
                                break;
                            case 6:
                                enemyImageView.setImageResource(R.drawable.po36);
                                break;
                            case 7:
                                enemyImageView.setImageResource(R.drawable.po37);
                                break;
                            case 8:
                                enemyImageView.setImageResource(R.drawable.po38);
                                break;
                            case 9:
                                enemyImageView.setImageResource(R.drawable.po39);
                                break;
                        }
                        break;
                    case 10:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.spearwizard1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.spearwizard2);
                                break;
                        }
                        break;
                    case 12:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.magnificus1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.magnificus2);
                                break;
                        }
                        break;
                }
                break;
            case 31:
                switch (hero5.getNumberOfLevel()) {
                    case 1:
                        switch ((int)(Math.random() * 4+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.inspector1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.inspector2);
                                break;
                            case 3:
                                enemyImageView.setImageResource(R.drawable.inspector3);
                                break;
                            case 4:
                                enemyImageView.setImageResource(R.drawable.inspector4);
                                break;
                        }

                        break;
                    case 2:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.smelter1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.smelter2);
                                break;
                        }
                        break;
                    case 3:
                        switch ((int)(Math.random() * 3+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.mechanic1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.mechanic2);
                                break;
                            case 3:
                                enemyImageView.setImageResource(R.drawable.mechanic3);
                                break;
                        }
                        break;
                    case 4:
                        switch ((int)(Math.random() * 8+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.po31);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.po32);
                                break;
                            case 3:
                                enemyImageView.setImageResource(R.drawable.po33);
                                break;
                            case 4:
                                enemyImageView.setImageResource(R.drawable.po34);
                                break;
                            case 5:
                                enemyImageView.setImageResource(R.drawable.po35);
                                break;
                            case 6:
                                enemyImageView.setImageResource(R.drawable.po36);
                                break;
                            case 7:
                                enemyImageView.setImageResource(R.drawable.po37);
                                break;
                            case 8:
                                enemyImageView.setImageResource(R.drawable.po38);
                                break;
                            case 9:
                                enemyImageView.setImageResource(R.drawable.po39);
                                break;
                        }
                        break;
                    case 5:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.ghostdog2);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.ghostdog1);
                                break;
                        }
                        break;
                    case 6:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.gravedigger1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.gravedigger2);
                                break;
                        }
                        break;
                    case 8:
                        switch ((int)(Math.random() * 3+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.grimora1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.grimora2);
                                break;
                            case 3:
                                enemyImageView.setImageResource(R.drawable.grimora3);
                                break;
                        }
                        break;
                    case 10:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.spearwizard1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.spearwizard2);
                                break;
                        }
                        break;
                    case 12:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.magnificus1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.magnificus2);
                                break;
                        }
                        break;
                }
                break;
            case 23:
                switch (hero5.getNumberOfLevel()) {
                    case 1:
                        switch ((int)(Math.random() * 4+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.inspector1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.inspector2);
                                break;
                            case 3:
                                enemyImageView.setImageResource(R.drawable.inspector3);
                                break;
                            case 4:
                                enemyImageView.setImageResource(R.drawable.inspector4);
                                break;
                        }

                        break;
                    case 2:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.smelter1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.smelter2);
                                break;
                        }
                        break;
                    case 3:
                        switch ((int)(Math.random() * 3+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.mechanic1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.mechanic2);
                                break;
                            case 3:
                                enemyImageView.setImageResource(R.drawable.mechanic3);
                                break;
                        }
                        break;
                    case 4:
                        switch ((int)(Math.random() * 8+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.po31);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.po32);
                                break;
                            case 3:
                                enemyImageView.setImageResource(R.drawable.po33);
                                break;
                            case 4:
                                enemyImageView.setImageResource(R.drawable.po34);
                                break;
                            case 5:
                                enemyImageView.setImageResource(R.drawable.po35);
                                break;
                            case 6:
                                enemyImageView.setImageResource(R.drawable.po36);
                                break;
                            case 7:
                                enemyImageView.setImageResource(R.drawable.po37);
                                break;
                            case 8:
                                enemyImageView.setImageResource(R.drawable.po38);
                                break;
                            case 9:
                                enemyImageView.setImageResource(R.drawable.po39);
                                break;
                        }
                        break;
                    case 6:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.spearwizard1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.spearwizard2);
                                break;
                        }
                        break;
                    case 8:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.magnificus1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.magnificus2);
                                break;
                        }
                        break;
                    case 9:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.ghostdog2);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.ghostdog1);
                                break;
                        }
                        break;
                    case 11:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.gravedigger1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.gravedigger2);
                                break;
                        }
                        break;
                    case 12:
                        switch ((int)(Math.random() * 3+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.grimora1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.grimora2);
                                break;
                            case 3:
                                enemyImageView.setImageResource(R.drawable.grimora3);
                                break;
                        }
                        break;
                }
                break;
            case 32:
                switch (hero5.getNumberOfLevel()) {
                    case 1:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.spearwizard1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.spearwizard2);
                                break;
                        }
                        break;
                    case 3:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.magnificus1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.magnificus2);
                                break;
                        }
                        break;
                    case 4:
                        switch ((int)(Math.random() * 4+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.inspector1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.inspector2);
                                break;
                            case 3:
                                enemyImageView.setImageResource(R.drawable.inspector3);
                                break;
                            case 4:
                                enemyImageView.setImageResource(R.drawable.inspector4);
                                break;
                        }

                        break;
                    case 6:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.smelter1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.smelter2);
                                break;
                        }
                        break;
                    case 8:
                        switch ((int)(Math.random() * 3+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.mechanic1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.mechanic2);
                                break;
                            case 3:
                                enemyImageView.setImageResource(R.drawable.mechanic3);
                                break;
                        }
                        break;
                    case 9:
                        switch ((int)(Math.random() * 8+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.po31);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.po32);
                                break;
                            case 3:
                                enemyImageView.setImageResource(R.drawable.po33);
                                break;
                            case 4:
                                enemyImageView.setImageResource(R.drawable.po34);
                                break;
                            case 5:
                                enemyImageView.setImageResource(R.drawable.po35);
                                break;
                            case 6:
                                enemyImageView.setImageResource(R.drawable.po36);
                                break;
                            case 7:
                                enemyImageView.setImageResource(R.drawable.po37);
                                break;
                            case 8:
                                enemyImageView.setImageResource(R.drawable.po38);
                                break;
                            case 9:
                                enemyImageView.setImageResource(R.drawable.po39);
                                break;
                        }
                        break;
                    case 10:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.ghostdog2);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.ghostdog1);
                                break;
                        }
                        break;
                    case 11:
                        switch ((int)(Math.random() * 2+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.gravedigger1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.gravedigger2);
                                break;
                        }
                        break;
                    case 12:
                        switch ((int)(Math.random() * 3+1)) {
                            case 1:
                                enemyImageView.setImageResource(R.drawable.grimora1);
                                break;
                            case 2:
                                enemyImageView.setImageResource(R.drawable.grimora2);
                                break;
                            case 3:
                                enemyImageView.setImageResource(R.drawable.grimora3);
                                break;
                        }
                        break;
                }
                break;
        }
    }
    private void Text() {
            statsEnemyTextView.setText("Здоровье: " + enemy.getHealth() + "; Физ. атака: " + enemy.getPhysickAtack() + "; Физ. защита: -" + enemy.getPhysickArmor() + "%; Маг. атака: " + enemy.getMagickAtack() + "; Маг. защита: -" + enemy.getMagickArmor() + "%.");
            statsMeTextView.setText("Здоровье: " + hero5.getHealth() + "/" + hero5.getMaxhealth() + "; Физ. атака: " + hero5.getPhysickAtack() + "; Физ. защита: -" + hero5.getPhysickArmor() + "%; Маг. атака: " + hero5.getMagickAtack() + "; Маг. защита: -" + hero5.getMagickArmor() + "%.");
    }
    private void Last() {
        if (enemy.getHealth() <= 0) {
            if (hero5.getNumberOfLevel() == 12) {
                Intent intent = new Intent(this, WinActivity.class);
                intent.putExtra("hero", hero5);
                startActivity(intent);
            }
            hero5.setLast(true);
            infoFightTextView.setText(R.string.last);
            backpackbutton.setClickable(false);
            chooseAttackAndArmorButton.setClickable(false);
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
        hero5.StopFon();
        super.onDestroy();
    }
}
