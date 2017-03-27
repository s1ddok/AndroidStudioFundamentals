package pl.pollub.androidprogrammingfundamentals;

import android.content.Intent;

public class Item {
    public String title;
    public Intent intent;

    public Item(String string, Intent intent) {
        this.title = string;
        this.intent = intent;
    }
}