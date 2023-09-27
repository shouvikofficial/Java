
package com.mycompany.inheritencepractice;

public class Derive extends Base {
    private int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
    @Override
    void print_me(){
        System.out.println("I am from derive");
    }
    
}
