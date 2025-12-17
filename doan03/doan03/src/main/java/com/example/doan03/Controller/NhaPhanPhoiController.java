package com.example.doan03.Controller;

import com.example.doan03.Entity.NhaPhanPhoi;
import com.example.doan03.Service.NhaPhanPhoiService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/nha-phan-phoi")
public class NhaPhanPhoiController {

    @Autowired
    private NhaPhanPhoiService service;

    /**
     * Hàm tiện ích để kiểm tra người dùng đã đăng nhập chưa.
     * Trả về true nếu CHƯA đăng nhập.
     */
    private boolean isNotLoggedIn(HttpSession session) {
        return session.getAttribute("user") == null;
    }

    // ================= LIST =================
    @GetMapping("/list")
    public String list(Model model, HttpSession session) {
        if (isNotLoggedIn(session)) {
            return "redirect:/login"; // Nếu chưa đăng nhập, đá về trang login
        }
        model.addAttribute("list", service.findAll());
        return "npp-list";
    }

    // ================= ADD FORM =================
    @GetMapping("/add")
    public String addForm(Model model, HttpSession session) {
        if (isNotLoggedIn(session)) {
            return "redirect:/login";
        }
        model.addAttribute("npp", new NhaPhanPhoi());
        return "npp-form";
    }

    // ================= SAVE =================
    @PostMapping("/save")
    public String save(@ModelAttribute("npp") NhaPhanPhoi npp, HttpSession session) {
        if (isNotLoggedIn(session)) {
            return "redirect:/login";
        }
        service.save(npp);
        return "redirect:/nha-phan-phoi/list";
    }

    // ================= EDIT =================
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, Model model, HttpSession session) {
        if (isNotLoggedIn(session)) {
            return "redirect:/login";
        }
        NhaPhanPhoi npp = service.findById(id);
        if (npp == null) {
            return "redirect:/nha-phan-phoi/list";
        }
        model.addAttribute("npp", npp);
        return "npp-form";
    }

    // ================= DELETE =================
    @PostMapping("/delete/{id}")
    public String delete(@PathVariable("id") String id, HttpSession session) {
        if (isNotLoggedIn(session)) {
            return "redirect:/login";
        }
        service.delete(id);
        return "redirect:/nha-phan-phoi/list";
    }
}