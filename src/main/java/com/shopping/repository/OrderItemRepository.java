package com.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
