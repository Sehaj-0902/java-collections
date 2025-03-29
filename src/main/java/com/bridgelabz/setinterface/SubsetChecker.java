package com.bridgelabz.setinterface;

import java.util.HashSet;
import java.util.Set;

public class SubsetChecker {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        // Adding elements to set1
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        // Adding elements to set2
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        System.out.println("\nIs Set 1 subset of Set 2? " + isSubset(set1, set2));
        System.out.println("Is Set 2 subset of Set 1? " +isSubset(set2, set1));
    }

    // Method to check if a set is a subset of another set using containsAll() method
    public static boolean isSubset(Set<Integer> subset, Set<Integer> superset) {
        if (superset.containsAll(subset)) {
            return true;
        }
        else {
            return false;
        }
    }
}

/*
Input:
    Set 1: [2, 3]
    Set 2: [1, 2, 3, 4]
Output:
    Is Set 1 subset of Set 2? true
    Is Set 2 subset of Set 1? false
 */