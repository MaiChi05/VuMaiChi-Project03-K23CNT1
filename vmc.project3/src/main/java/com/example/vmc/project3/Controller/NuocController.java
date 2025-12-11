package com.example.vmc.project3.Controller;

import com.example.vmc.project3.DTO.NuocDTO;
import com.example.vmc.project3.Service.NuocService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WaterController {

    private final NuocService waterService;

    public WaterController(NuocService waterService) {
        this.waterService = waterService;
    }

    @GetMapping("/water")
    public String showWaterList(Model model) {
        List<NuocDTO> waterList = waterService.getAllAvailableWaterProducts();
        model.addAttribute("waterList", waterList);
        return "water-list"; // Spring tìm /WEB-INF/views/water-list.jsp
    }
}
