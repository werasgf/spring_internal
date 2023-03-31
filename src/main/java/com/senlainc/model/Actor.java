package com.senlainc.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "actors")
public class Actor {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "actor_name")
    private String actorName;

    @ManyToMany
    @JoinTable(name = "actor_films",
            joinColumns = @JoinColumn(name = "actor_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "film_id", referencedColumnName = "id")
    )

    private Set<Film> films;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getActorName() {
        return actorName;
    }


    public void setFilms(Set<Film> films) {
        this.films = films;
    }

    public Set<Film> getFilms() {
        return films;
    }
}
