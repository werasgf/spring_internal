package com.senlainc.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@NoArgsConstructor
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Getter
    @Setter
    @Column(name = "name", nullable = false, unique = true, length = 50)
    private String name;

    @Getter
    @Setter
    @Column(name = "email", nullable = false, unique = true, length = 50)
    private String email;

    @Getter
    @Setter
    @OneToMany(mappedBy = "user")
    private List<Comment> comments;

//    @Getter
//    @Setter
//    @OneToMany(mappedBy = "user")
//    private List<Subscription> user_sub;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}