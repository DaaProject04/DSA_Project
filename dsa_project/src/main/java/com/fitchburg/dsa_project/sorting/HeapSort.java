package com.fitchburg.dsa_project.sorting;

import java.util.List;

import com.fitchburg.dsa_project.Model.Person;

public class HeapSort {
    
    public void heapSort(List<Person> list) {

        int size = list.size();

        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(list, size, i);
        }

        for (int i = size - 1; i >= 0; i--) {
            Person temp = list.get(0);
            list.set(0, list.get(i));
            list.set(i, temp);

            heapify(list, i, 0);
        }
        
    }

    private static void heapify(List<Person> list, int size, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && list.get(left).getId() > list.get(largest).getId()) {
            largest = left;
        }

        if (right < size && list.get(right).getId() > list.get(largest).getId()) {
            largest = right;
        }

        if (largest != i) {
            Person swap = list.get(i);
            list.set(i, list.get(largest));
            list.set(largest, swap);

            heapify(list, size, largest);
        }
    }
}
