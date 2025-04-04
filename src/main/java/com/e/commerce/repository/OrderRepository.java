package com.e.commerce.repository;

import com.e.commerce.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long> {

   // List<Order> findByStatus(String status);
}
