package com.fitchburg.dsa_project.sorting;

import java.util.List;

import com.fitchburg.dsa_project.Model.Person;

public class HeapSort {
    public void heapSort(List<Person> list) {
        
        int size = list.size();

        // Build a max heap
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(list, size, i);
        }

        // One by one extract an element from heap and
        // place it at the end of sorted array
        for (int i = size - 1; i >= 0; i--) {
            // Move current root to end
            Person temp = list.get(0);
            list.set(0, list.get(i));
            list.set(i, temp);

            // call max heapify on the reduced heap
            heapify(list, i, 0);
        }
        
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    private static void heapify(List<Person> list, int size, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left = 2*i + 1
        int right = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (left < size && list.get(left).getId() > list.get(largest).getId()) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < size && list.get(right).getId() > list.get(largest).getId()) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            Person swap = list.get(i);
            list.set(i, list.get(largest));
            list.set(largest, swap);

            // Recursively heapify the sub-tree
            heapify(list, size, largest);
        }
    }
}
