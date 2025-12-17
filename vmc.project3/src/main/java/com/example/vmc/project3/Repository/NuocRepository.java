package com.example.vmc.project3.Repository;

import com.example.vmc.project3.entity.Nuoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NuocRepository extends JpaRepository<Nuoc, String> {
}
