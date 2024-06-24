package com.eespinoza.graphql.data;

import com.eespinoza.graphql.data.entity.CustomerEntity;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Collection;

public interface CustomerRepository extends ListCrudRepository<CustomerEntity, Integer> {

    Collection<CustomerEntity> findByName(String name);
}
