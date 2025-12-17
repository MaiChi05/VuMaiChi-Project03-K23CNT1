package com.example.vmc.project3.Controller;

import com.example.vmc.project3.entity.Nuoc;
import com.example.vmc.project3.Service.NuocService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nuoc")
public class NuocController {

    private final NuocService nuocService;

    public NuocController(NuocService nuocService) {
        this.nuocService = nuocService;
    }

    @GetMapping("/danh-sach")
    public List<Nuoc> layTatCaNuoc() {
        return nuocService.getAllNuoc();
    }

    @GetMapping("/{maNuoc}")
    public Nuoc layNuocTheoId(@PathVariable String maNuoc) {
        return nuocService.getNuocById(maNuoc);
    }

    @PostMapping("/them")
    public Nuoc themNuoc(@RequestBody Nuoc nuoc) {
        return nuocService.saveNuoc(nuoc);
    }

    @PutMapping("/sua/{maNuoc}")
    public Nuoc suaNuoc(
            @PathVariable String maNuoc,
            @RequestBody Nuoc nuoc
    ) {
        return nuocService.updateNuoc(maNuoc, nuoc);
    }

    @DeleteMapping("/xoa/{maNuoc}")
    public void xoaNuoc(@PathVariable String maNuoc) {
        nuocService.deleteNuoc(maNuoc);
    }
}
