package ua.foxmind.retail.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ua.foxmind.retail.model.Item;

@RepositoryRestResource(collectionResourceRel = "items", path = "item")
public interface ItemRepository extends MongoRepository<Item, Long> {
}
