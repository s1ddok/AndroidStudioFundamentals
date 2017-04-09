package pl.pollub.androidprogrammingfundamentals;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Lab03ActivityDataTransfer extends Activity {

    // Constant to determine which sub-activity returns
    private static final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab03_data_transfer);
    }

    public void onClick(View view) {
        EditText text = (EditText) findViewById(R.id.editText2);
        String value = text.getText().toString();
        Intent intent = new Intent(this, Lab03ActivityDataTransferSub.class);
        intent.putExtra("key", value);
        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK && requestCode == REQUEST_CODE) {
            if (data.hasExtra("returnkey")) {
                String result = data.getExtras().getString("returnkey");
                if (result != null && result.length() > 0) {
                    Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}
