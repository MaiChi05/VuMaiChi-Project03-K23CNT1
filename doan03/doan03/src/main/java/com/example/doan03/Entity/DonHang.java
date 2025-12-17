package com.example.doan03.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;

@Entity
@Table(name = "don_hang")
@Data
public class DonHang {

    @Id
    @Column(name = "ma_don_hang")
    private String maDonHang;

    @Column(name = "ngay_dat")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate ngayDat;

    @Column(name = "trang_thai")
    private boolean trangThai; // TINYINT(1) khớp với boolean

    @ManyToOne
    @JoinColumn(name = "ma_khach_hang")
    private KhachHang khachHang;
}