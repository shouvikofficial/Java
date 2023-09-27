
package com.mycompany.getset;

public class test {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.setName("Shouvik");
        System.out.println(p1.getName());
        p1.setGender("Male");
        System.out.println(p1.getGender());
        p1.setAge(21);
        System.out.println(p1.getAge());
       // p1.display();
    }
}
