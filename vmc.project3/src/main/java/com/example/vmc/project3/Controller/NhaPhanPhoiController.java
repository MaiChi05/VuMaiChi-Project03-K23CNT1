package com.example.vmc.project3.Controller;

import com.example.vmc.project3.entity.NhaPhanPhoi;
import com.example.vmc.project3.Service.NhaPhanPhoiService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nha-phan-phoi")
public class NhaPhanPhoiController {

    private final NhaPhanPhoiService nhaPhanPhoiService;

    public NhaPhanPhoiController(NhaPhanPhoiService nhaPhanPhoiService) {
        this.nhaPhanPhoiService = nhaPhanPhoiService;
    }

    @GetMapping("/danh-sach")
    public List<NhaPhanPhoi> layTatCa() {
        return nhaPhanPhoiService.layTatCaNhaPhanPhoi();
    }

    @GetMapping("/{maNhaPhanPhoi}")
    public NhaPhanPhoi layTheoId(@PathVariable String maNhaPhanPhoi) {
        return nhaPhanPhoiService.layNhaPhanPhoiTheoId(maNhaPhanPhoi);
    }

    @PostMapping("/them")
    public NhaPhanPhoi them(@RequestBody NhaPhanPhoi nhaPhanPhoi) {
        return nhaPhanPhoiService.themHoacSuaNhaPhanPhoi(nhaPhanPhoi);
    }

    @PutMapping("/sua/{maNhaPhanPhoi}")
    public NhaPhanPhoi sua(@PathVariable String maNhaPhanPhoi, @RequestBody NhaPhanPhoi nhaPhanPhoi) {
        nhaPhanPhoi.setMaNhaPhanPhoi(maNhaPhanPhoi);
        return nhaPhanPhoiService.themHoacSuaNhaPhanPhoi(nhaPhanPhoi);
    }

    @DeleteMapping("/xoa/{maNhaPhanPhoi}")
    public void xoa(@PathVariable String maNhaPhanPhoi) {
        nhaPhanPhoiService.xoaNhaPhanPhoi(maNhaPhanPhoi);
    }
}
