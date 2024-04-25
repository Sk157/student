package com.student.student.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Student {
    @Column
    public String firstName;
    @Column
    public String lastName;
    @Column
    public int age;
    @Column( length = 100)
    public String email;
    @Column(length = 10)
    public String phoneNumber;
}
