package com.tiennn.apphotrotimhieuluatgiaothong;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class LuatAdapter extends ArrayAdapter<Luat> {

    Context mCtx;
    int mResLayout;
    List<Luat> mLst;


    public LuatAdapter(Context context, int resource, List<Luat> objects) {
        super(context, resource, objects);

        this.mCtx = context;
        this.mResLayout = resource;
        this.mLst = objects;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            row = LayoutInflater.from(mCtx).inflate(mResLayout, null);
        }

        Luat l = mLst.get(position);

        ((TextView) row.findViewById(R.id.txtText2)).setText(l.getText2());
        ((TextView) row.findViewById(R.id.txtText3)).setText(l.getText3());

        return row;
    }
}

