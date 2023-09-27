

package com.mycompany.passmatch;

import java.util.Scanner;

public class Passmatch {

    public static void main(String[] args) {
        String name;
        int age;
       // String bfName;
       // String YN;
      //  String Y = "Yes";
      //  String N = "No";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name :");
        name = input.nextLine();
        System.out.println("Enter your age :");
        age = input.nextInt();
        System.out.println(" ");
        if(age>18){
            //String bfName;
            String YN;
            String Y = "Yes";
            String N = "No";
            Scanner X = new Scanner(System.in);
            System.out.println("Yes! Welcome Nitu. Your are 18 +");
            System.out.println("Your age :" + age);
            System.out.println("Do you love anyone? Say Yes or No");
            YN = X.nextLine();
            if("Yes".equals(YN)){
                String bfName;
                Scanner Z = new Scanner(System.in);
                System.out.println("Who is that lucky person?");
                bfName = Z.nextLine();
                if("Shouvik".equals(bfName)){
                    //System.out.println("You are liar");
                    System.out.println("Congratulations! " +  bfName  +  " also loves you.");
                }else{
                    System.out.println("You are liar");
                }
                
                
            }
            if("No".equals(YN)){
                System.out.println("Opps! I am sorry");
            }
        }else{
            System.out.println("Get lost! your are not 18+");
        }
    }
}
