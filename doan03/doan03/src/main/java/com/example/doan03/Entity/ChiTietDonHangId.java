package com.example.doan03.Entity;
import java.io.Serializable;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChiTietDonHangId implements Serializable {
    private String donHang;
    private String nuoc;
}