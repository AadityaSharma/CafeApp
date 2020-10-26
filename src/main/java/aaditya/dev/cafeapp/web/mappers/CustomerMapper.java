package aaditya.dev.cafeapp.web.mappers;

import aaditya.dev.cafeapp.domain.Customer;
import aaditya.dev.cafeapp.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer CustomerDtoToCustomer(CustomerDto customerDto);
}
