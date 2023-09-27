

package com.mycompany.primenumber;

import java.util.Scanner;

public class Primenumber {

    public static void main(String[] args) {
        int i,count,n;
             System.out.print("Enter an number : ");
	     Scanner sc = new Scanner(System.in);
	     n = sc.nextInt();
             System.out.println("Prime numbers between 1 to "+n+" are ");
	for(int j=2; j<=n; j++){
	    count=0;
	    for(i=1; i<=j;i++){
	    if(j%i==0){
	       count++;        
	    }
	  }
	if(count==2){
            System.out.print(j+"  ");  
        }      
	}
    }
}
