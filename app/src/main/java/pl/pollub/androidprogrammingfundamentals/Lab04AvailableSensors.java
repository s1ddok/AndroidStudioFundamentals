package pl.pollub.androidprogrammingfundamentals;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class Lab04AvailableSensors extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab04_available_sensors);
        TextView tv = (TextView) findViewById(R.id.textView9); tv.setText("");
        SensorManager sensorManager =
                (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> sensors = sensorManager.getSensorList(Sensor.TYPE_ALL); for(int i = 0; i < sensors.size(); i++) {
            tv.setText(tv.getText() + "\n" + sensors.get(i).getName());
        }
    }
}
