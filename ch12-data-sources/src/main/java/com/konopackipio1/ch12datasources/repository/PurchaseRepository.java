package com.konopackipio1.ch12datasources.repository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.konopackipio1.ch12datasources.model.Purchase;

@Repository
public class PurchaseRepository {

    private final JdbcTemplate jdbcTemplate;

    public PurchaseRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void storePurchase(Purchase purchase) {
        String sql = "INSERT INTO purchase (product, price) VALUES (?, ?)";

        jdbcTemplate.update(sql, purchase.getProduct(), purchase.getPrice());
    }    

    public List<Purchase> findAllPurchases() {
        String sql = "SELECT * FROM purchase"; 

        RowMapper<Purchase> rowMapper = (rs, i) -> {
            Purchase purchase = new Purchase();
            purchase.setId(rs.getInt("id"));
            purchase.setProduct(rs.getString("product"));
            purchase.setPrice(rs.getBigDecimal("price"));
            return purchase;
        };

        return jdbcTemplate.query(sql, rowMapper);
    }
}
