package pl.pollub.androidprogrammingfundamentals;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Lab05MediaPlayer extends Activity {
    MediaPlayer mp;
    double startTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab05_media_player);
    }
    public void play(View view) {
        mp = MediaPlayer.create(this, R.raw.promise_me); mp.seekTo((int) startTime);
        mp.start();
    }
    public void pause(View view) {
        if (mp != null && mp.isPlaying()) {
            startTime = mp.getCurrentPosition();
            mp.pause();
        }
    }
    public void stop(View view) {
        if (mp != null && mp.isPlaying()) {
            startTime = 0;
            mp.stop(); }
    }
}
