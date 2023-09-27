
package com.mycompany.inheritencepractice;

public class test {
    public static void main(String[] args){
        Derive d1 = new Derive();
        Base b1 = new Base();
        d1.setX(10);
        d1.setY(15);
        b1.setX(5);
        System.out.println(d1.getX());
        System.out.println(b1.getX());
        System.out.println(d1.getY());
        d1.print_me();
        b1.print_me();
    }
    
}
