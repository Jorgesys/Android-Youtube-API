package com.jorgesys.youtubeapiexample;

import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


//A YouTubePlayerView can only be created with an Activity  which extends YouTubeBaseActivity as its context.
public class MainActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener{

    private String ID_VIDEO = "_7I1sjCdB_I";

    //TODO: GET THE API KEY!
    private String YOUTUBE_API_KEY = "AIzaSyCdaqqQIvOnIZsXk_OTT4Q163kZssPRTDY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        YouTubePlayerView youTubePlayerView = (YouTubePlayerView)findViewById(R.id.youtubeplayerview);
        youTubePlayerView.initialize(YOUTUBE_API_KEY, this);

        /*
        //Intent to open StandalonePlayerDemoActivity
        Intent intent = new Intent(this, StandalonePlayerDemoActivity.class);
        startActivity(intent);
        */


    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

        youTubePlayer.setPlayerStyle(YouTubePlayer.PlayerStyle.DEFAULT);
        youTubePlayer.loadVideo(ID_VIDEO);
        youTubePlayer.play();

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}
