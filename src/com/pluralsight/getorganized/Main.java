package com.pluralsight.getorganized;

public class Main {



    public static void main(String[] args) {
         int intNumberList[];
         int totalNumbers = 1000000;
         int maximum = 1000;

        intNumberList = new int[totalNumbers];

	    System.out.print("Welcome to Algorithms!");

        generateData dataBox = new generateData();

        //ToDo add command line input for min, max, and quantity of numbers
        //we are going to just declare it for the time being

        intNumberList = dataBox.generateIntNumbers(0,maximum, totalNumbers);

        for (int i = 0; i<totalNumbers;i++){
            System.out.println("In Main: "+intNumberList[i]+" "+"Index: "+i);
        }


    }
}
