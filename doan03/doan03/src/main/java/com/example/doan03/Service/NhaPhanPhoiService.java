package com.example.doan03.Service;

import com.example.doan03.Entity.NhaPhanPhoi;
import com.example.doan03.Repository.NhaPhanPhoiRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhaPhanPhoiService {

    private final NhaPhanPhoiRepository repository;

    public NhaPhanPhoiService(NhaPhanPhoiRepository repository) {
        this.repository = repository;
    }

    public List<NhaPhanPhoi> findAll() {
        return repository.findAll();
    }

    public NhaPhanPhoi findById(String id) {
        return repository.findById(id).orElse(null);
    }

    public void save(NhaPhanPhoi npp) {
        repository.save(npp);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}
