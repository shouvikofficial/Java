

package com.mycompany.variabledatatype;

public class VariableDatatype {

    public static void main(String[] args) {
        int i;
        float f;
        double d;
        boolean b;
        char c;
        short s;
        
        b = true;
        i = 10;
        c = 'a';
        f = (float)12.3;
        d = 12.2342;
        s = 32342;
        
        System.out.printf("Boolean b = %b\n",b);
        System.out.printf("Charecter c = %c\n",c);
        System.out.printf("Integer i = %d\n",i);
        System.out.println("f = "+f);
        System.out.println("d = "+d);
        System.out.println("s = "+s);
    }
}