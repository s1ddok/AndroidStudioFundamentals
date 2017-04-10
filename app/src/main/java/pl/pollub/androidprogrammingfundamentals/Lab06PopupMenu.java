package pl.pollub.androidprogrammingfundamentals;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class Lab06PopupMenu extends Activity {
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab06_popup_menu);
        button1 = (Button) findViewById(R.id.popupButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// Creating the instance of PopupMenu
                PopupMenu popup = new PopupMenu(Lab06PopupMenu.this,
                        // Inflating the Popup using xml file
                        button1);
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());
// Registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(
                        new PopupMenu.OnMenuItemClickListener() {
                            public boolean onMenuItemClick(MenuItem item) {
                                Toast.makeText(Lab06PopupMenu.this, "You Clicked : " +
                                        item.getTitle(), Toast.LENGTH_SHORT).show();
                                return true;
                            }
                        });
                popup.show();// Showing popup menu
            }
        });// Closing the setOnClickListener method
    }
}
