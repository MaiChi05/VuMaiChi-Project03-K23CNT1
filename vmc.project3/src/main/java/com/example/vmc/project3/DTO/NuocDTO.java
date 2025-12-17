package com.example.vmc.project3.DTO;

public class NuocDTO {
    private String maNuoc;
    private String tenNuoc;
    private String moTa;
    private String hinhAnh;
    private int soLuong;
    private double gia;
    private int trangThai;

    public String getMaNuoc() { return maNuoc; }
    public void setMaNuoc(String maNuoc) { this.maNuoc = maNuoc; }

    public String getTenNuoc() { return tenNuoc; }
    public void setTenNuoc(String tenNuoc) { this.tenNuoc = tenNuoc; }

    public String getMoTa() { return moTa; }
    public void setMoTa(String moTa) { this.moTa = moTa; }

    public String getHinhAnh() { return hinhAnh; }
    public void setHinhAnh(String hinhAnh) { this.hinhAnh = hinhAnh; }

    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }

    public double getGia() { return gia; }
    public void setGia(double gia) { this.gia = gia; }

    public int getTrangThai() { return trangThai; }
    public void setTrangThai(int trangThai) { this.trangThai = trangThai; }
}
