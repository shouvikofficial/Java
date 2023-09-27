
package com.mycompany.basicjava;
import java.util.Scanner;

public class ArrithmaticDemo {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.print("Inter number 1 : ");
        num1 = input.nextInt();
        
        System.out.print("Inter number 2 : ");
        num2 = input.nextInt();
        
        int sum = num1+num2;
        int multiply = num1*num2;      
        int addition = num1-num2;      
        double div = (double)num1/num2;
        int mod = num1%num2;
        
        System.out.println("Sum : "+sum);
        System.out.println("Multiply : "+multiply);
        System.out.println("Addition : "+addition);
        System.out.println("Divition : "+div);
        System.out.println("Modulas : "+mod);
    }
    
}
