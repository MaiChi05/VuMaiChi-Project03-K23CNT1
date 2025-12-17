package com.example.vmc.project3.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "nuoc")
public class Nuoc {

    @Id
    @Column(name = "ma_nuoc")
    private String maNuoc;

    @Column(name = "ten_nuoc")
    private String tenNuoc;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "hinh_anh")
    private String hinhAnh;

    @Column(name = "so_luong")
    private int soLuong;

    @Column(name = "gia")
    private double gia;

    @Column(name = "trang_thai")
    private int trangThai;

    // Getter + Setter
}
