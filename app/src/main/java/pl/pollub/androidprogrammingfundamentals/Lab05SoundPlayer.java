package pl.pollub.androidprogrammingfundamentals;

import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class Lab05SoundPlayer extends Activity implements View.OnTouchListener {

    private SoundPool soundPool;
    private int soundID;
    boolean loaded = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab05_sound_player);
        View view = findViewById(R.id.textView12); view.setOnTouchListener(this);
// Set the hardware buttons to control the music
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
// Load the sound
        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
        soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
                                       loaded = true;
        }
    });
    soundID = soundPool.load(this, R.raw.sound, 1);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
            float actualVolume = (float) audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
            float maxVolume = (float) audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
            float volume = actualVolume / maxVolume; // Is the sound loaded already?
            if (loaded) {
                soundPool.play(soundID, volume, volume, 1, 0, 1f);
            }
        }
        return false;
    }

}
