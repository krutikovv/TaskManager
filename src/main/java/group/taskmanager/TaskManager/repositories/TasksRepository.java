package group.taskmanager.TaskManager.repositories;

import group.taskmanager.TaskManager.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TasksRepository extends JpaRepository<Task, Integer> {
//    @Query("select Task.id, Task.title, Task.description, S.title, " +
//            "Pr.priority, comment, author, executor" +
//            " from Task " +
//            " join Status s on Task.status_id = s.id" +
//            " join priority pr on task.priority_id = pr.id" +
//            " join person p on task.author_id = p.id" +
//            " join person p2 on task.executor_id = p2.id"
//    )

//    List<Task> findAll();
}
