package com.eespinoza.graphql.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("customer")
public record CustomerEntity(@Id Integer id, String name, ProfileEntity profile) {
}


