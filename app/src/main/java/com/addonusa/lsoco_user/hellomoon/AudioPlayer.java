package com.addonusa.lsoco_user.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by lsoco_user on 12/2/2015.
 */
public class AudioPlayer {
    MediaPlayer mPlayer;

    public void stop() {
        if(mPlayer != null) {
            mPlayer.release();
            mPlayer = null;
        }
    }

    public void play(Context context) {
        stop();
        mPlayer = MediaPlayer.create(context, R.raw.one_small_step);
        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stop();
            }
        });
        mPlayer.start();
    }

} // end AudioPlayer
