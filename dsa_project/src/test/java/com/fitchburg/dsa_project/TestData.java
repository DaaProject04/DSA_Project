package com.fitchburg.dsa_project;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.fitchburg.dsa_project.Model.Person;

public class TestData {
    private static List<Person> allPersons(){
        return Arrays.asList(
            new Person(12,"vosifev-ewi7","vosifev-ewi7@outlook.com",2250),
            new Person(15,"vijubat-ojo38","vijubat-ojo38@gmail.com",4369),
            new Person(1,"coleessence","cole-essence71@hotmail.com",35370),
            new Person(4,"niba_melote32","niba_melote32@yahoo.com",12375),
            new Person(13,"nax_oyunovi14","nax_oyunovi14@outlook.com",98756),
            new Person(11,"topo_sofobu27","topo_sofobu27@mail.com",65352),
            new Person(14,"bawo-mujico66","bawo-mujico66@mail.com",743212),
            new Person(5,"viwebes-ika","viwebes-ika46@hotmail.com",683652),
            new Person(7,"yaf_esoguzi11","yaf_esoguzi11@outlook.com",267652),
            new Person(2,"pagafon-avu23","pagafon-avu23@aol.com",55546),
            new Person(3,"puz-ewaleze83","puz-ewaleze83@mail.com",675586),
            new Person(9,"pomo_pinaje64","pomo_pinaje64@hotmail.com",78956),
            new Person(6,"jur-elodufa33","jur-elodufa33@outlook.com",445678),
            new Person(8,"jatak-ebuyo27","jatak-ebuyo27@yahoo.com",2000500),
            new Person(10,"zivu-zunosu13","zivu-zunosu13@mail.com",35257585)
        );
    }

    public List<Person> sortById(){
        List<Person> li=allPersons();
        Collections.sort(li,new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getId()-o2.getId();
            }
            
        });
        return li;
    }

    public List<Person> sortByName(){
        List<Person> li=allPersons();
        Collections.sort(li,new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
            
        });
        return li;
    }

    public List<Person> sortBySalery(){
        List<Person> li=allPersons();
        Collections.sort(li,new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getSalery()-o2.getSalery();
            }
            
        });
        return li;
    }
}
