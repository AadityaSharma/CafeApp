package aaditya.dev.cafeapp.services;

import aaditya.dev.cafeapp.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(customerId).name("Aadi Sharma").build();
    }
}
