package ua.foxmind.retail.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ua.foxmind.retail.model.Customer;
import ua.foxmind.retail.model.Task;

public interface CustomerRepository extends MongoRepository<Customer, Long> {
}
