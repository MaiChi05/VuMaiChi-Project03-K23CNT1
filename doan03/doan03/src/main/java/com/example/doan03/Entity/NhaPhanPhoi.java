package com.example.doan03.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "nha_phan_phoi")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NhaPhanPhoi {

    @Id
    @Column(name = "ma_nha_phan_phoi", length = 50)
    private String maNhaPhanPhoi;

    @Column(name = "ten_nha_phan_phoi", nullable = false)
    private String tenNhaPhanPhoi;

    private String email;

    @Column(name = "so_dien_thoai")
    private String soDienThoai;

    private String diaChi;
}
