package com.example.vmc.project3.Service;

import com.example.vmc.project3.entity.NhaPhanPhoi;
import com.example.vmc.project3.Repository.NhaPhanPhoiRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhaPhanPhoiService {

    private final NhaPhanPhoiRepository nhaPhanPhoiRepository;

    public NhaPhanPhoiService(NhaPhanPhoiRepository nhaPhanPhoiRepository) {
        this.nhaPhanPhoiRepository = nhaPhanPhoiRepository;
    }

    public List<NhaPhanPhoi> layTatCaNhaPhanPhoi() {
        return nhaPhanPhoiRepository.findAll();
    }

    public NhaPhanPhoi layNhaPhanPhoiTheoId(String maNhaPhanPhoi) {
        return nhaPhanPhoiRepository.findById(maNhaPhanPhoi).orElse(null);
    }

    public NhaPhanPhoi themHoacSuaNhaPhanPhoi(NhaPhanPhoi nhaPhanPhoi) {
        return nhaPhanPhoiRepository.save(nhaPhanPhoi);
    }

    public void xoaNhaPhanPhoi(String maNhaPhanPhoi) {
        nhaPhanPhoiRepository.deleteById(maNhaPhanPhoi);
    }
}
