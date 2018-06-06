package com.qltd.service;

import com.qltd.entities.Customer;
import com.qltd.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private CustomerRepository repository;

    @Override
    public List<Customer> findAll() {
        List<Customer> khachhangs = (List<Customer>) repository.findAll();

        return khachhangs;
    }

    @Override
    public String saveCustomer(Customer customer) {

        repository.save(customer);

        return "update ok!";
    }

    @Override
    public Optional<Customer> findOne(int id) {
        Optional<Customer> customer = repository.findById((long) id);
        return customer;
    }

    @Override
    public Long count() {
        return repository.count();
    }

    @Override
    public void delete(int id) {
        repository.deleteById((long) id);
    }

    @Override
    public boolean exists(int id) {

        return repository.existsById((long) id);
    }


}
