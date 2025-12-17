package com.example.doan03.Service;

import com.example.doan03.Entity.Nuoc;
import com.example.doan03.Repository.NuocRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NuocService {

    private final NuocRepository nuocRepository;

    public NuocService(NuocRepository nuocRepository) {
        this.nuocRepository = nuocRepository;
    }

    public List<Nuoc> findAll() {
        return nuocRepository.findAll();
    }

    public Nuoc findById(String id) {
        return nuocRepository.findById(id).orElse(null);
    }

    public void save(Nuoc nuoc) {
        nuocRepository.save(nuoc);
    }

    public void delete(String id) {
        nuocRepository.deleteById(id);
    }
}
