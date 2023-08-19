package com.example.videoplayerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Displaying video from local storage

        val videoView1:VideoView=findViewById(R.id.videoView1);

        videoView1.setVideoPath("android.resource://"+packageName+"/"+R.raw.nico_nico_nii_car);

        val mediaController=MediaController(this);

        mediaController.setAnchorView(videoView1);
        mediaController.setMediaPlayer(videoView1);
        videoView1.setMediaController(mediaController);


    }
}