package pl.pollub.androidprogrammingfundamentals;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Lab02PopularControls extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab02_popular_controls);
    }

    public void onFormatClick(View view) {
        TextView tv = (TextView)findViewById(R.id.textView4);
        EditText et = (EditText)findViewById(R.id.editText);
        CheckBox bcb = (CheckBox)findViewById(R.id.boldCheckBox);
        CheckBox icb = (CheckBox)findViewById(R.id.italicCheckBox);

        if (((RadioButton)findViewById(R.id.red)).isChecked()) {
            tv.setTextColor(Color.RED);
        } else {
            tv.setTextColor(Color.BLUE);
        }

        if (bcb.isChecked() && icb.isChecked()) { tv.setTypeface(null, Typeface.BOLD_ITALIC);
        } else if (bcb.isChecked() && !icb.isChecked()) { tv.setTypeface(null, Typeface.BOLD);
        } else if (!bcb.isChecked() && icb.isChecked()) { tv.setTypeface(null, Typeface.ITALIC);
        } else {
            tv.setTypeface(null, Typeface.NORMAL);
        }

        tv.setText(et.getText());
    }
}
