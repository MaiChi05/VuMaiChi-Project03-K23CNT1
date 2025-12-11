package com.example.vmc.project3.Repository;

import com.example.vmc.project3.entity.Nuoc;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WaterRepository {

    private final JdbcTemplate jdbcTemplate;

    public WaterRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private static final String SELECT_AVAILABLE_WATER =
            "SELECT ma, ten, mo_ta, hinh_anh, so_luong, gia, trang_thai " +
                    "FROM water WHERE trang_thai = 1 AND so_luong > 0";

    public List<Nuoc> findAllAvailable() {
        return jdbcTemplate.query(
                SELECT_AVAILABLE_WATER,
                (rs, rowNum) -> new Nuoc(
                        rs.getString("ma"),
                        rs.getString("ten"),
                        rs.getString("mo_ta"),
                        rs.getString("hinh_anh"),
                        rs.getInt("so_luong"),
                        rs.getDouble("gia"),
                        rs.getBoolean("trang_thai")
                )
        );
    }
}
