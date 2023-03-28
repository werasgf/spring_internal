package org.example.domain.model;

import javax.persistence.*;

@Entity
@Table(name = "actors")
public class Actor {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "actor_name")
    private String actorName;

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
}
