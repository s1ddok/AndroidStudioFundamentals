package pl.pollub.androidprogrammingfundamentals;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Lab03Alerts extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab03_alerts);
    }

    public void open(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Are you sure, You wanted to make decision");
        alertDialogBuilder.setPositiveButton("yes",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0,
                                        int arg1) {
                        Toast.makeText(Lab03Alerts.this,
                                "You clicked yes button",
                                Toast.LENGTH_LONG).show();
                    } });

        alertDialogBuilder.setNegativeButton("No",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) { finish();
                    } });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
