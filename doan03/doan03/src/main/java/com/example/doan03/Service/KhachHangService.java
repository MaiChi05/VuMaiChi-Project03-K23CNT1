package com.example.doan03.Service;
import com.example.doan03.Entity.KhachHang;
import com.example.doan03.Repository.KhachHangRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class KhachHangService {


    private final KhachHangRepository repository;


    public KhachHangService(KhachHangRepository repository) {
        this.repository = repository;
    }


    public List<KhachHang> findAll() {
        return repository.findAll();
    }


    public KhachHang findById(String id) {
        return repository.findById(id).orElse(null);
    }


    public void save(KhachHang kh) {
        repository.save(kh);
    }


    public void delete(String id) {
        repository.deleteById(id);
    }
}