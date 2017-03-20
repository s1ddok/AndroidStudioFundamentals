package pl.pollub.androidprogrammingfundamentals;

import android.app.Activity;
import android.app.ListActivity;
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
        ExpandableListAdapter adapter = new ExpandableListAdapter( this, groups);
        listView.setAdapter(adapter);
    }
    public void createData() {
        for (int j = 0; j < 5; j++) {
            Group group = new Group("Item " + (j + 1));
            for (int i = 0; i < 5; i++) {
                group.children.add("Sub Item " + (i + 1));
            }
            groups.append(j, group);
        }
    }
}
