package com.example.vmc.project3.Controller;

import com.example.vmc.project3.entity.ChiTietDonHang;
import com.example.vmc.project3.entity.ChiTietDonHangId;
import com.example.vmc.project3.Service.ChiTietDonHangService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chi-tiet-don-hang")
public class ChiTietDonHangController {

    private final ChiTietDonHangService chiTietDonHangService;

    public ChiTietDonHangController(ChiTietDonHangService chiTietDonHangService) {
        this.chiTietDonHangService = chiTietDonHangService;
    }

    @GetMapping("/danh-sach")
    public List<ChiTietDonHang> layTatCa() {
        return chiTietDonHangService.layTatCaChiTiet();
    }

    @GetMapping("/lay")
    public ChiTietDonHang layTheoId(@RequestParam String maDonHang, @RequestParam String maNuoc) {
        ChiTietDonHangId id = new ChiTietDonHangId();
        id.donHang = maDonHang;
        id.nuoc = maNuoc;
        return chiTietDonHangService.layTheoId(id);
    }

    @PostMapping("/them")
    public ChiTietDonHang them(@RequestBody ChiTietDonHang chiTiet) {
        return chiTietDonHangService.themHoacSuaChiTiet(chiTiet);
    }

    @PutMapping("/sua")
    public ChiTietDonHang sua(@RequestBody ChiTietDonHang chiTiet) {
        return chiTietDonHangService.themHoacSuaChiTiet(chiTiet);
    }

    @DeleteMapping("/xoa")
    public void xoa(@RequestParam String maDonHang, @RequestParam String maNuoc) {
        ChiTietDonHangId id = new ChiTietDonHangId();
        id.donHang = maDonHang;
        id.nuoc = maNuoc;
        chiTietDonHangService.xoaChiTiet(id);
    }
}
