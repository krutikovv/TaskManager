package group.taskmanager.TaskManager.services;

import group.taskmanager.TaskManager.models.Person;
import group.taskmanager.TaskManager.repositories.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RegistrationService {

    private final PeopleRepository peopleRepository;

    @Autowired
    public RegistrationService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @Transactional
    public void register(Person person) {
        person.setRole("ROLE_USER");
        peopleRepository.save(person);
    }
}
