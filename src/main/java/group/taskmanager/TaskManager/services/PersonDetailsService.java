package group.taskmanager.TaskManager.services;

import group.taskmanager.TaskManager.models.Person;
import group.taskmanager.TaskManager.repositories.PeopleRepository;
import group.taskmanager.TaskManager.security.PersonDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonDetailsService implements UserDetailsService {

    @Autowired
    private PeopleRepository peopleRepository;

//    @Autowired
//    public PersonDetailsService(PeopleRepository peopleRepository) {
//        this.peopleRepository = peopleRepository;
//    }

//    public boolean existsByUsername(String username) throws UsernameNotFoundException {
//        boolean exists = peopleRepository.existsByUsername(username);
//
//        if (exists) {
//            throw new UsernameNotFoundException("User found: " + username);
//        }
//
//        return exists;
//    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Person> person = peopleRepository.findByUsername(username);
        return person.map(PersonDetails::new).orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));
    }

}
