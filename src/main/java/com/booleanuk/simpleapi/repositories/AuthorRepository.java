package com.booleanuk.simpleapi.repositories;

import com.booleanuk.simpleapi.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
