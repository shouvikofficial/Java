
package com.mycompany.polymorphism;

public class traingle extends Shape {
    
    double base;
    double height;
    
    traingle(double b,double h){
        this.base = b;
        this.height = h;
    }
    
    @Override
    double area(){
       System.out.print("Area :");
       return 0.5*base*height;
   }
}
