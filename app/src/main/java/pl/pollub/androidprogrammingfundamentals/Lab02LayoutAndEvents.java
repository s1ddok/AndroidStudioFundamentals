package pl.pollub.androidprogrammingfundamentals;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Lab02LayoutAndEvents extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab02_layout_and_events);
    }

    public void onClick(View view) {
        TextView tv = (TextView) findViewById(R.id.my_text); EditText et = (EditText) findViewById(R.id.main_input); String str = et.getText().toString();
        tv.setText(str);
    }
}
