package group.taskmanager.TaskManager.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.Mapping;

@Entity
@Getter
@Setter
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Заполните email")
    @Size(min = 2, max = 100, message = "Длина email 2-100 символов")
    @Column(name = "username")
    private String username;

    @JsonIgnore
    @Column(name = "password")
    private String password;

    @JsonIgnore
    @Column(name = "role")
    private String role;

//    public void setUsername(
//            /*@NotEmpty(message = "Заполните email") @Size(min = 2, max = 100, message = "Длина email 2-100 символов")*/ String username) {
//        this.username = username;
//    }


    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + username + ", password=" + password + '}';
    }
}
