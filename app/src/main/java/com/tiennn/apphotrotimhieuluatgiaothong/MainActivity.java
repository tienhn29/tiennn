package com.tiennn.apphotrotimhieuluatgiaothong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private LinearLayout btn_traCuuLuat;
    private LinearLayout btn_bienBao,btn_hoiDapNhanh,btnGioiThieu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    private void initViews(){
        btn_traCuuLuat = findViewById(R.id.btn_traCuuLuat);
        btn_bienBao = findViewById(R.id.btn_BienBao);
        btn_hoiDapNhanh = findViewById(R.id.btn_hoidapnhanh);
        btnGioiThieu = findViewById(R.id.btnGioiThieu);


        btn_traCuuLuat.setOnClickListener(this);
        btn_bienBao.setOnClickListener(this);
        btn_hoiDapNhanh.setOnClickListener(this);
        btnGioiThieu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_traCuuLuat:
                startTraCuuLuat();
                break;
            case R.id.btn_BienBao:
                startBienBao();
                break;
            case R.id.btn_hoidapnhanh:
                startHoiDapNhanh();
                break;
            case R.id.btnGioiThieu:
                startVideo();
                break;
            default:
                break;
        }
    }
    private void startTraCuuLuat(){
        Intent i = new Intent(MainActivity.this,LuatListActivity.class);
        startActivity(i);
    }
    private void startBienBao(){
        Intent i1 = new Intent(MainActivity.this,BienBaoListActivity.class);
        startActivity(i1);
    }
    private void startHoiDapNhanh(){
        Intent i2 = new Intent(MainActivity.this,CauHoiActivity.class);
        startActivity(i2);
    }
    private void startVideo(){
        Intent i3 = new Intent(MainActivity.this,ListVideoActivity.class);
        startActivity(i3);
    }
}
