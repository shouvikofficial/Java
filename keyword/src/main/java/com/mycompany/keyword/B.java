//sub class//
package com.mycompany.keyword;

public class B extends A {
    int x = 5;
    
    /*void display(){
        System.out.println(super.x);
        System.out.println(x);
    }
    
    @Override
    void display(){
        super.display();
        System.out.println("Inside b class");
    }
    */

    public B() {
        super();
        System.out.println("B's constractor");
    }
    
}
