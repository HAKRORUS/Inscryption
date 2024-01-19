package com.example.inscryption;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TransActivity extends AppCompatActivity {
    Hero hero4;
    TextView transTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trans);

        hero4 = (Hero) getIntent().getSerializableExtra("hero");
        transTextView = findViewById(R.id.transTextView);

        switch ((int) (Math.random()*5+1)) {
            case 1:
                transTextView.setText("Ты получил усиление физ.атаки на 10%");
                hero4.setPhysickAtack(hero4.getPhysickAtack() +  hero4.getPhysickAtack() / 10);
                break;
            case 2:
                transTextView.setText("Ты получил усиление физ.защиты на 10%");
                hero4.setPhysickArmor(hero4.getPhysickArmor() +  hero4.getPhysickArmor() / 10);
                break;
            case 3:
                transTextView.setText("Ты получил усиление маг.атаки на 10%");
                hero4.setMagickAtack(hero4.getMagickAtack() +  hero4.getMagickAtack() / 10);
                break;
            case 4:
                transTextView.setText("Ты получил усиление маг.защиты на 10%");
                hero4.setMagickArmor(hero4.getMagickArmor() +  hero4.getMagickArmor() / 10);
                break;
            case 5:
                transTextView.setText("Ты получил усиление здоровья на 10%");
                hero4.setMaxhealth(hero4.getMaxhealth() +  hero4.getMaxhealth() / 10);
                hero4.setHealth(hero4.getHealth() +  hero4.getHealth() / 10);
                break;
        }
    }

    public void toFight(View view) {
        hero4.setNumberOfLevel(hero4.getNumberOfLevel()+1);
        hero4.setFirstTime(true);
        Intent intent = new Intent(this, FightActivity.class);
        intent.putExtra("hero", hero4);
        startActivity(intent);
    }
}