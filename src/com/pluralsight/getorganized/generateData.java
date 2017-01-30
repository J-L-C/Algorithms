package com.pluralsight.getorganized;
import java.util.Random;

/**
 * Created by LoudZ on 1/26/2017.
 */
public class generateData {

    generateData(){
        System.out.print("\nYou have create a generateData object!");
    }
    private int min;
    private int max;
    private int[] numberList;
    private Random generator = new Random();

    private void setMinInt(int min){
        this.min = min;
    }
    private void setMaxInt(int max){
        this.max = max;
    }
    public int getMinInt(){
        return this.min;
    }
    public int getMaxInt(){
        return this.max;
    }

    public int[] generateIntNumbers(int min, int max, int quantity){

        setMinInt(min);
        setMaxInt(max);


        if(quantity>=1)
            numberList = new int[quantity];
        else {
            System.out.println("Invalid Quantity!");
            return null;
        }

        for(int i =0; i<quantity;i++){
            numberList[i] = generator.nextInt(getMaxInt());
            //System.out.println("index: "+i+ "value: " + numberList[i]);
        }



        return numberList;
    }
}
