package com.bridgelabz.setinterface;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        // Adding elements to set1
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        // Adding elements to set2
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        // Computing union of two sets using addAll() method
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        // Computing intersection of two sets using retainAll() method
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        // Computing symmetric difference of two sets using removeAll() method
        Set<Integer> symmetricDifference = new HashSet<>(union);
        symmetricDifference.removeAll(intersection);

        System.out.println("The Symmetric Difference of two sets: " + symmetricDifference);
    }
}

/*
Input:
    Set 1: [1, 2, 3]
    Set 2: [3, 4, 5]
Output:
    The Symmetric Difference of two sets: [1, 2, 4, 5]
 */