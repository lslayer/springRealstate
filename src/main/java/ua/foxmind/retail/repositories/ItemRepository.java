package ua.foxmind.retail.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ua.foxmind.retail.model.Item;

public interface ItemRepository extends MongoRepository<Item, Long> {
}
