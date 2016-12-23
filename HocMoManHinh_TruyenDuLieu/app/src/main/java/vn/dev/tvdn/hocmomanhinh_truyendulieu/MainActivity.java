package vn.dev.tvdn.hocmomanhinh_truyendulieu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import model.SinhVien;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void xuLyMoVaGuiDuLieu(View view) {
        Intent intent = new Intent(MainActivity.this, ManHinh2Activity.class);
        intent.putExtra("kieuBool", true);
        intent.putExtra("kieuChar", 'x');
        intent.putExtra("kieuInt", 100);
        intent.putExtra("kieuDouble", 15.99);
        intent.putExtra("kieuString", "Topica Edumall");

        SinhVien sv = new SinhVien(1, "Trần Võ Đình Nam");
        intent.putExtra("sinhVien", sv);

        startActivity(intent);
    }
}
