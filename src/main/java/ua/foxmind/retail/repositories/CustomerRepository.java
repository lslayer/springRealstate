package ua.foxmind.retail.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ua.foxmind.retail.model.Customer;

@RepositoryRestResource(collectionResourceRel = "customers", path = "customer")
public interface CustomerRepository extends MongoRepository<Customer, Long> {
}
