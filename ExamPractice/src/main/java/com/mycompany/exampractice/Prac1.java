
package com.mycompany.exampractice;

public class Prac1 {
    String Name;
    int id;
    String gender;

    public Prac1(String Name, int id, String gender) {
        this.Name = Name;
        this.id = id;
        this.gender = gender;
    }

    void display(){
        System.out.println(Name);
        System.out.println(id);
        System.out.println(gender);
    }
    
}
