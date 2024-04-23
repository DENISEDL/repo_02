package com.example.repo2.services;

import com.example.repo2.entities.ProgrammingLanguage;
import com.example.repo2.repositories.RepositoryPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PLservices {
    @Autowired
    private RepositoryPL repositoryPL;

    public ProgrammingLanguage addProgrammingLanguage(ProgrammingLanguage programmingLanguageToAdd) {
        ProgrammingLanguage programmingLanguageAdded = repositoryPL.save(programmingLanguageToAdd);
        return programmingLanguageAdded;
    }
}