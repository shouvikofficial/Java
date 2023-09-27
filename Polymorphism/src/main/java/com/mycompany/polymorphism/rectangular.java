
package com.mycompany.polymorphism;

public class rectangular extends Shape {
    
   double length,width;
   
   rectangular(double l,double w){
       this.length = l;
       this.width = w;
   }
   
   @Override
   double area(){
       System.out.print("Area :");
       return length*width;
   }
}
