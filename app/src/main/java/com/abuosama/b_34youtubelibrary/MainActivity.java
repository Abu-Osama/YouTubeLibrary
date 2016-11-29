package com.abuosama.b_34youtubelibrary;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube1);
        youTubePlayerView.initialize("AIzaSyBbaMPBwxAYo0tihp0EysTW3cSUTFNYSrI",this);

    }


    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

//
          // youTubePlayer.cueVideo(getIntent().getStringExtra("android tutorial"));}
           // youTubePlayer.loadVideo("android tutorial");
               youTubePlayer.cueVideo("android ttutorial");
       //   youTubePlayer.setPlayerStyle(YouTubePlayer.PlayerStyle.DEFAULT);


    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

        Toast.makeText(getApplication(), "failed to load", Toast.LENGTH_SHORT).show();

    }
}
