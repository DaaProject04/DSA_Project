package com.fitchburg.dsa_project.controller;

import org.springframework.web.bind.annotation.RestController;

import com.fitchburg.dsa_project.Model.InfoPerson;
import com.fitchburg.dsa_project.Model.Person;
import com.fitchburg.dsa_project.service.PersonService;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping
public class Controller {

    PersonService personService=new PersonService();
    //endoint used to get all info
    @GetMapping("/getall")
    public List<Person> getAll() {
        return personService.addPersondToList();
    }
    
    //getting the  data by id using heap sort
    @GetMapping("/heapbyid")
    public InfoPerson heapById() {
        return personService.heapSortById();
    }
    //getting the  data by id using merge sort
    @GetMapping("/mergebyid")
    public InfoPerson mergeSortById() {
        return personService.mergeSortById();
    }
    //get the data by name using merge sort
    @GetMapping("/mergebyname")
    public InfoPerson mergeSortByName(){
        return personService.mergeSortByName();
    }
    //getting the data by salery using mergesort
    @GetMapping("/mergebysalery")
    public InfoPerson mergeSortBySalery() {
        return personService.mergeSortBySalery();
    }
    //getting data by id using insertion sort
    @GetMapping("/insertionbyId")
    public InfoPerson insertionSortById() {
        return personService.insertionSortById();
    }
    //getting data by name using insertion sort
    @GetMapping("/insertionbyname")
    public InfoPerson insertionSortByName() {
        return personService.insertionSortByName();
    }
    //getting data by id using insertion sort
    @GetMapping("/insertionbysalery")
    public InfoPerson insertionSortBysalery() {
        return personService.insertionSortBySalery();
    }
    
}
