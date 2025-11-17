package com.example.lap07.vmc.Repositoty;

import com.example.lap07.vmc.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CategoryRepository extends  JpaRepository<Category, Long> {
}