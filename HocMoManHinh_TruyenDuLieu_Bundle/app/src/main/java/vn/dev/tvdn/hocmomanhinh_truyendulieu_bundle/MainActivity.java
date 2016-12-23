package vn.dev.tvdn.hocmomanhinh_truyendulieu_bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import model.SanPham;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void xuLyMoVaGuiDuLieu(View view) {
        Intent intent = new Intent(MainActivity.this, ManHinh2Activity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("int", 113);
        bundle.putDouble("double", 113.115);
        SanPham sanPham = new SanPham(1, "Sản phẩm 1");
        bundle.putSerializable("sanPham", sanPham);

        intent.putExtra("bundle", bundle);
        startActivity(intent);
    }
}
