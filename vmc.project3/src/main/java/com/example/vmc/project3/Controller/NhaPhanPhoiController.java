package com.example.vmc.project3.Controller;

import com.example.vmc.project3.DTO.NhaPhanPhoiDTO;
import com.example.vmc.project3.Service.NhaPhanPhoiService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DistributorController {

    private final NhaPhanPhoiService distributorService;

    public DistributorController(NhaPhanPhoiService distributorService) {
        this.distributorService = distributorService;
    }

    @GetMapping("/distributor")
    public String showDistributorInfo(Model model) {
        NhaPhanPhoiDTO distributor = distributorService.getFirstDistributorInfo();
        model.addAttribute("distributor", distributor);
        return "distributor-info"; // JSP: /WEB-INF/views/distributor-info.jsp
    }
}
