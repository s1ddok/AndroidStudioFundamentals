package pl.pollub.androidprogrammingfundamentals;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Lab01HelloWorld extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab01_hello_world);

        TextView textView = (TextView) findViewById(R.id.helloWorldLabel);
        // Get a string resource from your app's Resources
        String hello = getResources().getString(R.string.hello_world); textView.setText(hello);
        // Supply a string resource to a method that requires a string
        textView.setText(R.string.hello_world);
    }
}
