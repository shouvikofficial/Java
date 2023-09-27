
package com.mycompany.enheritance;

public class student extends Person{
    int id;
    
    @Override
    void display(){
        super.display();
        System.out.println(id);
    }
}
