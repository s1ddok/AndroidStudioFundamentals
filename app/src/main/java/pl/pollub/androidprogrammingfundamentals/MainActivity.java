package pl.pollub.androidprogrammingfundamentals;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    SparseArray<Group> groups = new SparseArray<Group>();

    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main); createData();
        ExpandableListView listView = (ExpandableListView) findViewById(R.id.mainListView);
        ExpandableListAdapter adapter = new ExpandableListAdapter(this, groups);
        listView.setAdapter(adapter);
    }

    public void createData() {
        Group lab01Group = new Group("Lab 01");
        lab01Group.children.add(new Item("Hello world!", new Intent(this, Lab01HelloWorld.class)));

        groups.append(0, lab01Group);
    }
}
