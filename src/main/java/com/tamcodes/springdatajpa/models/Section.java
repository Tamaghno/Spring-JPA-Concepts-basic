package com.tamcodes.springdatajpa.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Section extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private int sectionOrder;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;


    @OneToMany(mappedBy = "section")
    private List<Lecture> lectures;
}
