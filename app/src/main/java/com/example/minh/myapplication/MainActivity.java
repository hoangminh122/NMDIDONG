package com.example.minh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.minh.myapplication.Database.Createdatabase;
import com.example.minh.myapplication.FragmentApp.DatePickerFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,View.OnFocusChangeListener {

    EditText edTenDangNhapDK,edMatKhauDK,edNgaySinhDK,edCMNDDK;
    Button btnDongYDK, btnThoatDK;
    RadioGroup  rgGioiTinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edTenDangNhapDK=(EditText)findViewById(R.id.edTenDangNhap);
        edMatKhauDK=(EditText)findViewById(R.id.edPassword);
        edCMNDDK=(EditText)findViewById(R.id.edCmnd);
        edNgaySinhDK=(EditText)findViewById(R.id.edNgaySinh);
        btnDongYDK=(Button)findViewById(R.id.btnDongY);
        btnThoatDK=(Button)findViewById(R.id.btnThoat);
        rgGioiTinh=(RadioGroup)findViewById(R.id.rdGioiTinh);

        edNgaySinhDK.setOnFocusChangeListener(this);
        btnThoatDK.setOnClickListener(this);
        btnDongYDK.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int id=v.getId();
        switch(id)
        {
            case R.id.btnDongY:
                String sTenDangNhap=edTenDangNhapDK.getText().toString();
                String sMatKhau=edMatKhauDK.getText().toString();

                ; break;

            case R.id.btnThoat:
                finish(); break;
        }
    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        int id=v.getId();
        switch(id)
        {
            case R.id.edNgaySinh:
                if(hasFocus) {
                    DatePickerFragment  datePickerFragment=new DatePickerFragment();
                    datePickerFragment.show(getSupportFragmentManager(),"ngaysinh");
                     //Xuat bang ngay sinh
                    
                }
        }
    }
}
