/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package stringpractice;
import java.util.Scanner;
public class numberInWords {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
     System.out.println("enter the number:");
     int a=sc.nextInt(),r;
     String str="";
     while(a>0){
         r=a%10;
         a=a/10;
         str=str+r;
     }
     System.out.print("NUMBER IN WORDS IS :");     char c;
     for(int i=str.length()-1; i>=0; i--){
         c=str.charAt(i);
         switch(c){
             case '0': System.out.print("zero ");
             break;
             case '1': System.out.print("one ");
             break;
             case '2': System.out.print("two ");
             break;
             case '3': System.out.print("three ");
             break;
             case '4': System.out.print("four ");
             break;
             case '5': System.out.print("five ");
             break;
             case '6': System.out.print("six ");
             break;
             case '7': System.out.print("seven ");
             break;
             case '8': System.out.print("eight ");
             break;
             case '9': System.out.print("nine ");
             break;
             
         }
     }
     }
     
}
