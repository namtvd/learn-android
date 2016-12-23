package vn.dev.tvdn.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import vn.dev.tvdn.hoclistviewnangcao.R;
import vn.dev.tvdn.model.DanhBa;

/**
 * Created by zznamtran123 on 02/05/2016.
 */
public class DanhBaAdapter extends ArrayAdapter<DanhBa> {

    // dối số 1: màn hình sử dụng layout này.
    Activity context;
    // layout cho từng dòng muốn hiển thị. (làm theo khách hàng)
    int resource;
    // danh sách nguồn dữ liệu muốn hiển thị
    List<DanhBa> objects;

    public DanhBaAdapter(Activity context, int resource, List<DanhBa> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View row = inflater.inflate(this.resource, null);

        TextView txtTen = (TextView) row.findViewById(R.id.txtTen);
        TextView txtPhone = (TextView) row.findViewById(R.id.txtPhone);
        ImageButton btnCall = (ImageButton) row.findViewById(R.id.btnCall);
        ImageButton btnSms = (ImageButton) row.findViewById(R.id.btnSms);
        ImageButton btnDetail = (ImageButton) row.findViewById(R.id.btnDetail);

        // Trả về danh bạn hiện tại muốn vẽ.
        final DanhBa danhBa = this.objects.get(position);
        txtTen.setText(danhBa.getTen());
        txtPhone.setText(danhBa.getPhone());

        btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyXemChiTiet(danhBa);
            }
        });

        return row;
    }

    private void xuLyXemChiTiet(DanhBa danhBa) {
        Toast.makeText(this.context, "Bạn chọn: " + danhBa.getTen(), Toast.LENGTH_SHORT).show();
    }
}
