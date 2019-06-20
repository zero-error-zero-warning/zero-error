package service;

import model.Customer;

import org.springframework.stereotype.Service;

@Service
public interface ICustomerService {
    Customer selectById(int id);






}
