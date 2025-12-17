package com.example.vmc.project3.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "khach_hang")
public class KhachHang {

    @Id
    @Column(name = "ma_khach_hang")
    private String maKhachHang;

    @Column(name = "ten_khach_hang")
    private String tenKhachHang;

    private String email;

    @Column(name = "so_dien_thoai")
    private String soDienThoai;

    @Column(name = "dia_chi")
    private String diaChi;

    // Getter + Setter
}
