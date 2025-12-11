package com.example.vmc.project3.entity;

public class Water {

    private String ma;
    private String ten;
    private String moTa;
    private String hinhAnh;
    private int soLuong;
    private double gia;
    private boolean trangThai;

    public Water() {
    }

    public Water(String ma, String ten, String moTa, String hinhAnh, int soLuong, double gia, boolean trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.moTa = moTa;
        this.hinhAnh = hinhAnh;
        this.soLuong = soLuong;
        this.gia = gia;
        this.trangThai = trangThai;
    }

    // getter & setter
    public String getMa() { return ma; }
    public void setMa(String ma) { this.ma = ma; }
    public String getTen() { return ten; }
    public void setTen(String ten) { this.ten = ten; }
    public String getMoTa() { return moTa; }
    public void setMoTa(String moTa) { this.moTa = moTa; }
    public String getHinhAnh() { return hinhAnh; }
    public void setHinhAnh(String hinhAnh) { this.hinhAnh = hinhAnh; }
    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }
    public double getGia() { return gia; }
    public void setGia(double gia) { this.gia = gia; }
    public boolean isTrangThai() { return trangThai; }
    public void setTrangThai(boolean trangThai) { this.trangThai = trangThai; }
}
