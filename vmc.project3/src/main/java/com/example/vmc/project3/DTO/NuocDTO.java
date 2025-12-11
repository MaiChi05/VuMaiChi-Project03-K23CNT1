package com.example.vmc.project3.DTO;

public class WaterDTO {

    private String ma;
    private String ten;
    private String moTa;
    private String hinhAnh;
    private double gia;
    private int soLuong;

    public WaterDTO() {
    }

    public WaterDTO(String ma, String ten, String moTa, String hinhAnh, double gia, int soLuong) {
        this.ma = ma;
        this.ten = ten;
        this.moTa = moTa;
        this.hinhAnh = hinhAnh;
        this.gia = gia;
        this.soLuong = soLuong;
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
    public double getGia() { return gia; }
    public void setGia(double gia) { this.gia = gia; }
    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }
}
