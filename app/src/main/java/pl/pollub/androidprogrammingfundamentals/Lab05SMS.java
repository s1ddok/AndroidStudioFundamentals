package pl.pollub.androidprogrammingfundamentals;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;

public class Lab05SMS extends Activity {

    SmsManager smsManager = null;
    String receiver = "emulator-5554";
    String message = "Hello, my SMS Sender sent you a message ;)";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab05_sms);
        smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(receiver, null, message, null, null);
    }
}
