package pl.pollub.androidprogrammingfundamentals;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class Lab02RuntimeLayout extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab02_runtime_layout);

        RadioGroup rg = (RadioGroup) findViewById(R.id.orientation);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch (checkedId) {
                case R.id.horizontal:
                    group.setOrientation(LinearLayout.HORIZONTAL);
                    break;
                case R.id.vertical:
                    group.setOrientation(LinearLayout.VERTICAL);
                    break;
                default: break;
            }
        }});
    }
}
