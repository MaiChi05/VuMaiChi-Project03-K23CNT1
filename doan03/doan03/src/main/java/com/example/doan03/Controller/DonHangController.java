package com.example.doan03.Controller;

import com.example.doan03.Entity.DonHang;
import com.example.doan03.Service.DonHangService;
import com.example.doan03.Service.KhachHangService; // Cần thêm service này
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/don-hang")
public class DonHangController {

    private final DonHangService service;
    private final KhachHangService khachHangService; // Khai báo thêm

    // Fix Constructor để Inject cả 2 service
    public DonHangController(DonHangService service, KhachHangService khachHangService) {
        this.service = service;
        this.khachHangService = khachHangService;
    }

    // 1. Trang danh sách
    @GetMapping("/list")
    public String list(Model model, HttpSession session) {
        if (session.getAttribute("user") == null) return "redirect:/login";
        model.addAttribute("list", service.findAll());
        return "dh-list"; // Đảm bảo file là src/main/resources/templates/dh-list.html
    }

    // 2. Trang thêm mới (Gây lỗi 404 nếu thiếu hàm này khi bấm nút + TẠO ĐƠN MỚI)
    @GetMapping("/add")
    public String addForm(Model model, HttpSession session) {
        if (session.getAttribute("user") == null) return "redirect:/login";
        model.addAttribute("donHang", new DonHang());
        model.addAttribute("khachHangs", khachHangService.findAll()); // Để đổ dữ liệu vào ô Select
        return "dh-form"; // Đảm bảo file là src/main/resources/templates/dh-form.html
    }

    // 3. Trang sửa (Gây lỗi 404 nếu thiếu hàm này khi bấm nút SỬA)
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable String id, Model model, HttpSession session) {
        if (session.getAttribute("user") == null) return "redirect:/login";
        model.addAttribute("donHang", service.findById(id));
        model.addAttribute("khachHangs", khachHangService.findAll());
        return "dh-form";
    }

    // 4. Xử lý lưu dữ liệu (Gây lỗi 404 sau khi bấm LƯU THÔNG TIN)
    @PostMapping("/save")
    public String save(@ModelAttribute("donHang") DonHang donHang, HttpSession session) {
        if (session.getAttribute("user") == null) return "redirect:/login";
        service.save(donHang);
        return "redirect:/don-hang/list";
    }

    // 5. Xử lý xóa
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable String id, HttpSession session) {
        if (session.getAttribute("user") == null) return "redirect:/login";
        service.delete(id);
        return "redirect:/don-hang/list";
    }
}