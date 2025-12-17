package com.example.doan03.Entity;


import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "chi_tiet_don_hang")
@IdClass(ChiTietDonHangId.class)
public class ChiTietDonHang {


    @Id
    @ManyToOne
    @JoinColumn(name = "ma_don_hang")
    private DonHang donHang;


    @Id
    @ManyToOne
    @JoinColumn(name = "ma_nuoc")
    private Nuoc nuoc;


    private int soLuong;
    private double gia;
}