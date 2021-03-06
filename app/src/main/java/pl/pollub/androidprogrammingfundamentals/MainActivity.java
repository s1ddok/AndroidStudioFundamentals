package pl.pollub.androidprogrammingfundamentals;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.ExpandableListView;

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

        Group lab02Group = new Group("Lab 02");
        lab02Group.children.add(new Item("Lifecycle", new Intent(this, Lab02Lifecycle.class)));
        lab02Group.children.add(new Item("Layout and Events", new Intent(this, Lab02LayoutAndEvents.class)));
        lab02Group.children.add(new Item("Resources", new Intent(this, Lab02Resources.class)));
        lab02Group.children.add(new Item("Runtime layout influence", new Intent(this, Lab02RuntimeLayout.class)));
        lab02Group.children.add(new Item("Popular controls", new Intent(this, Lab02PopularControls.class)));
        groups.append(1, lab02Group);

        Group lab03Group = new Group("Lab 03");
        lab03Group.children.add(new Item("Alert dialog", new Intent(this, Lab03Alerts.class)));
        lab03Group.children.add(new Item("Notifications", new Intent(this, Lab03Notifications.class)));
        lab03Group.children.add(new Item("Data transfer", new Intent(this, Lab03ActivityDataTransfer.class)));
        lab03Group.children.add(new Item("Image picking", new Intent(this, Lab03ImagePicking.class)));
        groups.append(2, lab03Group);

        Group lab04Group = new Group("Lab 04");
        lab04Group.children.add(new Item("Location", new Intent(this, Lab04Location.class)));
        lab04Group.children.add(new Item("Available Sensors", new Intent(this, Lab04AvailableSensors.class)));
        lab04Group.children.add(new Item("Accelerometer", new Intent(this, Lab04Accelerometer.class)));
        groups.append(3, lab04Group);

        Group lab05Group = new Group("Lab 05");
        lab05Group.children.add(new Item("Play sound", new Intent(this, Lab05SoundPlayer.class)));
        lab05Group.children.add(new Item("Media player", new Intent(this, Lab05MediaPlayer.class)));
        lab05Group.children.add(new Item("Record audio", new Intent(this, Lab05RecordAudio.class)));
        lab05Group.children.add(new Item("Text to speech", new Intent(this, Lab05TTS.class)));
        lab05Group.children.add(new Item("Send SMS", new Intent(this, Lab05SMS.class)));
        groups.append(4, lab05Group);

        Group lab06Group = new Group("Lab 06");
        lab06Group.children.add(new Item("ContextMenu", new Intent(this, Lab06ContextMenu.class)));
        lab06Group.children.add(new Item("Pop-up menu", new Intent(this, Lab06PopupMenu.class)));
        lab06Group.children.add(new Item("Drag-N-Drop", new Intent(this, Lab06DragNDrop.class)));
        groups.append(5, lab06Group);
    }
}
