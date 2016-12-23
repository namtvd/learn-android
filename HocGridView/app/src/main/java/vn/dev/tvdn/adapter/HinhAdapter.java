package vn.dev.tvdn.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.List;

import vn.dev.tvdn.hocgridview.R;

/**
 * Created by zznamtran123 on 05/05/2016.
 */
public class HinhAdapter extends ArrayAdapter<Integer> {

    Activity contex;
    int resource;
    List<Integer> objects;

    public HinhAdapter(Activity context, int resource, List<Integer> objects) {
        super(context, resource, objects);
        this.contex = context;
        this.resource = resource;
        this.objects = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = this.contex.getLayoutInflater();
        View row = inflater.inflate(this.resource, null);
        ImageView img = (ImageView) row.findViewById(R.id.imgHinh);
        img.setImageResource(this.objects.get(position));
        return row;
    }
}
