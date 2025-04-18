package group.taskmanager.TaskManager.services;

import group.taskmanager.TaskManager.models.Task;
import group.taskmanager.TaskManager.repositories.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TasksService {
    private final TasksRepository tasksRepository;

    @Autowired
    public TasksService(TasksRepository tasksRepository) {
        this.tasksRepository = tasksRepository;
    }

    public List<Task> loadTasks() {
        return tasksRepository.findAll();
    }

    public Task loadTask(int id) {
        Optional<Task> task = tasksRepository.findById(id);
        return task.orElse(null);
    }


}
