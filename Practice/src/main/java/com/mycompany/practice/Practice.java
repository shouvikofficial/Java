

package com.mycompany.practice;

public class Practice {
   String name;
   int id;
   

Practice(String name,int id){
    this.name = name;
    this.id = id;
}   
   
   
   void setMethod(String name,int id){
       this.name = name;
       this.id = id;
   }
   
   void display(){
       System.out.println(name);
       System.out.println(id);
   }
} 
