package com.tiennn.apphotrotimhieuluatgiaothong;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class BienBaoAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<BienBao> bienBaos;

    public BienBaoAdapter(Context context, int layout, List<BienBao> bienBaos) {
        this.context = context;
        this.layout = layout;
        this.bienBaos = bienBaos;
    }

    @Override
    public int getCount() {
        return bienBaos.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);
        ImageView imgAvatar = view.findViewById(R.id.imgAvatar);
        TextView txtText = view.findViewById(R.id.txtText);
        TextView txtText1 = view.findViewById(R.id.txtText1);

        BienBao bienBao = bienBaos.get(position);

        txtText.setText(bienBao.getText());
        txtText1.setText(bienBao.getText1());
        imgAvatar.setImageResource(bienBao.getAnh());
        return view;
    }
}
