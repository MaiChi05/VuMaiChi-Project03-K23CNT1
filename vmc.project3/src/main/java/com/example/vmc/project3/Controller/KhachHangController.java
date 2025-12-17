package com.example.vmc.project3.Controller;

import com.example.vmc.project3.entity.KhachHang;
import com.example.vmc.project3.Service.KhachHangService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/khach-hang")
public class KhachHangController {

    private final KhachHangService khachHangService;

    public KhachHangController(KhachHangService khachHangService) {
        this.khachHangService = khachHangService;
    }

    @GetMapping("/danh-sach")
    public List<KhachHang> layTatCa() {
        return khachHangService.layTatCaKhachHang();
    }

    @GetMapping("/{maKhachHang}")
    public KhachHang layTheoId(@PathVariable String maKhachHang) {
        return khachHangService.layKhachHangTheoId(maKhachHang);
    }

    @PostMapping("/them")
    public KhachHang them(@RequestBody KhachHang khachHang) {
        return khachHangService.themHoacSuaKhachHang(khachHang);
    }

    @PutMapping("/sua/{maKhachHang}")
    public KhachHang sua(@PathVariable String maKhachHang, @RequestBody KhachHang khachHang) {
        khachHang.setMaKhachHang(maKhachHang);
        return khachHangService.themHoacSuaKhachHang(khachHang);
    }

    @DeleteMapping("/xoa/{maKhachHang}")
    public void xoa(@PathVariable String maKhachHang) {
        khachHangService.xoaKhachHang(maKhachHang);
    }
}
