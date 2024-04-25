package com.tamcodes.springdatajpa.models;

import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@SuperBuilder
@MappedSuperclass
public class BaseEntity {

    private String createdBy;

    private String modifiedBy;

    private LocalDateTime createdAt;

    private LocalDateTime modifiedAt;

}
