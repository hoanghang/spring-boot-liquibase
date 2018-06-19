package com.qltd.controller;

import com.qltd.entities.Customer;
import com.qltd.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class CustomerController {

    @Autowired
    ICustomerService khachhangService;

    @RequestMapping(path="/add") // Map ONLY GET Requests
    @ResponseBody
    public String addNewUser () {
        Customer khachhang = new Customer();
//        khachhang.setId(2);
        khachhang.setName("hieu");
        khachhang.setEmail("hoanghieu@gmail.com");
        khachhang.setSdt(0123);
        khachhangService.saveCustomer(khachhang);
        return "Saved";
    }

    @GetMapping("/all")
    @ResponseBody
    public Iterable<Customer> getAllUsers() {
        // This returns a JSON or XML with the users
        Iterable<Customer> khachhangs = khachhangService.findAll();
        for(Customer khachhang : khachhangs){
            System.out.println("khachhang "+ khachhang.getName());
        }
        return khachhangs;
    }


    @RequestMapping(value="/getCustomer/{id}")
    @ResponseBody
    public Customer method7(@PathVariable("id") int id){
        Optional<Customer> customer = khachhangService.findOne(id);
        return customer.get();
    }

    @RequestMapping("/")
    @ResponseBody
    public String welcome() {
        return "Welcome to RestTemplate Example.";
    }

    @RequestMapping("/user")
    @ResponseBody
    public String getUser(@RequestParam(value="name", defaultValue="World") String name) {
        return "Welcome to RestTemplate Example.";
    }


    @RequestMapping("/user")
    @ResponseBody
    public String getRole(@RequestParam(value="name", defaultValue="World") String name) {
        return "Welcome to RestTemplate Example.";
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(@RequestParam(value="name", defaultValue="World") String name) {
        return "login _ hotfix.";
    }

    @RequestMapping("/login")
    @ResponseBody
    public String delete(@RequestParam(value="name", defaultValue="World") String name) {
        return "delete customer.";
    }
}


