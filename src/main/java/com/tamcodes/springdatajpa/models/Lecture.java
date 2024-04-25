package com.tamcodes.springdatajpa.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Lecture {

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
