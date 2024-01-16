package com.example.inscryption;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
        EditText nameEditText;
        MediaPlayer mediaPlayer;
        Hero hero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this,R.raw.fon);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);

        nameEditText = findViewById(R.id.nameEditText);

        hero = new Hero();
    }

    public void start(View view) {
        if (nameEditText.getText().toString().equals("")) {
            MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.error);
            mediaPlayer2.start();
        } else {
            Intent intent = new Intent(this,HeroActivity.class);
            hero.setNamedafgfg(nameEditText.getText().toString());
            startActivity(intent);
        }
    }
}