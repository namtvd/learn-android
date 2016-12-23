package vn.dev.tvdn.hoclistviewnangcao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import vn.dev.tvdn.adapter.DanhBaAdapter;
import vn.dev.tvdn.model.DanhBa;

public class MainActivity extends AppCompatActivity {

    ListView lvDanhba;
    ArrayList<DanhBa> dsDanhba;
    DanhBaAdapter danhBaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        addControls();
        addEvents();
    }

    private void addControls() {
        lvDanhba = (ListView) findViewById(R.id.lvDanhba);

        dsDanhba = new ArrayList<DanhBa>();
        dsDanhba.add(new DanhBa(1, "Nguyễn Văn Tèo", "01206189116"));
        dsDanhba.add(new DanhBa(2, "Trần Thị Tý", "01206189117"));
        dsDanhba.add(new DanhBa(3, "Hồ Văn Đồ", "01206189118"));

        danhBaAdapter = new DanhBaAdapter(MainActivity.this, R.layout.item, dsDanhba);
        lvDanhba.setAdapter(danhBaAdapter);
    }

    private void addEvents() {
    }
}
