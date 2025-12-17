package com.example.doan03.Repository;

import com.example.doan03.Entity.NhaPhanPhoi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhaPhanPhoiRepository extends JpaRepository<NhaPhanPhoi, String> {
}
