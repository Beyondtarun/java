/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package stringpractice;
import java.util.Scanner;
/**
 *
 * @author Tarun Goyal
 */
public class palindrome { 
    public static void main(String args[]){
        //reverse of a number
   Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int a=sc.nextInt();
    int r,sum=0,c=a;
    while(a>0)
    {
    r=a%10;
    a=a/10;
    sum=sum*10+r;
    }
   if(c==sum){
       System.out.println("NUMBER IS PALINDROME");
   }
   else{
       System.out.println("number is not palindrome sorry");
   }
   
            }
}
