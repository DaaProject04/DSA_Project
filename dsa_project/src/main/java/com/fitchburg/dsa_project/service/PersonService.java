package com.fitchburg.dsa_project.service;

import java.util.Arrays;
import java.util.List;

import com.fitchburg.dsa_project.Model.Person;
import com.fitchburg.dsa_project.sorting.InsertionSort;
import com.fitchburg.dsa_project.sorting.MergeSort;

public class PersonService {

    static MergeSort merrgeSort=new MergeSort();
    static InsertionSort insertionSort=new InsertionSort();

    private static List<Person> addPersondToList(){
        return Arrays.asList(
            new Person(12,"vosifev-ewi7","vosifev-ewi7@outlook.com",800),
            new Person(15,"vijubat-ojo38","vijubat-ojo38@gmail.com",800),
            new Person(1,"coleessence","cole-essence71@hotmail.com",900),
            new Person(4,"niba_melote32","niba_melote32@yahoo.com",900),
            new Person(13,"nax_oyunovi14","nax_oyunovi14@outlook.com",900),
            new Person(11,"topo_sofobu27","topo_sofobu27@mail.com",800),
            new Person(14,"bawo-mujico66","bawo-mujico66@mail.com",800),
            new Person(5,"viwebes-ika","viwebes-ika46@hotmail.com",800),
            new Person(7,"yaf_esoguzi11","yaf_esoguzi11@outlook.com",900),
            new Person(2,"pagafon-avu23","pagafon-avu23@aol.com",800),
            new Person(3,"puz-ewaleze83","puz-ewaleze83@mail.com",800),
            new Person(9,"pomo_pinaje64","pomo_pinaje64@hotmail.com",800),
            new Person(6,"jur-elodufa33","jur-elodufa33@outlook.com",800),
            new Person(8,"jatak-ebuyo27","jatak-ebuyo27@yahoo.com",800),
            new Person(10,"zivu-zunosu13","zivu-zunosu13@mail.com",900)
        );
    }


    public List<Person> mergeSortById() {
        List<Person> li=addPersondToList();
        merrgeSort.mergeSort(li, 1);
        return li;
    }

    public List<Person> mergeSortByName() {
        List<Person> li=addPersondToList();
        merrgeSort.mergeSort(li, 2);
        return li;
    }

    public List<Person> mergeSortBySalery() {
        List<Person> li=addPersondToList();
        merrgeSort.mergeSort(li, 3);
        return li;
    }

    public List<Person> insertionSortById() {
        List<Person> li=addPersondToList();
        insertionSort.insertionSort(li, 1);
        return li;
    }


    public List<Person> insertionSortByName() {
        List<Person> li=addPersondToList();
        insertionSort.insertionSort(li, 2);
        return li;
    }

    public List<Person> insertionSortBySalery() {
        List<Person> li=addPersondToList();
        insertionSort.insertionSort(li, 3);
        return li;
    }
}
