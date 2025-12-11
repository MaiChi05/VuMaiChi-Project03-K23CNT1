package com.example.vmc.project3.Service;

import com.example.vmc.project3.DTO.NhaPhanPhoiDTO;
import com.example.vmc.project3.Repository.NhaPhanPhoiRepository;
import com.example.vmc.project3.entity.NhaPhanPhoi;
import org.springframework.stereotype.Service;

@Service
public class DistributorService {

    private final NhaPhanPhoiRepository distributorRepository;

    public DistributorService(NhaPhanPhoiRepository distributorRepository) {
        this.distributorRepository = distributorRepository;
    }

    public NhaPhanPhoiDTO getFirstDistributorInfo() {
        NhaPhanPhoi entity = distributorRepository.findFirst();
        if (entity == null) {
            return null;
        }
        return convertToDTO(entity);
    }

    private NhaPhanPhoiDTO convertToDTO(NhaPhanPhoi entity) {
        return new NhaPhanPhoiDTO(
                entity.getMa(),
                entity.getTen(),
                entity.getEmail(),
                entity.getSoDienThoai(),
                entity.getDiaChi()
        );
    }
}
