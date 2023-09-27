
//user input//

package com.mycompany.assignmentanisul;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args){
        int id;
        String tittle;
        int price;
        String description;
        String category;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Inter Id :");
        id = input.nextInt();
        System.out.print("Inter Tittle :");
        tittle = input.nextLine();
        System.out.print("Inter Price :");
        price = input.nextInt();
        System.out.print("Inter Description :");
        description = input.nextLine();
        System.out.print("Inter Category :");
        category = input.nextLine();
        
        System.out.println(id);
        System.out.println(tittle);
        System.out.println(price);
        System.out.println(description);
        System.out.println(category);
    }
    
}
