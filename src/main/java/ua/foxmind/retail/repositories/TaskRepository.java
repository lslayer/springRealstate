package ua.foxmind.retail.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ua.foxmind.retail.model.Task;

public interface TaskRepository extends MongoRepository<Task, Long> {
}
