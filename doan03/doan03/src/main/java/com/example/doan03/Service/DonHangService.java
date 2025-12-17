package com.example.doan03.Service;
import com.example.doan03.Entity.DonHang;
import com.example.doan03.Repository.DonHangRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class DonHangService {


    private final DonHangRepository repository;


    public DonHangService(DonHangRepository repository) {
        this.repository = repository;
    }


    public List<DonHang> findAll() {
        return repository.findAll();
    }


    public DonHang findById(String id) {
        return repository.findById(id).orElse(null);
    }


    public void save(DonHang dh) {
        repository.save(dh);
    }


    public void delete(String id) {
        repository.deleteById(id);
    }
}