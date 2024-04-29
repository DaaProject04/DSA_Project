package com.fitchburg.dsa_project.controller;

import org.springframework.web.bind.annotation.RestController;

import com.fitchburg.dsa_project.Model.Person;
import com.fitchburg.dsa_project.service.PersonService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping
public class Controller {


    @GetMapping("/mergebyid")
    public List<Person> mergeSortById() {
        return new PersonService().mergeSortById();
    }

    @GetMapping("/mergebyname")
    public List<Person> mergeSortByName() {
        return new PersonService().mergeSortByName();
    }

    @GetMapping("/mergebysalery")
    public List<Person> mergeSortBySalery() {
        return new PersonService().mergeSortBySalery();
    }

    @GetMapping("/insertionbyId")
    public List<Person> insertionSortById() {
        return new PersonService().insertionSortById();
    }
    
    @GetMapping("/insertionbyname")
    public List<Person> insertionSortByName() {
        return new PersonService().insertionSortByName();
    }

    @GetMapping("/insertionbysalery")
    public List<Person> insertionSortBysalery() {
        return new PersonService().insertionSortBySalery();
    }
    
}
