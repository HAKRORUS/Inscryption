package com.example.inscryption;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
        EditText nameEditText;
        MediaPlayer mediaPlayer;
        Hero hero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        hero.Fon(this,R.raw.fon);

        nameEditText = findViewById(R.id.nameEditText);

    }

    public void start(View view) {
        if (nameEditText.getText().toString().equals("")) {
            MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.error);
            mediaPlayer2.start();
        } else {
            Intent intent = new Intent(this,HeroActivity.class);
            hero = new Hero();
            hero.setName(nameEditText.getText().toString());
            intent.putExtra("hero", hero);
            startActivity(intent);
        }
        if (nameEditText.getText().toString().equals("12345")) {
            hero.StopFon();
            Intent intent = new Intent(this,Pashalka.class);
            startActivity(intent);
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
        mediaPlayer.stop();
        super.onDestroy();
    }
}