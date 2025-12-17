package com.example.vmc.project3.DTO;

import java.util.Date;
import java.util.List;

public class DonHangDTO {
    private String maDonHang;
    private String maKhachHang;
    private Date ngayDat;
    private int trangThai;
    private List<ChiTietDonHangDTO> chiTietDonHangs;

    // getters & setters
    public String getMaDonHang() { return maDonHang; }
    public void setMaDonHang(String maDonHang) { this.maDonHang = maDonHang; }

    public String getMaKhachHang() { return maKhachHang; }
    public void setMaKhachHang(String maKhachHang) { this.maKhachHang = maKhachHang; }

    public Date getNgayDat() { return ngayDat; }
    public void setNgayDat(Date ngayDat) { this.ngayDat = ngayDat; }

    public int getTrangThai() { return trangThai; }
    public void setTrangThai(int trangThai) { this.trangThai = trangThai; }

    public List<ChiTietDonHangDTO> getChiTietDonHangs() { return chiTietDonHangs; }
    public void setChiTietDonHangs(List<ChiTietDonHangDTO> chiTietDonHangs) { this.chiTietDonHangs = chiTietDonHangs; }
}
