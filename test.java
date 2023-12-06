// // /*
// //  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// //  * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// //  */
// // import java.util.Scanner;
// // /**
// //  *
// //  * @author Tarun Goyal
// //  */
// // public class test {
// //     public static void main(String args[]){
// //         Scanner sc=new Scanner(System.in);
        
// //         System.out.println("Enter class");
// //         int clas=sc.nextInt(); /takes extra line
// //         sc.nextLine();
// //         System.out.println("Enter name");
// //         String str=sc.nextLine();
        
// //         System.out.println("Enter rollno");
// //         int roll=sc.nextInt();
// //         System.out.println("name: "+str);
        
// //         System.out.println("marks: "+clas);
// //         System.out.println("roll: "+roll);
        
// //     }
// // }

// // class tarun{
// //     static int change(Integer b){
// //         b=Integer.valueOf(10);
// //         return b;
// //     }
// // }
// // public class test {
    
// //     public static void main(String[] args) {
// //         Integer a = Integer.valueOf(5);
        
// //         a = tarun.change(a);
// //         System.out.println(a);
        
        
// //     }
// // }
// public class test{
//     public static void main(String[] args) {
//         // /String a="1w3";
       
//         // System.out.println("start of the code");
//         // try {
//         //     // Attempt to load a class that does not exist
//         //     Class.forName("tes");
//         //     int a=10/0;
//         // } catch (ClassNotFoundException | ArithmeticException e) {
//         //     // Handle the exception
//         //     // System.out.println("Class not found: " + e.getMessage());
//         //     System.out.println(e);
//         // }
//         // catch (Exception e){
//         //     System.out.println(e);
//         // }
//         // try{    
//         //     int a[]=new int[5];    
//         //     a[5]=30/0;    
//         //    }    
//         //    catch(Exception e){System.out.println("common task completed");}    
//         // //    catch(ArithmeticException e){System.out.println("task1 is completed");}    
//         // //    catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}    
//         //    System.out.println("rest of the code..."); 
//         // System.out.println("end of the code");
       

//         if(System.out.printf("hello world")== null){}
//     }
// }

import java.util.*;

public class test{
    public static void main(String[] args) {
        change("tarun");
    }
    static void change(String word){
        word=word.toUpperCase();
        for(int i=0;i<word.length();i++){
            char c= word.charAt(i);
            int x = c-'A';
            if(x!=0 && x!= 4 && x!= 8 && x!= 14 && x!= 20)
            System.out.println((char)(x+65));
        }
    }
}