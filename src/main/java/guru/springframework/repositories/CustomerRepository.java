package guru.springframework.repositories;

import guru.springframework.domain.Customers;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 1/10/17.
 */
public interface CustomerRepository extends CrudRepository<Customers, Long> {
}
