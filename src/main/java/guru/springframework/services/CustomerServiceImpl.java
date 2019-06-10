package guru.springframework.services;

import guru.springframework.commands.CustomersForm;
import guru.springframework.converters.CustomersFormToCustomer;
import guru.springframework.domain.Customers;
import guru.springframework.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jt on 1/10/17.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository CustomerRepository;
    private CustomersFormToCustomer CustomersFormToCustomer;

    @Autowired
    public CustomerServiceImpl(CustomerRepository CustomerRepository, CustomersFormToCustomer CustomersFormToCustomer) {
        this.CustomerRepository = CustomerRepository;
        this.CustomersFormToCustomer = CustomersFormToCustomer;
    }


    @Override
    public List<Customers> listAll() {
        List<Customers> Customerss = new ArrayList<>();
        CustomerRepository.findAll().forEach(Customerss::add); //fun with Java 8
        return Customerss;
    }

    @Override
    public Customers getById(Long id) {
        return CustomerRepository.findById(id).orElse(null);
    }

    @Override
    public Customers saveOrUpdate(Customers customers) {
        CustomerRepository.save(customers);
        return customers;
    }

    @Override
    public void delete(Long id) {
        CustomerRepository.deleteById(id);

    }

    @Override
    public Customers saveOrUpdateCustomersForm(CustomersForm CustomersForm) {
        Customers savedCustomers = saveOrUpdate(CustomersFormToCustomer.convert(CustomersForm));

        System.out.println("Saved Customers Id: " + savedCustomers.getId());
        return savedCustomers;
    }
}
