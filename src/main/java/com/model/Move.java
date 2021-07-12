package com.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="moves")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Move {
    @ManyToOne
    @JoinColumn(name="name")
    Character character;
    @Column(name="move_name")
    String name;
    @Column
    String damage;
    @Column
    String recovery;
    @Column
    String guard;
    @Column
    String onBlock;
    @Column
    String invuln;
    @Column
    String onHit;
    @Column
    String kdAdv;
}
