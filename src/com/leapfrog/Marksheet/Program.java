/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Marksheet;

import com.leapfrog.Marksheet.uti.Marks;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Marks ms = new Marks();
         
        String[] students = new String[3];
        String[] subjects = {"Nepali", "Science", "Math"};
        double[][] marks = new double[students.length][subjects.length];
        double[] total=new double[students.length];
        double highest = 0;
        String grade = null;
        int failCount=0;

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter student:");
            students[i] = input.next();
           
            boolean Status = false;

            for (int j = 0; j < subjects.length; j++) {
                System.out.println("enter Marks for " + subjects[j]);
                marks[i][j] = input.nextDouble();
                total[i] =total[i]+ marks[i][j];
                if (marks[i][j] < 32) {
                    failCount++;
                    Status = true;
                }
            }
            System.out.println("Total marks=" + total[i]);
            if (Status) {
                System.out.println("Fail");
                System.out.println("");
            } else {
                System.out.println("Pass");
                double p = ms.getPercentage(total[i], (students.length * 100));
                System.out.println("Percentage=" + p);
                grade = ms.getGrade(p);
                System.out.println("Division=" + grade);
                System.out.println("");

            }
         
        }
        System.out.println("");
        System.out.println("Descriptions:");
        ms.getCount(grade,failCount);
    }
}                      
