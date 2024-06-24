package com.eespinoza.graphql.controller;

import com.eespinoza.graphql.controller.dto.CustomerAddRequest;
import com.eespinoza.graphql.domain.CustomerService;
import com.eespinoza.graphql.domain.model.Customer;
import com.eespinoza.graphql.domain.model.CustomerEvent;
import com.eespinoza.graphql.domain.model.Order;
import org.springframework.graphql.data.method.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.Collection;

@Controller
class CustomerGraphqlController {

    private final CustomerService service;

    CustomerGraphqlController(CustomerService service) {
        this.service = service;
    }

    @SchemaMapping(typeName = "Customer")
    Collection<Order> orders(Customer customer){
        return service.getOrders(customer);
    }

   @QueryMapping("customers")
    Collection<Customer> customers(){
        return service.getCustomers();
    }

    @QueryMapping
    Collection<Customer> customerFindByName(@Argument String name){
        return service.findCustomerByName(name);
    }

    @MutationMapping
    Customer addCustomer(@Argument CustomerAddRequest customerAddRequest){
        return service.saveCustomer(customerAddRequest.name());
    }

}


