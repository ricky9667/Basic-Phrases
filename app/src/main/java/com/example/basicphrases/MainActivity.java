package com.example.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    public void playTrack(View view) {

        Button button = (Button) view;
        String trackName = button.getTag().toString();
        mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(trackName, "raw", getPackageName()));
        mediaPlayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
