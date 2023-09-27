package com.mycompany.javaall;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int age;
        String name;
        
        System.out.print("Inter Your Name :");
        name = input.nextLine();
       
        
        System.out.print("Enter your age = ");
        age= input.nextInt(); 
        
        System.out.println("Welcome "+name);
        System.out.println("Your age = "+age);
    }
}
