package com.desa.desakampunganyar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.Objects;

public class PlayVideoActivity extends AppCompatActivity {
    private VideoView mVideoView;
    private MediaController mediaController;


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_video);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        mVideoView = findViewById(R.id.VideoPlayer);

        if(mediaController == null){
            mediaController = new MediaController(PlayVideoActivity.this);
            mediaController.setAnchorView(mVideoView);
            mVideoView.setMediaController(mediaController);
        }

        try{
            String str = Objects.requireNonNull(getIntent().getExtras()).getString("VideoUri");
            Uri uri = Uri.parse(str);

            mVideoView.setVideoURI(uri);
        }catch (Exception e){
            Log.e("Error", Objects.requireNonNull(e.getMessage()));
            e.printStackTrace();
        }

        mVideoView.requestFocus();
        mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mVideoView.start();
            }
        });
    }

}