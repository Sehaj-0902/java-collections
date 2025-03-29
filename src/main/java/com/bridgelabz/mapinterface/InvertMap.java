package com.bridgelabz.mapinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvertMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        // Adding elements to map
        map.put("A",1);
        map.put("B",2);
        map.put("C",1);

        HashMap<Integer,List<String>> invertMap = new HashMap<>();

        // Inverting the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (invertMap.containsKey(entry.getValue())) {
                invertMap.get(entry.getValue()).add(entry.getKey());
            }
            else {
                List<String> list = new ArrayList<>();
                list.add(entry.getKey());
                invertMap.put(entry.getValue(), list);
            }
        }

        System.out.println("Original Map: " + map);
        System.out.println("Inverted Map: " + invertMap);
    }
}

/*
Output:
    Original Map: {A=1, B=2, C=1}
    Inverted Map: {1=[A, C], 2=[B]}
*/