package com.bridgelabz.listinterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ReverseList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int num = sc.nextInt();

        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println("Enter ArrayList elements:");
        // Adding elements in ArrayList
        for (int i = 0; i < num; i++) {
            list1.add(sc.nextInt());
        }

        LinkedList<Integer> list2 = new LinkedList<>();
        System.out.println("Enter LinkedList elements:");
        // Adding elements in LinkedList
        for (int i = 0; i < num; i++) {
            list2.add(sc.nextInt());
        }

        System.out.println("ArrayList before Reversing: " + list1);
        reverseList(list1);
        System.out.println("ArrayList after Reversing: " + list1);

        System.out.println("\nLinkedList before Reversing: " + list2);
        reverseList(list2);
        System.out.println("LinkedList after Reversing: " + list2);
    }
    
    // Method to reverse the list
    public static void reverseList(List<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }
}

/*
Output:
    ArrayList before Reversing: [1, 2, 3, 4, 5]
    ArrayList after Reversing: [5, 4, 3, 2, 1]

    LinkedList before Reversing: [1, 2, 3, 4, 5]
    LinkedList after Reversing: [5, 4, 3, 2, 1]
 */