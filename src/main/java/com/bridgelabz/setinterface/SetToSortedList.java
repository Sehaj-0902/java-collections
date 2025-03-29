package com.bridgelabz.setinterface;

import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        // Adding Hashset elements to a list
        List<Integer> list = new ArrayList<>(set);

        System.out.println("HashSet: " + set);

        // Sorting list using Collections.sort() method
        Collections.sort(list);

        System.out.println("Sorted List: " + list);
    }
}

/*
Input:
    HashSet: [5, 3, 9, 1]
Output:
    Sorted List: [1, 3, 5, 9]
 */