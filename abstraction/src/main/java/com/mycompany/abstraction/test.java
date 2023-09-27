
package com.mycompany.abstraction;

public class test {
    public static void main(String[] args){
        MobileUser p1; //reference variable//
        p1 = new Rahim();
        p1.sendSms();
        p1.call();
        p1 = new Karim();
        p1.sendSms(); 
    }
}
