package com.example.vmc.project3.DTO;


public class ChiTietDonHangDTO {
    private String maDonHang;
    private String maNuoc;
    private int soLuong;
    private double gia;

    // getters & setters
    public String getMaDonHang() { return maDonHang; }
    public void setMaDonHang(String maDonHang) { this.maDonHang = maDonHang; }

    public String getMaNuoc() { return maNuoc; }
    public void setMaNuoc(String maNuoc) { this.maNuoc = maNuoc; }

    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }

    public double getGia() { return gia; }
    public void setGia(double gia) { this.gia = gia; }
}
