package com.example.inscryption;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class HiMainActivity extends AppCompatActivity {
    ImageButton backpackTipImageButton;
    Hero hero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hi_main);

        hero2 = (Hero) getIntent().getSerializableExtra("hero");

        backpackTipImageButton = findViewById(R.id.backpackTipImageButton);

        switch (hero2.getNumberOfHero()) {
            case 1:
                backpackTipImageButton.setImageResource(R.drawable.robot);
                break;
            case 2:
                backpackTipImageButton.setImageResource(R.drawable.sceleton);
                break;
            case 3:
                backpackTipImageButton.setImageResource(R.drawable.wizard);
                break;
        }
    }

    public void backpackTip(View view) {
        Intent intent = new Intent(this, BackpackActivity.class);
        hero2.setHi(true);
        intent.putExtra("hero", hero2);
        startActivity(intent);
    }

    public void start(View view) {
        Intent intent = new Intent(this, TransActivity.class);
        intent.putExtra("hero", hero2);
        startActivity(intent);
    }
}