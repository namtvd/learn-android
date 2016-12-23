package vn.dev.tvdn.hoccheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox chkAndroid, chkWindowsPhone, chkIOS;
    Button btnChon;
    TextView txtMonHoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addEvents() {
        btnChon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyChonMonHoc();
            }
        });
    }

    private void xuLyChonMonHoc() {
        String str = "";
        if (chkAndroid.isChecked()) {
            str += chkAndroid.getText().toString() + "\n";
        }
        if (chkWindowsPhone.isChecked()) {
            str += chkWindowsPhone.getText().toString() + "\n";
        }
        if (chkIOS.isChecked()) {
            str += chkIOS.getText().toString();
        }
        txtMonHoc.setText(str);
    }

    private void addControls() {
        chkAndroid = (CheckBox) findViewById(R.id.chkAndroid);
        chkWindowsPhone = (CheckBox) findViewById(R.id.chkWindowsPhone);
        chkIOS = (CheckBox) findViewById(R.id.chkIOS);
        btnChon = (Button) findViewById(R.id.btnChon);
        txtMonHoc = (TextView) findViewById(R.id.txtMonHoc);
    }
}
