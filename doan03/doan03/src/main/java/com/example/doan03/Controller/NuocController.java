package com.example.doan03.Controller;

import com.example.doan03.Entity.Nuoc;
import com.example.doan03.Service.NuocService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/nuoc")
public class NuocController {

    private final NuocService nuocService;

    public NuocController(NuocService nuocService) {
        this.nuocService = nuocService;
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("list", nuocService.findAll());
        return "nuoc-list";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("nuoc", new Nuoc());
        return "nuoc-form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("nuoc") Nuoc nuoc) {
        nuocService.save(nuoc);
        return "redirect:/nuoc/list";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable String id, Model model) {
        model.addAttribute("nuoc", nuocService.findById(id));
        return "nuoc-form";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        nuocService.delete(id);
        return "redirect:/nuoc/list";
    }
}
