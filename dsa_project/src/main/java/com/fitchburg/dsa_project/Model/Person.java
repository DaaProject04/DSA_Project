package com.fitchburg.dsa_project.Model;

public class Person {
    
    private int id;
    private String name;
    private String email;
    private int salery;

    public Person(int id, String name, String email, int salery) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salery = salery;
    }

    public Person() {
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getSalery() {
        return salery;
    }
    public void setSalery(int salery) {
        this.salery = salery;
    }
    
    

}
