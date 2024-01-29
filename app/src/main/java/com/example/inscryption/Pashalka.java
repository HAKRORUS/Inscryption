package com.example.inscryption;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class Pashalka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pashalka);
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.mem);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
    }
}