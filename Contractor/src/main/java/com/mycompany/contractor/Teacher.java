
package com.mycompany.contractor;

public class Teacher {
    String name;
    String gender;
    int age;
    
    Teacher(){
        System.out.println("No Value!");
    }
    
     Teacher(String n,String g,int a){
        name = n;
        gender = g;
        age = a;
    }

    void displayInfo(){
        System.out.println(name);
        System.out.println(gender);
        System.out.println(age);
    }
}
