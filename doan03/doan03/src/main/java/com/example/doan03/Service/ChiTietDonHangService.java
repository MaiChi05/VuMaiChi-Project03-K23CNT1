package com.example.doan03.Service;
import com.example.doan03.Entity.ChiTietDonHang;
import com.example.doan03.Entity.ChiTietDonHangId;
import com.example.doan03.Repository.ChiTietDonHangRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ChiTietDonHangService {


    private final ChiTietDonHangRepository repository;


    public ChiTietDonHangService(ChiTietDonHangRepository repository) {
        this.repository = repository;
    }


    public List<ChiTietDonHang> findAll() {
        return repository.findAll();
    }


    public ChiTietDonHang findById(ChiTietDonHangId id) {
        return repository.findById(id).orElse(null);
    }


    public void save(ChiTietDonHang ct) {
        repository.save(ct);
    }


    public void delete(ChiTietDonHangId id) {
        repository.deleteById(id);
    }
}