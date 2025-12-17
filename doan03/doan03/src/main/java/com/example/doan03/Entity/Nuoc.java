package com.example.doan03.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "nuoc")
public class Nuoc {

    @Id
    @Column(name = "ma_nuoc", length = 50)  // Khớp với DB
    private String maNuoc;

    @Column(name = "ten_nuoc", nullable = false)
    private String tenNuoc;

    @Column(columnDefinition = "TEXT")
    private String moTa;

    @Column(name = "hinh_anh")
    private String hinhAnh;

    @Column(name = "so_luong")
    private int soLuong;

    private double gia;

    @Column(name = "trang_thai")
    private boolean trangThai;
}
