package com.bridgelabz.listinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RotateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        System.out.print("Enter list elements: ");
        // Adding elements in list
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        System.out.print("Enter rotation position: ");
        int position = sc.nextInt();

        System.out.print("Rotated List: " + rotateElements(list, position));
    }

    // Method to rotate list elements by given number of positions
    public static List<Integer> rotateElements(List<Integer> list, int position) {
        List<Integer> temp = new ArrayList<>(list);
        int size = list.size();

        position = position % size;

        List<Integer> rotatedList = new ArrayList<>(temp.subList(position, size));
        rotatedList.addAll(temp.subList(0, position));

        return rotatedList;
    }
}

/*
Input:
    Enter list elements: 10 20 30 40 50
    Enter rotation position: 3
Output:
    Rotated List: [40, 50, 10, 20, 30]
 */