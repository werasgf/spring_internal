//package com.senlainc.model;
//
//import lombok.AccessLevel;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//import java.util.List;
//import java.util.Set;
//
///**
// * @Entity - указывает на то, что этот класс является сущность
// * @Table - указывает на конкретную таблицу для отображения этой сущности
// * @Id - указывает, что это поле является первичным ключом
// * @Column - связывает поле со столбцом в таблице
// * @GeneratedValue - свойство будет генерироваться автоматом
// */
//
//@Entity
//@Table(name = "users")
//@Getter @Setter
//@NoArgsConstructor(access = AccessLevel.PUBLIC)
//public class User {
//    @Id
//    @Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    @Column(name = "name", nullable = false, unique = true, length = 50)
//    private String name;
//
//    @Column(name = "email", nullable = false, unique = true, length = 50)
//    private String email;
//
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_id", referencedColumnName = "id")
//    private List<Comments> comments;
//
//    @ManyToMany
//    @JoinTable(name = "users_subscription",
//            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "subscription_id", referencedColumnName = "id")
//    )
//    private Set<Subscription> subscriptions;
//}