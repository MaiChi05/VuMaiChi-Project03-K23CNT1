package com.example.vmc.project3.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "chi_tiet_don_hang")
public class ChiTietDonHang {

    @Id
    @Column(name = "ma_don_hang")
    private String maDonHang;

    @Column(name = "ma_nuoc")
    private String maNuoc;

    @Column(name = "so_luong")
    private int soLuong;

    @Column(name = "gia")
    private double gia;

    // Getter + Setter
}
