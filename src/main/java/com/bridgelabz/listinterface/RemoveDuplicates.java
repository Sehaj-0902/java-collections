package com.bridgelabz.listinterface;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        System.out.print("Enter list elements: ");
        // Adding elements in list
        for (int i = 0; i < 7; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("List before removing duplicates: " + list);
        System.out.println("List after removing duplicates: " + removeDuplicates(list));
    }

    // Method to remove duplicate elements from a list
    public static Set<Integer> removeDuplicates(List<Integer> list) {
        // Using LinkedHashSet to remove duplicates while preserving order
        Set<Integer> uniqueElements = new LinkedHashSet<>(list);

        return uniqueElements;
    }
}

/*
Input:
    Enter list elements: 3 4 3 1 2 2 4
Output:
    List before removing duplicates: [3, 4, 3, 1, 2, 2, 4]
    List after removing duplicates: [3, 4, 1, 2]
 */