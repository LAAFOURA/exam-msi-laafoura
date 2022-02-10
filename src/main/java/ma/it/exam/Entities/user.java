package ma.it.exam.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

    @Entity
    @Table(name = "user")
    @Getter
    @Setter
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="fullName")
    private String fullName;
    @Column(name="email")
    private String email;
}