package com.example.inscryption;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class AtackAndArmorActivity extends AppCompatActivity {
    Hero hero6;
    Enemy enemy2;
    TextView atackTextView;
    TextView armorTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atack_and_armor);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        hero6 = (Hero) getIntent().getSerializableExtra("hero");
        enemy2 = (Enemy) getIntent().getSerializableExtra("enemy");
        atackTextView = findViewById(R.id.atackTextView);
        armorTextView = findViewById(R.id.ArmorTextView);

        switch (hero6.getAttack()) {
            case 1:
                atackTextView.setText(R.string.choosenPhysikcAtack);
                atackTextView.append(hero6.getPhysickAtack() + ".");
                break;
            case 2:
                atackTextView.setText(R.string.choosenMagickAtack);
                atackTextView.append(hero6.getMagickAtack() + ".");
                break;
            default:
                atackTextView.setText("");
                break;
        }
        switch (hero6.getArmor()) {
            case 1:
                armorTextView.setText(R.string.choosenPhysickArmor);
                armorTextView.append(hero6.getPhysickArmor() + "% физ. урона.");
                break;
            case 2:
                armorTextView.setText(R.string.choosenMagickArmor);
                armorTextView.append(hero6.getMagickArmor() + "% маг. урона.");
                break;
            default:
                atackTextView.setText("");
                break;
        }
    }

    public void сhoosephusickAtack(View view) {
        hero6.setAttack(1);
        atackTextView.setText(R.string.choosenPhysikcAtack);
        atackTextView.append(hero6.getPhysickAtack() + ".");
    }

    public void сhooseMagickAtack(View view) {
        hero6.setAttack(2);
        atackTextView.setText(R.string.choosenMagickAtack);
        atackTextView.append(hero6.getMagickAtack() + ".");
    }

    public void сhoosephusickArmor(View view) {
        hero6.setArmor(1);
        armorTextView.setText(R.string.choosenPhysickArmor);
        armorTextView.append(hero6.getPhysickArmor() + "% физ. урона.");

    }

    public void сhooseMagickArmor(View view) {
        hero6.setArmor(2);
        armorTextView.setText(R.string.choosenMagickArmor);
        armorTextView.append(hero6.getMagickArmor() + "% маг. урона.");
    }

    public void back(View view) {
        Intent intent = new Intent(this, FightActivity.class);
        intent.putExtra("hero", hero6);
        intent.putExtra("enemy", enemy2);
        startActivity(intent);

    }
}