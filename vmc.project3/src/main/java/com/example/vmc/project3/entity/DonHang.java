package com.example.vmc.project3.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "don_hang")
public class DonHang {

    @Id
    @Column(name = "ma_don_hang")
    private String maDonHang;

    @Column(name = "ma_khach_hang")
    private String maKhachHang;

    @Column(name = "ngay_dat")
    private Date ngayDat;

    @Column(name = "trang_thai")
    private int trangThai;

    // Getter + Setter
}
