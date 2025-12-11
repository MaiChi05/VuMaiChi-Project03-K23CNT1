package com.example.vmc.project3.Service;

import com.example.vmc.project3.DTO.NuocDTO;
import com.example.vmc.project3.Repository.NuocRepository;
import com.example.vmc.project3.entity.Nuoc;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WaterService {

    private final NuocRepository waterRepository;

    public WaterService(NuocRepository waterRepository) {
        this.waterRepository = waterRepository;
    }

    public List<NuocDTO> getAllAvailableWaterProducts() {
        List<Nuoc> entities = waterRepository.findAllAvailable();
        return entities.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private NuocDTO convertToDTO(Nuoc entity) {
        return new NuocDTO(
                entity.getMa(),
                entity.getTen(),
                entity.getMoTa(),
                entity.getHinhAnh(),
                entity.getGia(),
                entity.getSoLuong()
        );
    }
}
