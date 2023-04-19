//package com.senlainc.model;
//
//import lombok.Getter;
//import lombok.Setter;
//
//import javax.persistence.*;
//import java.util.Set;
//
//@Entity
//@Table(name = "subscription")
//@Getter @Setter
//public class Subscription {
//    @Id
//    @Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @Column(name = "user")
//    private User user;
//
//    @Column(name = "friend")
//    private User friend;
//
//    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "users")
//    private Set<User> users;
//
//    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "users")
//    private Set<User> friends;
//}
