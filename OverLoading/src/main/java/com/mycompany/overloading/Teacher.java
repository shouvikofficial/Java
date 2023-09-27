
package com.mycompany.overloading;

public class Teacher {
    String name;
    String gender;
    int age;
    
    Teacher(){
        System.out.println("No Value!");
    }
    
    Teacher(String n,String g){
        this.name = n;
        this.gender = g;
    }
    
    Teacher(String n,String g,int a){
        this.name = n;
        this.gender = g;
        this.age = a;
    }
    
    void displayInfo(){
        System.out.println(name);
        System.out.println(gender);
        System.out.println(age);
    }
}
