package pl.pollub.androidprogrammingfundamentals;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Lab03ActivityDataTransferSub extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab03_data_transfer_sub);
        TextView view = (TextView) findViewById(R.id.receivedTextView);
        Bundle extras = getIntent().getExtras();
        String inputString = extras.getString("key"); view.setText(inputString);
    }

    public void finish() {
        Intent intent = new Intent();
        EditText editText = (EditText) findViewById(R.id.returnValueEditText);
        String string = editText.getText().toString();
        intent.putExtra("returnkey", string);
        setResult(RESULT_OK, intent);
        super.finish();
    }
}
