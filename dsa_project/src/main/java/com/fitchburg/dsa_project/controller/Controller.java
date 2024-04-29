package com.fitchburg.dsa_project.controller;

import org.springframework.web.bind.annotation.RestController;

import com.fitchburg.dsa_project.Model.InfoPerson;
import com.fitchburg.dsa_project.Model.Person;
import com.fitchburg.dsa_project.service.PersonService;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping
public class Controller {

    @GetMapping("/heapbyid")
    public InfoPerson getMethodName() {
        return new PersonService().heapSortById();
    }

    @GetMapping("/mergebyid")
    public InfoPerson mergeSortById() {
        return new PersonService().mergeSortById();
    }

    @GetMapping("/mergebyname")
    public InfoPerson mergeSortByName(){
        return new PersonService().mergeSortByName();
    }

    @GetMapping("/mergebysalery")
    public InfoPerson mergeSortBySalery() {
        return new PersonService().mergeSortBySalery();
    }

    @GetMapping("/insertionbyId")
    public InfoPerson insertionSortById() {
        return new PersonService().insertionSortById();
    }
    
    @GetMapping("/insertionbyname")
    public InfoPerson insertionSortByName() {
        return new PersonService().insertionSortByName();
    }

    @GetMapping("/insertionbysalery")
    public InfoPerson insertionSortBysalery() {
        return new PersonService().insertionSortBySalery();
    }
    
}
