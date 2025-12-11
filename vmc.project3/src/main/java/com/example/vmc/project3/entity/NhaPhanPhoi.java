package com.example.vmc.project3.entity;

public class Distributor {

    private String ma;
    private String ten;
    private String email;
    private String soDienThoai;
    private String diaChi;

    public Distributor() {}

    public Distributor(String ma, String ten, String email, String soDienThoai, String diaChi) {
        this.ma = ma;
        this.ten = ten;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
    }

    // getter & setter
    public String getMa() { return ma; }
    public void setMa(String ma) { this.ma = ma; }
    public String getTen() { return ten; }
    public void setTen(String ten) { this.ten = ten; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getSoDienThoai() { return soDienThoai; }
    public void setSoDienThoai(String soDienThoai) { this.soDienThoai = soDienThoai; }
    public String getDiaChi() { return diaChi; }
    public void setDiaChi(String diaChi) { this.diaChi = diaChi; }
}
