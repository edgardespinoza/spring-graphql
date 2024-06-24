package com.eespinoza.graphql.data;

import com.eespinoza.graphql.data.entity.CustomerEntity;
import com.eespinoza.graphql.data.entity.OrderEntity;
import org.springframework.data.relational.core.sql.In;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Collection;

public interface OrderRepository extends ListCrudRepository<OrderEntity, Integer> {


    Collection<OrderEntity> findByCustomer(Integer id);
}
