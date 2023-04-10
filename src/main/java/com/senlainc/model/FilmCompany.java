//package com.senlainc.model;
//
//import lombok.Getter;
//import lombok.Setter;
//
//import javax.persistence.*;
//import java.util.Set;
//
//@Entity
//@Table(name = "film_company")
//@Getter @Setter
//public class FilmCompany {
//    @Id
//    @Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @Column(name = "company_name")
//    private String companyName;
//
//    @OneToMany(mappedBy = "film_company")
//    private Set<Film> films;
//
//}