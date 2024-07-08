package com.deb.course_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deb.course_spring.entities.OrderItem;
import com.deb.course_spring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
