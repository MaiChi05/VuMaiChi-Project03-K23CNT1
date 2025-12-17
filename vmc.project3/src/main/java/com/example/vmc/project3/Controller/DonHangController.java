package com.example.vmc.project3.Controller;

import com.example.vmc.project3.entity.DonHang;
import com.example.vmc.project3.Service.DonHangService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/don-hang")
public class DonHangController {

    private final DonHangService donHangService;

    public DonHangController(DonHangService donHangService) {
        this.donHangService = donHangService;
    }

    @GetMapping("/danh-sach")
    public List<DonHang> layTatCa() {
        return donHangService.layTatCaDonHang();
    }

    @GetMapping("/{maDonHang}")
    public DonHang layTheoId(@PathVariable String maDonHang) {
        return donHangService.layDonHangTheoId(maDonHang);
    }

    @PostMapping("/them")
    public DonHang them(@RequestBody DonHang donHang) {
        return donHangService.themHoacSuaDonHang(donHang);
    }

    @PutMapping("/sua/{maDonHang}")
    public DonHang sua(@PathVariable String maDonHang, @RequestBody DonHang donHang) {
        donHang.setMaDonHang(maDonHang);
        return donHangService.themHoacSuaDonHang(donHang);
    }

    @DeleteMapping("/xoa/{maDonHang}")
    public void xoa(@PathVariable String maDonHang) {
        donHangService.xoaDonHang(maDonHang);
    }
}
