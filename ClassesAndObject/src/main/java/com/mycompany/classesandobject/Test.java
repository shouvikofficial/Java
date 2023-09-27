
package com.mycompany.classesandobject;

public class Test {
    public static void main(String[] args){
        Teacher teacher1; //object declare//
        teacher1 = new Teacher("Shouvik Dhali","Male",1536244643); // object create  and initialize object in constractor//
        //teacher1.setInfo("Shouvik Dhali","Male",1536244643);
        //teacher1.name = "Shouvik Dhali";
        //teacher1.gender = "Male";
        //teacher1.phNum = 1536244643;
        teacher1.displayInfo();
        
        Teacher teacher2; //object declare//
        teacher2 = new Teacher("Kamal Khan","Male",12732323); //object create
        //teacher2.setInfo("Kamal Khan","Male",12732323);
        //teacher2.name = "Kamal Khan";
        //teacher2.gender = "Male";
        //teacher2.phNum = 12732323;
        teacher2.displayInfo();
        
        Teacher teacher3;
        teacher3 = new Teacher();
        teacher3.displayInfo();
        
    }
}
