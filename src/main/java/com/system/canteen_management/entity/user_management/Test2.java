package com.system.canteen_management.entity.user_management;

import jakarta.persistence.*;

@Table
@Entity
public class Test2 {

    @Id
    private Integer id;

    private String firstname;

    @ManyToOne
    private Test test;
}
