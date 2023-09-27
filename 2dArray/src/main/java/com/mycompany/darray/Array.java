
package com.mycompany.darray;

import java.util.Scanner;

public class Array {
   public static void main(String[] args){
       
       Scanner input = new Scanner(System.in);
       
       int[][] number = new int[2][3];
       int[][] number1 = new int[2][3];
       //number[0][0] = 1;
       //number[0][1] = 2;
       //number[0][2] = 3;
       //number[1][0] = 4;
       //number[1][1] = 5;
       //number[1][2] = 6;
       
       
       //sum of 2 matrix//
       
       //gettting input for first matrix//
       
       System.out.println("Enter number for first matrix : ");
       for(int i = 0;i<2;i++){
           for(int j = 0;j<3;j++){
              number[i][j] = input.nextInt();
           }
       }
       
        //gettting input for 2nd matrix//
       System.out.println("Enter number for second matrix : ");
       for(int i = 0;i<2;i++){
           for(int j = 0;j<3;j++){
              number1[i][j] = input.nextInt();
           }
       }
       
       for(int i = 0;i<2;i++){
           for(int j = 0;j<3;j++){
               System.out.print(" " + number[i][j]);
           }
           System.out.println();
       }
       System.out.println();
       for(int i = 0;i<2;i++){
           for(int j = 0;j<3;j++){
               System.out.print(" " + number1[i][j]);
           }
           System.out.println();
       }
       
       //add 2 matrix
       
       
   }
}