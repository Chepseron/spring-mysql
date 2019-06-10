package guru.springframework.services;

import guru.springframework.commands.CustomersForm;
import guru.springframework.domain.Customers;
import guru.springframework.domain.Product;

import java.util.List;

/**
 * Created by jt on 1/10/17.
 */
public interface CustomerService {

    List<Customers> listAll();

    Customers getById(Long id);

    Customers saveOrUpdate(Customers customers);

    void delete(Long id);

    Customers saveOrUpdateCustomersForm(CustomersForm customers);
}
