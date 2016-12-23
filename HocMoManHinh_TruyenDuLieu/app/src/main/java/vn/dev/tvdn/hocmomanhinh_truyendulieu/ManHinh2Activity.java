package vn.dev.tvdn.hocmomanhinh_truyendulieu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import model.SinhVien;

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
        boolean kieuBool = intent.getBooleanExtra("kieuBool", false);
        char kieuChar = intent.getCharExtra("kieuChar", 'w');
        int kieuInt = intent.getIntExtra("kieuInt", 0);
        double kieuDouble = intent.getDoubleExtra("kieuDouble", 0.00);
        String kieuString = intent.getStringExtra("kieuString");
        SinhVien sv = (SinhVien) intent.getSerializableExtra("sinhVien");

        txtKetQua.setText("Kiểu boolean: " + kieuBool + "\n"
            + "Kiểu char: " + kieuChar + "\n"
            + "Kiểu int: " + kieuInt + "\n"
            + "Kiểu double: "+ kieuDouble + "\n"
            + "Kiểu string: " + kieuString + "\n"
            + "Sinh viên: " + sv);

    }

}
