package com.example.vmc.project3.entity;
import jakarta.persistence.*;
import java.io.Serializable;

@Embeddable
public class ChiTietDonHangId implements Serializable {

    @Column(name = "ma_don_hang")
    private String maDonHang;

    @Column(name = "ma_nuoc")
    private String maNuoc;

    // Getter + Setter + equals + hashCode
}
