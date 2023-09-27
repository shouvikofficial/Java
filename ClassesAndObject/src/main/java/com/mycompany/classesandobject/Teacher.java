
package com.mycompany.classesandobject;

public class Teacher {
    String name;
    String gender;
    int phNum;
    
    Teacher(){  //default constractor//
        System.out.println("No value");
    }
    
    Teacher(String n,String g,int p){  //parameter constractor
        name = n;
        gender = g;
        phNum = p;   
    }
    
    void setInfo(String n, String g,int ph ){
        name = n;
        gender = g;
        phNum = ph;
    }
    
    void displayInfo(){
        System.out.println("Name : " +name);
        System.out.println("Gender : " +gender);
        System.out.println("Phone : " + phNum); 
        System.out.println("\n");
    }
}

