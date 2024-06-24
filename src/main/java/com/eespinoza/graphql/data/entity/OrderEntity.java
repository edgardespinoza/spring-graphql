package com.eespinoza.graphql.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("customer_orders")
public record OrderEntity(@Id Integer id, String name, Integer customer){
}
