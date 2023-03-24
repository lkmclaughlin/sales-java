package com.maxtrain.bootcamp.sales.order;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.maxtrain.bootcamp.sales.customer.Customer;

public interface OrderRepository extends CrudRepository<Order, Integer>{
	Iterable<Order> findByStatus(String status);
}
