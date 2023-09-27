
package com.mycompany.enheritance;
import java.util.Scanner;
public class test {
    public static void main(String[] args){
        //Person p = new Person();
        teacher t1 = new teacher();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        t1.name = input.nextLine();
        System.out.println("Enter your age: ");
        t1.age = input.nextInt();
        System.out.println("Enter your gender: ");
        t1.gender = input.nextLine();
        System.out.println("Enter your salary: ");
        t1.salary = input.nextInt();
        System.out.println("Enter your position: ");
        t1.position = input.nextLine();
        
        student s1 = new student();
        
        s1.name = "Kamal Khan";
        s1.age = 13;
        s1.gender = "Male";
        s1.id = 1159;
        
        
       // student s1 = new student(1159);
        t1.display();
        System.out.println(" ");
        s1.display();
        
        //student s1 = new student("Shouvik","Male",21,1159);
        
        
    }
}
