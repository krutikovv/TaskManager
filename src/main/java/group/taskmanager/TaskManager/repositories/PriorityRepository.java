package group.taskmanager.TaskManager.repositories;

import group.taskmanager.TaskManager.models.Priority;
import group.taskmanager.TaskManager.models.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriorityRepository extends JpaRepository<Priority, Integer> {
}
