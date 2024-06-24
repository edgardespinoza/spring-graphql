package com.eespinoza.graphql.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("customer_profiles")
public record ProfileEntity(@Id Integer id, String username, String password){
}
