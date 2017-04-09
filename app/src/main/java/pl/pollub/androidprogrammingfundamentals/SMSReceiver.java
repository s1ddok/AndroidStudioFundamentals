package pl.pollub.androidprogrammingfundamentals;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

/**
 * Created by s1ddok on 09.04.17.
 */

public class SMSReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
    Bundle bundle = intent.getExtras();
        SmsMessage[] msgs = null;
        String message = "";
        if(bundle != null) {
            Object[] pdus = (Object[]) bundle.get("pdus"); msgs = new SmsMessage[pdus.length];
            for(int i = 0; i < msgs.length; i++) {
                msgs[i] = SmsMessage.createFromPdu((byte[]) pdus[i]); message = msgs[i].getMessageBody();
                Toast.makeText(context, message, Toast.LENGTH_LONG).show();
            } }
    }
}
