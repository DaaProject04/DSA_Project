package com.fitchburg.dsa_project.sorting;

import java.util.ArrayList;
import java.util.List;

import com.fitchburg.dsa_project.Model.Person;

public class MergeSort {

    public void mergeSort(List<Person> list,int c) {
    	if (list.size() <= 1) {
            return;
        }

        List<Person> left = new ArrayList<>();
        List<Person> right = new ArrayList<>();

        for (int i = 0; i < list.size() / 2; i++) {
            left.add(list.get(i));
        }

        for (int i = list.size() / 2; i < list.size(); i++) {
            right.add(list.get(i));
        }

        mergeSort(left,c);
        mergeSort(right,c);
        
        switch(c){
            case 1:
                mergeById(list,left,right);
                break;
            case 2:
                mergeByName(list, left, right);
                break;
            case 3:
                mergeBySalery(list, left, right);
                break;
            default:
                break;
        }
        

        
        
    }
    
    private void mergeById(List<Person> list, List<Person> left, List<Person> right) {
    	int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getId() <= right.get(j).getId()) {
                list.set(k, left.get(i));
                i++;
            } else {
                list.set(k, right.get(j));
                j++;
            }
            k++;
        }

        while (i < left.size()) {
            list.set(k, left.get(i));
            i++;
            k++;
        }

        while (j < right.size()) {
            list.set(k, right.get(j));
            j++;
            k++;
        }

		
	}

    private void mergeByName(List<Person> list, List<Person> left, List<Person> right) {
    	int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getName().compareTo( right.get(j).getName())<=0) {
                list.set(k, left.get(i));
                i++;
            } else {
                list.set(k, right.get(j));
                j++;
            }
            k++;
        }

        while (i < left.size()) {
            list.set(k, left.get(i));
            i++;
            k++;
        }

        while (j < right.size()) {
            list.set(k, right.get(j));
            j++;
            k++;
        }

		
	}

    private void mergeBySalery(List<Person> list, List<Person> left, List<Person> right) {
    	int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getSalery() <= right.get(j).getSalery()) {
                list.set(k, left.get(i));
                i++;
            } else {
                list.set(k, right.get(j));
                j++;
            }
            k++;
        }

        while (i < left.size()) {
            list.set(k, left.get(i));
            i++;
            k++;
        }

        while (j < right.size()) {
            list.set(k, right.get(j));
            j++;
            k++;
        }

		
	}

}
