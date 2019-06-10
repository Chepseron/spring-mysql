package guru.springframework.converters;

import guru.springframework.commands.CustomersForm;
import guru.springframework.domain.Customers;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * Created by jt on 1/10/17.
 */
@Component
public class CustomersFormToCustomer implements Converter<CustomersForm, Customers> {

    @Override
    public Customers convert(CustomersForm customersForm) {
        Customers cust = new Customers();
        if (customersForm.getId() != null && !StringUtils.isEmpty(customersForm.getId())) {
            cust.setId(new Long(customersForm.getId()));
        }
        cust.setFirstName(customersForm.getFirstName());
        cust.setProduct(customersForm.getProduct());
        cust.setSecondName(customersForm.getSecondName());
        cust.setThirdName(customersForm.getThirdName());
        //cust.setImageUrl(CustomersForm.getImageUrl());
        return cust;
    }
}
