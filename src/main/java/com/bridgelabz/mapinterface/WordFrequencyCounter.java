package com.bridgelabz.mapinterface;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String filePath = sc.nextLine();
        Map<String, Integer> wordFrequency = countWordFrequency(filePath);

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
    }
    
    // Method to count word frequency
    public static Map<String, Integer> countWordFrequency(String filePath) {
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z\\s]", "").split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        }
        catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return wordFrequencyMap;
    }
}

/*
Input:
    Enter file path: ..\mapinterface\sampleWordFile.txt
Output:
    world=1 java=1 this=2 is=2 hello=1 interface=1 map=1
*/