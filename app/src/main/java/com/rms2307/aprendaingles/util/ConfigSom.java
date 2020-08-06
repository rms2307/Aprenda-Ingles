package com.rms2307.aprendaingles.util;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.browse.MediaBrowser;

public class ConfigSom {

    MediaPlayer mediaPlayer;

    public void tocarSom(Activity activity, int som) {
        mediaPlayer = MediaPlayer.create(activity, som);
        if (mediaPlayer != null) {
            mediaPlayer.start();

            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mediaPlayer.release();
                }
            });
        }
    }

    public void Destroy(){
        if(mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

}
