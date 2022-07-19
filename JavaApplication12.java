/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author mesha
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author mesha
 */

static float  checkWorker(int index) {
 int a[]={11,2,30,4,5,6,7,4,87,8,7,9,9,9,3};
 String Xr[]={"Sarah","Emmaunel","Queen Ella","WendyLove","Asa"};
 // for loop 
// System.out.print(Xr.length);
 
 
  
  for (int g=0;g<Xr.length;g++)
      
  { //check index  passed 
  if(index==g)
  {System.out.print("WORKERS DETIAL\t\n");
// display workers info 
 System.out.println(" Name:"+Xr[g]);
  
  }
  
  
  
  
      
  

     
 
 }
return 1;}   
    public static void main(String[] args) {
        // TODO code application logic here
        int y;
         System.out.print("Enter Worker's index to identify his/her name ");
         Scanner jia =new Scanner(System.in);
         int Lame=jia.nextInt();
        // System.out.print("Enter your index");
         // int gis=jia.nextInt();
          checkWorker(Lame);
        }
    
    
}

