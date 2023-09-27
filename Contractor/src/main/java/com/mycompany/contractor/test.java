
package com.mycompany.contractor;

public class test {
    public static void main(String[] args){
        Teacher teacher1 = new Teacher("Shouvik Dhali","Male",21);
        teacher1.displayInfo();
        
        System.out.println(" ");
        
        Teacher teacher2 = new Teacher("Kamal Khan","Male",31);
        teacher2.displayInfo();
        
        Teacher teacher3 = new Teacher();
        teacher3.displayInfo();
    }
}
