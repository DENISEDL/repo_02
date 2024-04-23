package com.example.repo2.controllers;
import com.example.repo2.entities.ProgrammingLanguage;
import com.example.repo2.services.PLservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class PLcontroller {
    @Autowired
    private PLservices plService;

    @PostMapping("/addPL")
    public ResponseEntity<ProgrammingLanguage> addProgrammingLanguage(@RequestBody ProgrammingLanguage programmingLanguageToAdd) {
        ProgrammingLanguage programmingLanguageAdded = plService.addProgrammingLanguage(programmingLanguageToAdd);
        return ResponseEntity.ok().body(programmingLanguageAdded);
    }
}
