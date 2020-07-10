package com.example.gridlayoutchallange;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.doyouspeakenglish);
    }
    public void playSound(View view)
    {

        int viewId=view.getId();
        String ourCustomIdName=view.getResources().getResourceEntryName(viewId);
        int resourceIdAndGetFile=getResources().getIdentifier(ourCustomIdName,"raw",getPackageName());

        mediaPlayer=MediaPlayer.create(getApplicationContext(),resourceIdAndGetFile);

    }
}