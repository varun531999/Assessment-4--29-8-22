package com.varun.jgc.junit.spring.service;



import com.varun.jgc.unit.obj.Order;

public interface SampleService {

 public String getOrderDescription();

 public String getOrderStringCode();

 public Order getOrder(int id);

 public Order createOrder(Order order);

}