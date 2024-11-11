package com.restaurant.order.repo;


import com.restaurant.order.enitiy.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends MongoRepository<Order, Integer>{
 }