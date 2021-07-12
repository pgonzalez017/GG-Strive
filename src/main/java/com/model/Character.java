package com.model;

import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Entity
@Table(name="characters")
public class Character {
    @Id
    @Column(name="name")
    String name;
    @Column(name="description")
    String description;
}
