package com.example.vmc.project3.Service;


import com.example.vmc.project3.entity.KhachHang;
import com.example.vmc.project3.Repository.KhachHangRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachHangService {

    private final KhachHangRepository khachHangRepository;

    public KhachHangService(KhachHangRepository khachHangRepository) {
        this.khachHangRepository = khachHangRepository;
    }

    public List<KhachHang> layTatCaKhachHang() {
        return khachHangRepository.findAll();
    }

    public KhachHang layKhachHangTheoId(String maKhachHang) {
        return khachHangRepository.findById(maKhachHang).orElse(null);
    }

    public KhachHang themHoacSuaKhachHang(KhachHang khachHang) {
        return khachHangRepository.save(khachHang);
    }

    public void xoaKhachHang(String maKhachHang) {
        khachHangRepository.deleteById(maKhachHang);
    }
}
