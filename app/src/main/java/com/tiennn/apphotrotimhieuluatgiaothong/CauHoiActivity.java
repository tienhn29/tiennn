package com.tiennn.apphotrotimhieuluatgiaothong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.List;

public class CauHoiActivity extends AppCompatActivity {
    CauHoiAdapter mAdapter;
    List<CauHoi> mList;
    RadioButton btn_text1,btn_text2,btn_text3;
    RadioGroup btn_radiogroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau_hoi);
        init();
    }

    private void init() {
        // Vào CSDL load dữ liệu
        QuanLyDataCauHoi quanLy = new QuanLyDataCauHoi(this);
        mList = quanLy.read();
        mAdapter = new CauHoiAdapter(this, R.layout.item_cauhoi, mList);
        // mAdapter.notifyDataSetChanged();
        ListView lstViewCauHoi = (ListView) findViewById(R.id.lvcauhoi);
        lstViewCauHoi.setAdapter(mAdapter);


        btn_radiogroup = findViewById(R.id.btn_ridiogroup);
        btn_text1 = findViewById(R.id.btn_text1);
        btn_text2 = findViewById(R.id.btn_text2);
        btn_text3 = findViewById(R.id.btn_text3);

        //for (int i = 0 ; i < mList.size();i++){
        //    if (mList.get(i).getDapan() == 1){
        //        Toast.makeText(CauHoiActivity.this, "Đúng",
        //                Toast.LENGTH_SHORT).show();
        //    }else {
        //        Toast.makeText(CauHoiActivity.this, "Sai",
        //                Toast.LENGTH_SHORT).show();
         //   }
      //  }
    }

    @Override
    protected void onResume() {
        super.onResume();
        init();
    }

}