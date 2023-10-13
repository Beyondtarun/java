

import java.util.Scanner; 
/**
 *
 * @author Tarun Goyal
 */
public class ReverseOfANumber {
     public static void main(String args[]){
   
   Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int a=sc.nextInt();
    int r,sum=0;
    while(a>0){
    r=a%10;
    a=a/10;
    sum=sum*10+r;
    }
    System.out.println("reverse of the number is: "+sum);
   
            }
}
