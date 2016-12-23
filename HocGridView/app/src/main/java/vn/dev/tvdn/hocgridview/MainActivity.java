package vn.dev.tvdn.hocgridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

import vn.dev.tvdn.adapter.HinhAdapter;

public class MainActivity extends AppCompatActivity {

    GridView gvHinh;
    ArrayList<Integer> dsHinh;
    HinhAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addEvents() {

    }

    private void addControls() {
        gvHinh = (GridView) findViewById(R.id.gvHinh);
        dsHinh = new ArrayList<>();
        dsHinh.add(R.drawable.exit);
        dsHinh.add(R.drawable.exit);
        dsHinh.add(R.drawable.exit);
        dsHinh.add(R.drawable.exit);
        dsHinh.add(R.drawable.exit);
        dsHinh.add(R.drawable.exit);
        dsHinh.add(R.drawable.exit);
        dsHinh.add(R.drawable.exit);
        dsHinh.add(R.drawable.exit);
        dsHinh.add(R.drawable.exit);
        dsHinh.add(R.drawable.exit);
        dsHinh.add(R.drawable.exit);
        adapter = new HinhAdapter(MainActivity.this, R.layout.item, dsHinh);
        gvHinh.setAdapter(adapter);
    }
}
