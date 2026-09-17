import java.util.*;
public class factorialrecursion{
 public static int fact(int x){
    if(x>1)
    return x * fact (x-1);
    else
    return 1;
 }
 public static void main(String... args){
    System.out.println("factorial of 5 with recursion is: "+fact(5));
 }
}