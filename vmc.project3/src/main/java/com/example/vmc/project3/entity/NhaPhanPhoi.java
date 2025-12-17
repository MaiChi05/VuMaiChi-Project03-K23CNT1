package com.example.vmc.project3.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "nha_phan_phoi")
public class NhaPhanPhoi {

    @Id
    @Column(name = "ma_nha_phan_phoi")
    private String maNpp;

    @Column(name = "ten_nha_phan_phoi")
    private String tenNpp;

    private String email;

    @Column(name = "so_dien_thoai")
    private String soDienThoai;

    @Column(name = "dia_chi")
    private String diaChi;

    // Getter + Setter
}
