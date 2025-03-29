package com.bridgelabz.setinterface;

import java.util.HashSet;
import java.util.Set;

public class UnionIntersectionComputation {
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

        Set<Integer> union = new HashSet<>();
        // Using addAll() method to compute union of sets
        union.addAll(set2);
        union.addAll(set1);

        Set<Integer> intersection = new HashSet<>();
        // Using retainAll() method to compute intersection of sets
        intersection.addAll(set1);
        intersection.retainAll(set2);

        System.out.println("Union of Sets: " + union);
        System.out.println("Intersection of Sets: " + intersection);
    }
}

/*
Input:
    Set 1: [1, 2, 3]
    Set 2: [3, 4, 5]
Output:
    Union of Sets: [1, 2, 3, 4, 5]
    Intersection of Sets: [3]
 */