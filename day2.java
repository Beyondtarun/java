//GEEKS s

import java.util.Scanner;

public class day2 {
public static void main(String[] args) {
    int sum =0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number: ");
    int n = sc.nextInt();

    // for (int i =1;i<=n;i++){
    //   sum +=i;
    // }
    sum = (n*(n+1))/2;
    System.out.println("Sum of n is : "+sum);
}
}
