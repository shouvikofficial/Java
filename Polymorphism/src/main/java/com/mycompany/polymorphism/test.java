
package com.mycompany.polymorphism;

public class test {
    public static void main(String[] args){
       Shape[] s = new Shape[3];
        
       s[0] = new Shape();
       s[1] = new rectangular(10,20);
       s[2] = new traingle(10,20);
        
      for(int i = 0;i<3;i++){
          System.out.println(s[i].area());
      }
        
        
        //System.out.println(s[0].area());
        //System.out.println(s[1].area());
        //System.out.println(s[2].area());
    }
    
}