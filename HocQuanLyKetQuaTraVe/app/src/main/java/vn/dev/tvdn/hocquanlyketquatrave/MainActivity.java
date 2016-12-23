package vn.dev.tvdn.hocquanlyketquatrave;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtA, txtB;
    Button btnXuLyUSBLN;
    TextView txtKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEnvents();
    }

    private void addEnvents() {
        btnXuLyUSBLN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyLayUSBLN();
            }
        });
    }

    private void xuLyLayUSBLN() {
        Intent intent = new Intent(MainActivity.this, ManHinhXuLyActivity.class);
        intent.putExtra("a", Integer.parseInt(txtA.getText().toString()));
        intent.putExtra("b", Integer.parseInt(txtB.getText().toString()));

        // Bước 1: Bạn phải gọi startActivityForResult
        startActivityForResult(intent, 99);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 99 && resultCode == 33) {
            int uscln = data.getIntExtra("USCLN", 1);
            txtKetQua.setText("USCLN = " + uscln);
        }
    }

    private void addControls() {
        txtA = (EditText) findViewById(R.id.txtA);
        txtB = (EditText) findViewById(R.id.txtB);
        btnXuLyUSBLN = (Button) findViewById(R.id.btnXuLyUSCLN);
        txtKetQua = (TextView) findViewById(R.id.txtKetQua);
    }
}
