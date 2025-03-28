package com.bridgelabz.setinterface;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetComparison {
    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<>();
        // Adding elements to set1
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new LinkedHashSet<>();
        // Adding elements to set2
        set2.add(3);
        set2.add(1);
        set2.add(2);

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        // Checking if both sets are equal using equals() method
        boolean areEqual = set1.equals(set2);

        System.out.println("Are both set equal? " + areEqual);
    }
}

/*
Input:
    Set 1: [1, 2, 3]
    Set 2: [3, 1, 2]
Output:
    Are both set equal? true
 */