package com.fitchburg.dsa_project.Model;

import java.util.List;

public class InfoPerson {
    
    private String info;
    private List<Person> persons;

    public InfoPerson(String info, List<Person> persons) {
        this.info = info;
        this.persons = persons;
    }
    public InfoPerson() {
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    public List<Person> getPersons() {
        return persons;
    }
    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
