package com.bridgelabz.listinterface;

import java.util.*;

public class CountFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        System.out.println("Enter list elements:");
        // Adding elements in list
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextLine());
        }
        
        Map<String, Integer> map = countFrequency(list);
        System.out.println(map);
    }

    // Method to count frequency of elements in the list
    public static Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        
        for (String string : list) {
            if (map.containsKey(string)) {
                map.put(string, map.get(string) + 1);
            }
            else {
                map.put(string, 1);
            }
        }
        return map;
    }
}

/*
Input:
    Enter list elements:
    apple
    banana
    orange
    apple
    strawberry
Output:
    {banana=1, orange=1, apple=2, strawberry=1}
 */