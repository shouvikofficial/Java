
package com.mycompany.enheritance;

public class teacher extends Person {
    
    int salary;
    String position;
    
    @Override
    void display(){
        super.display();
        System.out.println(salary);
        System.out.println(position);
    }
}
