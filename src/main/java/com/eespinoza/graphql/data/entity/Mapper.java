package com.eespinoza.graphql.data.entity;

import com.eespinoza.graphql.domain.model.Customer;
import com.eespinoza.graphql.domain.model.Order;
import com.eespinoza.graphql.domain.model.Profile;

public class Mapper {
    public static Customer toCustomer(CustomerEntity dto) {
        return new Customer(
                dto.id(),
                dto.name(),
                dto.profile() != null ?
                        new Profile(
                                dto.profile().id(),
                                dto.profile().username(),
                                dto.profile().password()
                        ) : null
        );
    }

    public static Order toOrder(OrderEntity dto) {
        return new Order(
                dto.id(),
                dto.name()
        );
    }
}