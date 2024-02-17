/**
 * EXCEPTION HANDLING
 * 
 * 
 * Throwable is Parent Class of Exception
 * 
 */

 /**
  * Checked Exceptions: those which can checked at compile time
  * Unchecked Exception: Those which get checked at runtime
  */
/**
 * THROWABLE-> Exception -> IO EXCEPTION
 *                       -> SQL Exception
 *                       -> ClassNotFound Exception
 *                       -> Runtime Exception -> Arithmetic Exception
 *                                            -> NullPointer
 *                                            -> NumberFormat
 *                                            -> IndexOutOfBoundsException
 */

import java.util.Scanner;

import javax.management.RuntimeErrorException;

/**
  * TRY : try block mai exception generate hone ke baad likha code exceute nhi hota wha se control catch block pe chla jaata hai
  * CATCH
  * FINALLY : ye exceute hoga hi hoga chahe exception aaye ya naa aye
  * THROW
  * THROWS

  try ke sath catch ya finally mai se koi ek ya dono hone chahiye;

  */
public class ExceptionHandling {

    public static void main(String... args){
        int a = 10,b= 20,c;
        
    Scanner sc = new Scanner(System.in);
    int dividend = sc.nextInt();
    int divisor = sc.nextInt();
   
        try{
            // c=a/0; //Arithmetic Exception
            // System.out.println(c);
            int result = dividend / divisor;
            System.out.println("result is: "+ result);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
           System.out.println("Sum is:"+(a+b));

        /* Multiple catch block*/
        int arr[] = new int[5];
        
        try{
            arr[6] =9; // it will generate two exceptions
        }catch(ArrayIndexOutOfBoundsException e){ //catch(ArrayIndexOutOfBond | ArithmeticException e)
            System.out.println(e.getMessage());
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

        /*
         * Nested Try Catch
         */a

         try{ //agar first try block mai exception aai to nested try block nhi chelga
            int result = 10/0;
            try{
                arr[6]= 10;
            }catch(Exception e){
                System.out.println(e.getMessage());

            }

         }catch(Exception e){
            System.err.println(e.getMessage());

         }finally{
            System.err.println("Hello wolrd i am finally block");
         }

         /*
          * THROW : jab ek normal statement ko exception ki trha throw krna ho // throw ke baad likha hua code execute nhi hoga
          * THROWS
          */
System.out.println("Enter age:");
          int age = sc.nextInt();
          if(age<18){
            throw new RuntimeException("sorry you cant vote");
          }else{
            System.err.println("you can vote");
          }

         
        }
 
 
}
