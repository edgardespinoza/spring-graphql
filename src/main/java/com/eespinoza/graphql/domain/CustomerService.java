package com.eespinoza.graphql.domain;

import com.eespinoza.graphql.data.CustomerRepository;
import com.eespinoza.graphql.data.OrderRepository;
import com.eespinoza.graphql.data.entity.CustomerEntity;
import com.eespinoza.graphql.data.entity.Mapper;
import com.eespinoza.graphql.domain.model.Customer;
import com.eespinoza.graphql.domain.model.Order;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    CustomerRepository customerRepository;
    OrderRepository orderRepository;

    CustomerService(CustomerRepository customerRepository, OrderRepository orderRepository) {
        this.customerRepository = customerRepository;
        this.orderRepository=orderRepository;
    }

    public Collection<Customer> getCustomers() {
        return customerRepository.findAll().stream().map(Mapper::toCustomer).collect(Collectors.toList());
    }

    public Collection<Customer> findCustomerByName(String name) {
        return customerRepository.findByName(name).stream().map(Mapper::toCustomer).collect(Collectors.toList());
    }


    public Collection<Order> getOrders(Customer customer){
        return orderRepository.findByCustomer(customer.id()).stream().map(Mapper::toOrder).collect(Collectors.toList());
    }

    public Customer saveCustomer(String name){
        var item = customerRepository.save(new CustomerEntity(null, name, null));

        return Mapper.toCustomer(item);
    }




}
