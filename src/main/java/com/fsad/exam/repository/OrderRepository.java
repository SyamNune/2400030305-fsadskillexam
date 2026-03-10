package com.fsad.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fsad.exam.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}