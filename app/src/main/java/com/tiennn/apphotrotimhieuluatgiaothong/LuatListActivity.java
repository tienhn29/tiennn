package com.tiennn.apphotrotimhieuluatgiaothong;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class LuatListActivity extends AppCompatActivity {
    LuatAdapter mAdapter;
    List<Luat> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracuuluat);
        init();
    }

    private void init() {
        // Vào CSDL load dữ liệu
        QuanLyDataLuat quanLy = new QuanLyDataLuat(this);
        mList = quanLy.read();
        mAdapter = new LuatAdapter(this, R.layout.item_tracuuluat, mList);
        // mAdapter.notifyDataSetChanged();
        ListView lstViewLuat = (ListView) findViewById(R.id.lvTracuuluat);
        lstViewLuat.setAdapter(mAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        init();
    }

}
