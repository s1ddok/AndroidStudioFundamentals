package pl.pollub.androidprogrammingfundamentals;

import android.app.Activity;
import android.content.ClipData;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Lab06DragNDrop extends Activity {

    ImageView drag, drop;
    TextView total, success;
    int totalCount = 0 , successCount = 0, failureCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab06_drag_ndrop);
        drag = (ImageView) findViewById(R.id.drag);
        drop = (ImageView) findViewById(R.id.drop); total = (TextView)findViewById(R.id.total); success = (TextView)findViewById(R.id.success);
        drag.setOnTouchListener(new View.OnTouchListener() { @Override
        public boolean onTouch(View v, MotionEvent arg1) { ClipData data = ClipData.newPlainText("", ""); View.DragShadowBuilder shadow =
                new View.DragShadowBuilder(drag);
            v.startDrag(data, shadow, null, 0);
            return true;
        }
        });

        drop.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {
                int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DROP:

                    {
                        successCount = successCount + 1;
                        success.setText("Successful drops: " + successCount);
                        break;
                    }
                    case DragEvent.ACTION_DRAG_ENDED: {
                        totalCount = totalCount + 1;
                        total.setText("Total drops: " + totalCount);
                        break;
                    }
                }

                return true;
            }
        });
    }
}
