//package com.senlainc.model;
//
//import lombok.Getter;
//import lombok.Setter;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "reviews")
//@Getter @Setter
//public class Reviews {
//    @Id
//    @Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @Column(name = "rating")
//    private int rating;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Film film;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @MapsId
//    @JoinColumn(name = "comment_id")
//    private Comments comment;
//}
