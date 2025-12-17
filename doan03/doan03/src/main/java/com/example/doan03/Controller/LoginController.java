package com.example.doan03.Controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // Mở file login.html
    }

    @PostMapping("/login")
    public String doLogin(@RequestParam String username,
                          @RequestParam String password,
                          HttpSession session) {
        // Kiểm tra tài khoản thủ công
        if ("admin".equals(username) && "123".equals(password)) {
            session.setAttribute("user", username); // Lưu tên user vào phiên làm việc
            return "redirect:/nha-phan-phoi/list";
        }
        return "redirect:/login?error"; // Sai pass thì quay lại trang login
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate(); // Xóa sạch Session (Đăng xuất)
        return "redirect:/login";
    }
}