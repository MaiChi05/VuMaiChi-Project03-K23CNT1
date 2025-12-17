package com.example.vmc.project3.Service;

import com.example.vmc.project3.Repository.NuocRepository;
import com.example.vmc.project3.entity.Nuoc;
import org.springframework.stereotype.Service;

@Service
public class NuocService {

    private final NuocRepository repo;

    public NuocService(NuocRepository repo) {
        this.repo = repo;
    }

    public List<Nuoc> getAll() {
        return repo.findAll();
    }

    public Nuoc getById(String id) {
        return repo.findById(id).orElse(null);
    }

    public Nuoc add(Nuoc n) {
        return repo.save(n);
    }

    public Nuoc update(String id, Nuoc data) {
        Nuoc n = repo.findById(id).orElseThrow();

        n.setTxenNuoc(data.getTenNuoc());
        n.setMoTa(data.getMoTa());
        n.setHinhAnh(data.getHinhAnh());
        n.setGia(data.getGia());
        n.setSoLuong(data.getSoLuong());
        n.setTrangThai(data.getTrangThai());

        return repo.save(n);
    }

    public void delete(String id) {
        repo.deleteById(id);
    }
}
