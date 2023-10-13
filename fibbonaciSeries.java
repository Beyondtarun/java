/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Tarun Goyal
 */
public class fibbonaciSeries {
    public static void main(String args[]){
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the limit: ");
       int n=sc.nextInt();
       int a=0,b=1,c=0;
       System.out.print("fibbonaci series is: "+a);
       
       for(int i=2; i<=n; i++){
           a=b;
           b=c;
           c=a+b;
           System.out.print(" "+c);           
       }
    }
}
