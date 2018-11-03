package com.example.minh.myapplication.DTO;

public class nhanvienDTO {

    int MANV,CMND;
    String TENDN,MATKHAU,GIOITINH,NGAYSINH;

    public void setMANV(int MANV) {
        this.MANV = MANV;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    public void setTENDN(String TENDN) {
        this.TENDN = TENDN;
    }

    public void setMATKHAU(String MATKHAU) {
        this.MATKHAU = MATKHAU;
    }

    public void setGIOITINH(String GIOITINH) {
        this.GIOITINH = GIOITINH;
    }

    public void setNGAYSINH(String NGAYSINH) {
        this.NGAYSINH = NGAYSINH;
    }



    public int getMANV() {
        return MANV;
    }

    public int getCMND() {
        return CMND;
    }

    public String getTENDN() {
        return TENDN;
    }

    public String getMATKHAU() {
        return MATKHAU;
    }

    public String getGIOITINH() {
        return GIOITINH;
    }

    public String getNGAYSINH() {
        return NGAYSINH;
    }



}
