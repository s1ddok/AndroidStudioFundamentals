package pl.pollub.androidprogrammingfundamentals;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Lab02Resources extends Activity {

    public Boolean switched = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab02_resources);
    }

    public void onSwitchImagesClicked(View view) {
        switched = !switched;

        ImageView iv = (ImageView)findViewById(R.id.imageView2);
        iv.setImageResource(switched ? R.drawable.logo2 : R.drawable.logo1);
    }
}
