package guru.springframework.converters;

import guru.springframework.commands.CustomersForm;
import guru.springframework.domain.Customers;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 1/10/17.
 */
@Component
public class CustomerToCustomersForm implements Converter<Customers, CustomersForm> {

    @Override
    public CustomersForm convert(Customers customer) {
        CustomersForm customerForm = new CustomersForm();
        customerForm.setId(customer.getId());
        customerForm.setFirstName(customer.getFirstName());
        customerForm.setSecondName(customer.getSecondName());
        customerForm.setThirdName(customer.getThirdName());
        customerForm.setImageUrl(customer.getImageUrl());
        return customerForm;
    }
}
