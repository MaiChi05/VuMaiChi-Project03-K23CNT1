package com.example.doan03.Entity;



import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
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


    private String diaChi;
}