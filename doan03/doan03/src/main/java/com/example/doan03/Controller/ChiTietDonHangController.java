package com.example.doan03.Controller;


import com.example.doan03.Entity.ChiTietDonHang;
import com.example.doan03.Entity.ChiTietDonHangId;
import com.example.doan03.Service.ChiTietDonHangService;
import com.example.doan03.Service.DonHangService;
import com.example.doan03.Service.NuocService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/chi-tiet-don-hang")
public class ChiTietDonHangController {


    private final ChiTietDonHangService service;
    private final DonHangService donHangService;
    private final NuocService nuocService;


    public ChiTietDonHangController(ChiTietDonHangService service, DonHangService donHangService, NuocService nuocService) {
        this.service = service;
        this.donHangService = donHangService;
        this.nuocService = nuocService;
    }


    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("list", service.findAll());
        return "ctdh-list";
    }


    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("ctdh", new ChiTietDonHang());
        model.addAttribute("donHangs", donHangService.findAll());
        model.addAttribute("nuocs", nuocService.findAll());
        return "ctdh-form";
    }


    @PostMapping("/save")
    public String save(@ModelAttribute("ctdh") ChiTietDonHang ctdh) {
        service.save(ctdh);
        return "redirect:/chi-tiet-don-hang/list";
    }


    @GetMapping("/edit")
    public String edit(@RequestParam String maDonHang, @RequestParam String maNuoc, Model model) {
        ChiTietDonHangId id = new ChiTietDonHangId(maDonHang, maNuoc);
        model.addAttribute("ctdh", service.findById(id));
        model.addAttribute("donHangs", donHangService.findAll());
        model.addAttribute("nuocs", nuocService.findAll());
        return "ctdh-form";
    }


    @GetMapping("/delete")
    public String delete(@RequestParam String maDonHang, @RequestParam String maNuoc) {
        ChiTietDonHangId id = new ChiTietDonHangId(maDonHang, maNuoc);
        service.delete(id);
        return "redirect:/chi-tiet-don-hang/list";
    }
}