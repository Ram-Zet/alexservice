package com.example.test_app.persistence.dao.tables;

import com.example.test_app.persistence.entity.tables.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderStatusDao extends JpaRepository<OrderStatus, UUID> {
}
