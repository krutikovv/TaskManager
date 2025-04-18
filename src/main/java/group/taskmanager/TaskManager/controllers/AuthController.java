package group.taskmanager.TaskManager.controllers;

import group.taskmanager.TaskManager.models.Person;
import group.taskmanager.TaskManager.services.RegistrationService;
import group.taskmanager.TaskManager.util.PersonValidator;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/auth")
public class AuthController {

    private final RegistrationService registrationService;
    private final PersonValidator personValidator;

    @Autowired
    public AuthController(RegistrationService registrationService, PersonValidator personValidator) {
        this.registrationService = registrationService;
        this.personValidator = personValidator;
    }

    @GetMapping("/api/adm")
    public ResponseEntity<String> adminPage(@RequestBody @Valid Person person,
                                            BindingResult bindingResult) {

        return ResponseEntity.ok("get admin:");
    }

    @GetMapping("/auth/login")
    public ResponseEntity<String> auth(@RequestBody @Valid Person person,
                       BindingResult bindingResult) {
        personValidator.validate(person, bindingResult);

        if (bindingResult.hasErrors()) {
            return ResponseEntity.ok("error login");
        }

        return ResponseEntity.ok("success login");
    }

    @GetMapping("/auth/registration")
    public ResponseEntity<String> registrationPage(@RequestBody Person person) {
        return ResponseEntity.ok("get:" + person);
    }

    @PostMapping("/auth/registration")
    public ResponseEntity<String> performRegistration(@RequestBody @Valid Person person,
                                      BindingResult bindingResult) {
        personValidator.validate(person, bindingResult);

        if (bindingResult.hasErrors()) {
            return ResponseEntity.ok("error registration");
        }

        registrationService.register(person);

        return ResponseEntity.ok("success registration");
    }


}
