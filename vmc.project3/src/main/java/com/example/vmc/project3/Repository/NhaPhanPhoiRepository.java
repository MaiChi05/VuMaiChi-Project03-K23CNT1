package com.example.vmc.project3.Repository;

import com.example.vmc.project3.entity.NhaPhanPhoi;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DistributorRepository {

    private final JdbcTemplate jdbcTemplate;

    public DistributorRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private static final String SELECT_FIRST_DISTRIBUTOR =
            "SELECT ma, ten, email, so_dien_thoai, dia_chi FROM distributor LIMIT 1";

    public NhaPhanPhoi findFirst() {
        return jdbcTemplate.query(
                SELECT_FIRST_DISTRIBUTOR,
                rs -> {
                    if (rs.next()) {
                        return new NhaPhanPhoi(
                                rs.getString("ma"),
                                rs.getString("ten"),
                                rs.getString("email"),
                                rs.getString("so_dien_thoai"),
                                rs.getString("dia_chi")
                        );
                    }
                    return null;
                }
        );
    }
}
