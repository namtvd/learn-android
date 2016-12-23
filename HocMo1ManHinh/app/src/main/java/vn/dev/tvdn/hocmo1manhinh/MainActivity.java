package vn.dev.tvdn.hocmo1manhinh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moMotManHinh(View view) {
        // đối số 1: là màn hình hiện tại của intent này (tên Activity.this)
        // đối số 2: là màn hình mà bạn muốn mở lên (tên Actitity.class)
        Intent i = new Intent(MainActivity.this, ManHinh2Activity.class);
        // gửi lệnh đến android system để mở màn hình
        startActivity(i);
    }
}
