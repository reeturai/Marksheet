/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Marksheet.uti;

/**
 *
 * @author welcome
 */
public class Marks {

    int firstCount = 0;
    int disCount = 0;
    int secCount = 0;
    int thirdCount = 0;
    

    public double getPercentage(double total, double fullTotal) {
        return (total / fullTotal) * 100;
    }

    public String getGrade(double percent) {
        if (percent >= 80) {
            disCount++;
            return "Distinction";
        } else if (percent < 80 && percent >= 60) {
            firstCount++;
            return "First";
        } else if (percent >= 45 && percent < 60) {
            secCount++;
            return "second";
        } else if(percent<45)
            thirdCount++;
               return "Third";
        }
     
    

    public void getCount(String g,int failCount) {

        System.out.println("Total distinctions=" + disCount);
        System.out.println("Total first divisions=" + firstCount);
        System.out.println("Total second divisions=" + secCount);
        System.out.println("Total third divisions=" + thirdCount);
        System.out.println("Total fail="+ failCount);
    }
    
}
