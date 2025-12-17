package com.example.doan03.Repository;

import com.example.doan03.Entity.Nuoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NuocRepository extends JpaRepository<Nuoc, String> {
}