package com.example.repo2.repositories;


import com.example.repo2.entities.ProgrammingLanguage;
import jdk.jfr.Description;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RepositoryPL extends JpaRepository<ProgrammingLanguage, Long> {
}