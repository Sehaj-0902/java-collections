package com.bridgelabz.queueinterface;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryNumberGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        System.out.print("Enter number of binary numbers to be generated: ");
        int num = sc.nextInt();

        System.out.println("Generated Binary Numbers:");
        generateBinaryNumber(num);
    }

    // Method to generate binary numbers using queue
    public static void generateBinaryNumber(int num) {
        Queue<String> queue = new LinkedList<>();

        queue.add("1");

        while (num-- > 0) {
            String s1 = queue.peek();

            queue.remove();

            System.out.println(s1);

            queue.add(s1 + "0");

            queue.add(s1 + "1");
        }
    }
}

/*
Input:
    Enter number of binary numbers to be generated: 5
Output:
    Generated Binary Numbers:
    1
    10
    11
    100
    101
 */