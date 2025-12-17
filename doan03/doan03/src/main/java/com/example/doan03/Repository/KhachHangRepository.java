package com.example.doan03.Repository;


import com.example.doan03.Entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;


public interface KhachHangRepository extends JpaRepository<KhachHang, String> {
}