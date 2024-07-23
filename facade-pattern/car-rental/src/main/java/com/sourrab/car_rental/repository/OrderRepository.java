package com.sourrab.car_rental.repository;

import com.sourrab.car_rental.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
