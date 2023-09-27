
package com.mycompany.arraydemo;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] myArray = new double[5];
        double sum = 0;
        System.out.println("Inter five numbers:");
        //myArray[0] = input.nextDouble();
        //myArray[1] = input.nextDouble();
        //myArray[2] = input.nextDouble();
        //myArray[3] = input.nextDouble();
        //myArray[4] = input.nextDouble();
        
        for(int i = 0;i<myArray.length;i++){
            myArray[i] = input.nextDouble();
        }
        
        for(int i = 0;i<myArray.length;i++){
            sum = myArray[i] + sum;   
        }    
        //sum = myArray[0]+myArray[1]+myArray[2]+myArray[3]+myArray[4];
        System.out.println("The sum is :" + sum);
        
        double avarage;
        avarage = sum/myArray.length;
        System.out.println("The avarage is :" + avarage);
        //maximum minimum//
        double max = myArray[0];
        for(int i = 1;i<myArray.length;i++){
            if(max<myArray[i]){
               max = myArray[i]; 
            }
        }
        System.out.println("Maximum :" + max);
        
        double min = myArray[0];
        for(int i = 1;i<myArray.length;i++){
            if(min>myArray[i]){
                min = myArray[i];
            }
        }
        System.out.println("Minimum :" + min);
        
        String[] name = {"Shouvik","Kamal","Jisan","Sourab","Sabbir"};
        int[] num1 = {1,2,3,4,5};
        int sum1 = 0;
        for(String x : name){
            System.out.println(x);
        }
        
        for(int y : num1){
            sum1 = sum1 + y;
        }
        System.out.println("Sum :" + sum1);
    }  
}
