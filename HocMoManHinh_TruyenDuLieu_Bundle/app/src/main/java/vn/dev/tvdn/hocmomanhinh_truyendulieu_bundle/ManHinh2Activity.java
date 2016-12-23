package vn.dev.tvdn.hocmomanhinh_truyendulieu_bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ManHinh2Activity extends AppCompatActivity {

    TextView txtKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh2);

        addControls();
    }

    private void addControls() {
        txtKetQua = (TextView) findViewById(R.id.txtKetQua);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("bundle");

        txtKetQua.setText("Int: " + bundle.getInt("int") + "\n"
            + "Double: " + bundle.getDouble("double") + "\n"
            + "Sản phẩm: " + bundle.getSerializable("sanPham"));
    }
}
