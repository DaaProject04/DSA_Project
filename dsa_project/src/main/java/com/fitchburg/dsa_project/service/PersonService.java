package com.fitchburg.dsa_project.service;

import java.util.Arrays;
import java.util.List;

import com.fitchburg.dsa_project.Model.InfoPerson;
import com.fitchburg.dsa_project.Model.Person;
import com.fitchburg.dsa_project.sorting.HeapSort;
import com.fitchburg.dsa_project.sorting.InsertionSort;
import com.fitchburg.dsa_project.sorting.MergeSort;

public class PersonService {

    static MergeSort merrgeSort=new MergeSort();
    static InsertionSort insertionSort=new InsertionSort();
    static HeapSort heapSort=new HeapSort();
    
    //creating list dataypes and  inserting data 
    public List<Person> addPersondToList(){
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

    //code to calcuta space complexity
    public InfoPerson mergeSortById() {
        double initialTime=(double)(System.currentTimeMillis());
        List<Person> list=addPersondToList();
        InfoPerson inf=new InfoPerson();
        merrgeSort.mergeSort(list, 1);
        long memoryUsage = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        inf.setPersons(list);
        double finalTime=(double)(System.currentTimeMillis())-initialTime;
        String j="This is sorted by using merge sort with Id in "+finalTime+" ms by using "+ memoryUsage+" bits of memory";
        inf.setInfo(j);
        return inf;
    }
    // code used for implementing sortingbyname
    public InfoPerson mergeSortByName() {
        double initialTime=(double)(System.currentTimeMillis());
        List<Person> list=addPersondToList();
        InfoPerson inf=new InfoPerson();
        merrgeSort.mergeSort(list, 2);
        long memoryUsage = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        inf.setPersons(list);
        double finalTime=(double)(System.currentTimeMillis())-initialTime;
        String j="This is sorted by using merge sort with name in "+finalTime+" ms by using "+ memoryUsage+" bits of memory";
        inf.setInfo(j);
        return inf;
    }
    //code used  for implementing sortingbysalary
    public InfoPerson mergeSortBySalery() {
        double initialTime=(double)(System.currentTimeMillis());
        List<Person> list=addPersondToList();
        InfoPerson inf=new InfoPerson();
        merrgeSort.mergeSort(list, 3);
        long memoryUsage = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        inf.setPersons(list);
        double finalTime=(double)(System.currentTimeMillis())-initialTime;
        String j="This is sorted by using merge sort with salery in "+finalTime+" ms by using "+ memoryUsage+" bits of memory";
        inf.setInfo(j);
        return inf;
        
    }
    //code used  for implementing sortingbyId
    public InfoPerson insertionSortById() {
        double initialTime=(double)(System.currentTimeMillis());
        List<Person> list=addPersondToList();
        InfoPerson inf=new InfoPerson();
        insertionSort.insertionSort(list, 1);
        long memoryUsage = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        inf.setPersons(list);
        double finalTime=(double)(System.currentTimeMillis())-initialTime;
        String j="This is sorted by using insertion sort with Id in "+finalTime+" ms by using "+ memoryUsage+" bits of memory";
        inf.setInfo(j);
        return inf;
    }

    //code used  for implementing sortingbyName
    public InfoPerson insertionSortByName() {
        double initialTime=(double)(System.currentTimeMillis());
        List<Person> list=addPersondToList();
        InfoPerson inf=new InfoPerson();
        insertionSort.insertionSort(list, 2);
        long memoryUsage = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        inf.setPersons(list);
        double finalTime=(double)(System.currentTimeMillis())-initialTime;
        String j="This is sorted by using insertion sort with name in "+finalTime+" ms by using "+ memoryUsage+" bits of memory";
        inf.setInfo(j);
        return inf;
        
    }
    //code used  for implementing sortingbysalary
    public InfoPerson insertionSortBySalery() {
        double initialTime=(double)(System.currentTimeMillis());
        List<Person> list=addPersondToList();
        InfoPerson inf=new InfoPerson();
        insertionSort.insertionSort(list, 3);
        long memoryUsage = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        inf.setPersons(list);
        double finalTime=(double)(System.currentTimeMillis())-initialTime;
        String j="This is sorted by using insertion sort with salery in "+finalTime+" ms by using "+ memoryUsage+" bits of memory";
        inf.setInfo(j);
        return inf;
    }
    //code used  for implementing sortingbyId
    public InfoPerson heapSortById() {
        double initialTime=(double)(System.currentTimeMillis());
        List<Person> list=addPersondToList();
        InfoPerson inf=new InfoPerson();
        heapSort.heapSort(list);
        long memoryUsage = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        inf.setPersons(list);
        double finalTime=(double)(System.currentTimeMillis())-initialTime;
        String j="This is sorted by using heap sort with Id in "+finalTime+" ms by using "+ memoryUsage+" bits of memory";
        inf.setInfo(j);
        return inf;
    }
}
