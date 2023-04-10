//package com.senlainc.model;
//
//import lombok.Getter;
//import lombok.Setter;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "comments")
//@Getter @Setter
//public class Comments {
//    @Id
//    @Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    @Column(name = "user_id")
//    private Integer user;
//
//    @Column(name = "comment")
//    private String comment;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @PrimaryKeyJoinColumn
//    private Reviews reviews;
//}
