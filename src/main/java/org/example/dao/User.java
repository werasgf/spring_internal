package org.example.dao;

import jakarta.persistence.*;

import java.io.Serializable;

/**
 * @Entity - указывает на то, что этот класс является сущность
 * @Table - указывает на конкретную таблицу для отображения этой сущности
 * @Id - указывает, что это поле является первичным ключом
 * @Column - связывает поле со столбцом в таблице
 * @GeneratedValue - свойство будет генерироваться автоматом
 */

@Entity
@Table(name = "users")
public class User implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false, unique=true, length=50)
    private String name;

    @Column(name = "email")
    private String email;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", email=" + email +"]";
    }
}
