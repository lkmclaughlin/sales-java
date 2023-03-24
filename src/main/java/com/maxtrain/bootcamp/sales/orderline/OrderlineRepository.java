package com.maxtrain.bootcamp.sales.orderline;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


public interface OrderlineRepository extends CrudRepository<Orderline, Integer>  {
	Iterable<Orderline> findByOrderId(int orderId);
}
