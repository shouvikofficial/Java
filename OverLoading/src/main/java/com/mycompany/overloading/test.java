
package com.mycompany.overloading;

public class test {
    public static void main(String[] args){
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("Shouvik Dhali","Male",21);
        teacher2.displayInfo();
        Teacher teacher3 = new Teacher("Kamal Khan","Male",31);
        teacher3.displayInfo();
    }
}
