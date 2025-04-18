package group.taskmanager.TaskManager.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "status")
@Getter
@Setter
public class Status {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @JoinColumn(name = "title")
    private int id;

    @Column(name = "title")
    private String title;
}
