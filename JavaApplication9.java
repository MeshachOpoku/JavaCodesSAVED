/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;


public class JavaApplication9 {

    static  int method (int y)
    { // initialized Array
    int A[]={2,3,4,5,67,8,0,879,3,90,97,76,231,1,4,67};
    for (int q=0;q<A.length;q++)//loop begins
    {if (y<A[q])// if condition here
    { // condition true statement execute
    System.out.print("Data entered has an index of:"+q);break;
    } 
       //in case condition is false the condition will execute 
       elseif:{
           System.out.print("Data entered is not found:ERROR :Wrong Input");break;
    }
        }  
       ; 
    // return statement
   return 1; }
    public static void main(String[] args) {
        // TODO code application logic here
       // the code below  calls the method  from the top and execute 
   System .out.print("Enter a to check whether it exist");
   // accepting user data
   Scanner Va= new Scanner (System.in);
   int  qmz=Va.nextInt();
   method(qmz);
    }
    
}
