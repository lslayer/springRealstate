package ua.foxmind.retail.repositories;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ua.foxmind.retail.model.Order;

@RepositoryRestResource(collectionResourceRel = "orders", path = "order")
public interface OrderRepository extends MongoRepository<Order, String> {
}
