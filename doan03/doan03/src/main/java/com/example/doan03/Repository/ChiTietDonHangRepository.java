package com.example.doan03.Repository;
import com.example.doan03.Entity.ChiTietDonHang;
import com.example.doan03.Entity.ChiTietDonHangId;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ChiTietDonHangRepository extends JpaRepository<ChiTietDonHang, ChiTietDonHangId> {
}