package com.tamcodes.springdatajpa.repositories;

import com.tamcodes.springdatajpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
