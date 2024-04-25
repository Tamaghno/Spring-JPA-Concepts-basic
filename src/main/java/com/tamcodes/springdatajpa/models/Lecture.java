package com.tamcodes.springdatajpa.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Lecture extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;


    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;


    @OneToOne
    @JoinColumn(name = "resource_id")
    private Resource resource;

}
