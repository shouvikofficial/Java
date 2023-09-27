
package com.mycompany.constractorinheritence;

public class Derive extends Base {
    //base/////////
    Derive(){
        //super(0);
        System.out.println("I am a derive class contractor");
    }
    Derive(int x,int y){
        super(x);
        System.out.println("I am a derive class contractor " + x +"," + y);
    }
}
