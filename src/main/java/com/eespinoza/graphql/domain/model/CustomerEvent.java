package com.eespinoza.graphql.domain.model;

enum CustomerEventType {
    UPDATED,
    DELETED
}

public record CustomerEvent(Customer customer, CustomerEventType type) {
}
