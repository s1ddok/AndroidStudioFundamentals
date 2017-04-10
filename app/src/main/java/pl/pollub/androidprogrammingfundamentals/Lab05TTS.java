package pl.pollub.androidprogrammingfundamentals;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Lab05TTS extends Activity {
    private Button speakNowButton;
    private EditText editText;
    TTSManager ttsManager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab05_tts);
        ttsManager = new TTSManager(); ttsManager.init(this);
        editText = (EditText) findViewById(R.id.input_text); speakNowButton = (Button) findViewById(R.id.speak_now); speakNowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String text = editText.getText().toString(); ttsManager.initQueue(text);
            } });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        ttsManager.shutDown();
    }
}
