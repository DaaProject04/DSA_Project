package com.fitchburg.dsa_project.sorting;

import java.util.List;

import com.fitchburg.dsa_project.Model.Person;

public class InsertionSort {


    public void insertionSort(List<Person> list,int c){

        switch (c) {
            case 1:
                insertionById(list);
                break;
            case 2:
                insertionByName(list);
                break;
            case 3:
                insertionBySalery(list);
                break;
            default:
                break;
        }
    
    }

    private void insertionBySalery(List<Person> list) {
        int i;
        int j;
        for (i = 1; i < list.size(); i++) {
            Person tmp = list.get(i);
            j = i;
            while ((j > 0) && (list.get(j - 1).getSalery() > tmp.getSalery())) {
                list.set(j, list.get(j - 1));
                j--;
            }
            list.set(j, tmp);
        }
    }

    private void insertionByName(List<Person> list) {
        int i;
        int j;
        for (i = 1; i < list.size(); i++) {
            Person tmp = list.get(i);
            j = i;
            while ((j > 0) && (list.get(j - 1).getName().compareTo( tmp.getName())>=0)) {
                list.set(j, list.get(j - 1));
                j--;
            }
            list.set(j, tmp);
        }
    }

    private void insertionById(List<Person> list) {
        int i;
        int j;
        for (i = 1; i < list.size(); i++) {
            Person tmp = list.get(i);
            j = i;
            while ((j > 0) && (list.get(j - 1).getId() > tmp.getId())) {
                list.set(j, list.get(j - 1));
                j--;
            }
            list.set(j, tmp);
        }
    }
}
