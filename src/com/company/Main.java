package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Object;
import java.util.stream.Stream;

/**
 * Michael Stone
 * Lab 7
 * This program reads in a text file containing
 * 10 integer quiz scores for 12 students,
 * and stores them into a 2 dimensional array.
 * The program also finds the average score
 * for each student and displays students
 * who are struggling.
 */

public class Main {

    static final int NUM_STUDENTS = 12;
    static final int NUM_SCORES = 10;

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("scores");
        Scanner stdin = new Scanner(inputFile);

        int[][] studentScores = new int[NUM_STUDENTS][NUM_SCORES];
        int[] avgArray = new int[NUM_SCORES];
        double currentTotal = 0;
        double currentAvg = 0;
        int counter = 0;


        System.out.println("Enter the name of the file: ");
        System.out.println("The scores are: ");

        for (int Student = 0; Student <= NUM_STUDENTS; Student++) {
            for (int Score = 0; Score <= NUM_SCORES; ++Score) {
                studentScores[Student][Score] = stdin.nextInt();
                System.out.print(studentScores[Student][Score] + " ");
                if (Score <= NUM_SCORES) {
                    currentTotal = currentTotal + studentScores[Student][Score];
                    counter = counter + studentScores[Student][Score];
                } else if (Score == NUM_SCORES) {
                    currentAvg = counter / NUM_SCORES;
                    avgArray[Student] = (int) currentTotal;
                }   else {
                        counter = 0;
                        currentAvg = 0;
                    }
                break;

            }
            System.out.println();



        }

        stdin.close();
    }
}





