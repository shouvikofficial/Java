
package com.mycompany.math;

import java.util.Scanner;


public class Math {
    public static void main(String[] args) {
        
        double a;
        double b;
        double c;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the value of A : ");
        a = input.nextDouble();
        System.out.println("Enter the value of B : ");
        b = input.nextDouble();
        System.out.println("Enter the value of C : ");
        c = input.nextDouble();
        
        double root1 =0;
        double root2= 0;
        
        double discriminant = b * b - 4 * a * c;
        
        if(discriminant<0){
            System.out.println("Roots are imagnary");
        }
        if(discriminant == 0){
            System.out.println("Roots are equal");
            root1 = -b / (2*a);
            root2 = -b / (2*a);
        }
        if(discriminant > 0){
            System.out.println("Roots are unequal");
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        }
        
        System.out.println("Roots of the quadratic equation are : ");
        System.out.println("Root1 : " + root1);
        System.out.println("Root2 : " + root2);
        
    }
    
}
