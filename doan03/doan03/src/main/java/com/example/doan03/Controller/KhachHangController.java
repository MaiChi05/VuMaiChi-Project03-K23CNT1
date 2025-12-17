package com.example.doan03.Controller;

import com.example.doan03.Entity.KhachHang;
import com.example.doan03.Service.KhachHangService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/khach-hang")
public class KhachHangController {


    private final KhachHangService service;


    public KhachHangController(KhachHangService service) {
        this.service = service;
    }


    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("list", service.findAll());
        return "kh-list";
    }


    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("kh", new KhachHang());
        return "kh-form";
    }


    @PostMapping("/save")
    public String save(@ModelAttribute("kh") KhachHang kh) {
        service.save(kh);
        return "redirect:/khach-hang/list";
    }


    @GetMapping("/edit/{id}")
    public String edit(@PathVariable String id, Model model) {
        model.addAttribute("kh", service.findById(id));
        return "kh-form";
    }


    @GetMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        service.delete(id);
        return "redirect:/khach-hang/list";
    }
}