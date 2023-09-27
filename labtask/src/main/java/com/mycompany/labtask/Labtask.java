
package com.mycompany.labtask;
import java.util.Scanner;

public class Labtask {
     public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter an number :");
   int n = sc.nextInt();
   for (int i = 1; i <= n*2; i++){
   for (int j = 1; j <= i; j = j + 2){
    System.out.print("*");
   }
   System.out.print("\n");
  }
 }
}
