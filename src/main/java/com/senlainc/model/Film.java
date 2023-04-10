package com.senlainc.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

/**
 * @Entity - указывает на то, что этот класс является сущность
 * @Table - указывает на конкретную таблицу для отображения этой сущности
 * @Id - указывает, что это поле является первичным ключом
 * @Column - связывает поле со столбцом в таблице
 * @GeneratedValue - свойство будет генерироваться автоматом
 * @FetchType.EAGER - стратегия, которая предусматривает получение полной связи между
 * сущностями, и последующих обращеня к связям не будет выполняться запрос на
 * получение данных, т.к. данные изначально будут получены полностью
 */

@Entity
@Table(name = "films")
@Getter @Setter
public class Film {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title", nullable = false, length = 200)
    private String title;

    @Column(name = "year")
    private int year;

//    @Column(name = "genre")
//    private Genre genre;

    @Column(name = "film_company")
    private Integer filmCompany;

    @Column(name = "actor")
    private Actor actor;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "films")
    private Set<Actor> actors;

//    @ManyToOne(fetch = FetchType.EAGER)
//    private FilmCompany filmCompanies;
//
//    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "films")
//    private Set<Genre> genres;
//
//    @OneToMany(mappedBy = "reviews")
//    private Set<Reviews> reviews;
//
//    @Override
//    public String toString() {
//        return "Film [id=" + id + ", title=" + title + ", year=" + year + ", genre=" + genre + ", film company=" + filmCompany + ", actor=" + actor + "]";
//    }
}
