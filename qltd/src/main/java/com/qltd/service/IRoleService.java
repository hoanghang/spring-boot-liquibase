package com.qltd.service;

import com.qltd.entities.Customer;

import java.util.List;
import java.util.Optional;

public interface IRoleService {
    public List<Customer> findAll();

    public String saveCustomer(Customer customer);

    public Optional<Customer> findOne(int id);

    public Long count();

    public void delete(int id);

    public boolean exists(int id);



}
