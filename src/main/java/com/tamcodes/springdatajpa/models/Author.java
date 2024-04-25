package com.tamcodes.springdatajpa.models;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity //this is from Jakarta persistence
public class Author {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "author_sequence")
    /*
    (
            strategy = GenerationType.TABLE,
            generator = "generator_table")
     */
    @SequenceGenerator(
            name = "author_sequence",
            sequenceName = "author_sequence",
            allocationSize = 1
    )
    /*
    @TableGenerator(
            name = "generator_table",
            table = "generator_table",
            pkColumnName = "id_name",
            valueColumnName = "id_value",
            allocationSize = 1
    )
     */
    private Integer id;

    @Column(name = "FIRST_NAME", length = 15)
    private String firstname;

    private String lastname;

    @Column(unique = true, nullable = false)
    private String email;

    private int age;

    @Column(updatable = false, nullable = false)
    private LocalDateTime createdAt;

    @Column(insertable = false)
    private LocalDateTime lastModified;


    @ManyToMany(mappedBy = "authors")
    private List<Course> courses; //Many to many relation with Course entity
}
