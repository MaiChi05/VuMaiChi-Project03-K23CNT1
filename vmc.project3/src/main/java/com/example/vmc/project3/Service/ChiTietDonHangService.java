package com.example.vmc.project3.Service;

import com.example.vmc.project3.entity.ChiTietDonHang;
import com.example.vmc.project3.entity.ChiTietDonHangId;
import com.example.vmc.project3.Repository.ChiTietDonHangRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiTietDonHangService {

    private final ChiTietDonHangRepository chiTietDonHangRepository;

    public ChiTietDonHangService(ChiTietDonHangRepository chiTietDonHangRepository) {
        this.chiTietDonHangRepository = chiTietDonHangRepository;
    }

    public List<ChiTietDonHang> layTatCaChiTiet() {
        return chiTietDonHangRepository.findAll();
    }

    public ChiTietDonHang layTheoId(ChiTietDonHangId id) {
        return chiTietDonHangRepository.findById(id).orElse(null);
    }

    public ChiTietDonHang themHoacSuaChiTiet(ChiTietDonHang chiTiet) {
        return chiTietDonHangRepository.save(chiTiet);
    }

    public void xoaChiTiet(ChiTietDonHangId id) {
        chiTietDonHangRepository.deleteById(id);
    }
}
