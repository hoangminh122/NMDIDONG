package com.example.minh.myapplication.DAO;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.minh.myapplication.DTO.nhanvienDTO;
import com.example.minh.myapplication.Database.Createdatabase;

import java.net.NoRouteToHostException;

public class nhanvienDAO {

    SQLiteDatabase database;
    public nhanvienDAO(Context context)
    {
        Createdatabase createDatabase =new Createdatabase(context);
        database=createDatabase.open();

    }
public long ThemNhanVien(nhanvienDTO nhanvienDTO)
{
    ContentValues contentvalue=new ContentValues();
    contentvalue.put(Createdatabase.TB_NHANVIEN_TENDN,nhanvienDTO.getTENDN());
    contentvalue.put(Createdatabase.TB_NHANVIEN_CMND,nhanvienDTO.getCMND());
    contentvalue.put(Createdatabase.TB_NHANVIEN_GIOITINH,nhanvienDTO.getGIOITINH());
    contentvalue.put(Createdatabase.TB_NHANVIEN_MATKHAU,nhanvienDTO.getMATKHAU());
    contentvalue.put(Createdatabase.TB_NHANVIEN_NGAYSINH,nhanvienDTO.getNGAYSINH());
     long kiemtra=database.insert(Createdatabase.TB_NHANVIEN,null,contentvalue);
     return kiemtra;
}
}
