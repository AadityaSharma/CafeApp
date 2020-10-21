package aaditya.dev.cafeapp.services;

import aaditya.dev.cafeapp.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
