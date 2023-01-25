package BillSystemApp.demo.service;

import BillSystemApp.demo.entity.CustomerModel;
import BillSystemApp.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customer;

    public void addCustomer(CustomerModel customerModel){

    }
}

