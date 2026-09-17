//import java.util.*;
import java.lang.Throwable;

class readLine extends Throwable{
public static void main(String args[]){
//String a;
//Scanner s=new Scanner(System.in);
//
//System.out.print("Enter line:");
//a=s.nextLine();
////a=s.next();     //only one word
//
//System.out.println("Welcome "+a);

 try{    
    int a[]=new int[5];    
    a[5]=30/0;    
   }    
   catch(Exception e){System.out.println("common task completed");}    
//   catch(ArithmeticException e){System.out.println("task1 is completed");}    
//   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}    
   System.out.println("rest of the code..."); 
}
}