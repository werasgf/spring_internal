package com.senlainc.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "actors")
@ToString
@NoArgsConstructor
public class Actor {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter
    @Setter
    @Column(name = "actor_name")
    private String actorName;

    @Getter
    @Setter
    @ManyToMany
    @JoinTable(
            name = "actors_films",
            joinColumns = @JoinColumn(name = "actor_id"),
            inverseJoinColumns = @JoinColumn(name = "film_id")
    )
    private List<Film> films;

    public Actor(String actorName) {
        this.actorName = actorName;
    }

}
