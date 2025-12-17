package com.example.vmc.project3.Service;

import com.example.vmc.project3.entity.DonHang;
import com.example.vmc.project3.Repository.DonHangRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonHangService {

    private final DonHangRepository donHangRepository;

    public DonHangService(DonHangRepository donHangRepository) {
        this.donHangRepository = donHangRepository;
    }

    public List<DonHang> layTatCaDonHang() {
        return donHangRepository.findAll();
    }

    public DonHang layDonHangTheoId(String maDonHang) {
        return donHangRepository.findById(maDonHang).orElse(null);
    }

    public DonHang themHoacSuaDonHang(DonHang donHang) {
        return donHangRepository.save(donHang);
    }

    public void xoaDonHang(String maDonHang) {
        donHangRepository.deleteById(maDonHang);
    }
}
