package com.nn.nn_app_karaoke.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import com.nn.nn_app_karaoke.R;
import com.nn.nn_app_karaoke.model.BaiHat;

import java.util.List;

/**
 * Created by NguyenNhan on 06/18/2016.
 */
public class adapterBaiHat extends ArrayAdapter<BaiHat> {

    Activity context;
    int resource;
    List<BaiHat> objects;

    public adapterBaiHat(Activity context, int resource, List<BaiHat> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View row = inflater.inflate(this.resource, null);

        TextView lbTenBH = (TextView) row.findViewById(R.id.lbTenBH);
        TextView lbMaBH = (TextView) row.findViewById(R.id.lbMaBH);
        TextView lbTenCaSi = (TextView) row.findViewById(R.id.lbTenCaSi);

        ImageButton btnLike = (ImageButton) row.findViewById(R.id.btnLike);
        ImageButton btnDisLike = (ImageButton) row.findViewById(R.id.btnDisLike);

        BaiHat baiHat = this.objects.get(position);
        lbTenBH.setText(baiHat.getTenBH());
        lbMaBH.setText(baiHat.getMaBH());
        lbTenCaSi.setText(baiHat.getTenCaSi());

        return row;
    }
}
