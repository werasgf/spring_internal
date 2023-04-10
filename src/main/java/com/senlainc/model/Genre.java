//package com.senlainc.model;
//
//import lombok.Getter;
//import lombok.Setter;
//
//import javax.persistence.*;
//import java.util.Set;
//
//@Entity
//@Table(name = "genre")
//@Getter @Setter
//public class Genre {
//
//    @Id
//    @Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @Column(name = "genre")
//    private String genre;
//
//    @ManyToMany
//    @JoinTable(name = "genre_films",
//            joinColumns = @JoinColumn(name = "genre_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "film_id", referencedColumnName = "id")
//    )
//    private Set<Film> films;
//}
