package com.marsaf.orderservicemaven.repository;

import com.marsaf.orderservicemaven.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
