package com.eespinoza.graphql.domain.model;


public record Customer(Integer id,
                       String name,
                       Profile profile) {
}
