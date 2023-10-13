import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter value: ");
    int n=sc.nextInt();
    System.out.println("pattern in...............");

    
    
// *
// **
// ***
// ****
//*****
    for(int i=1; i<=n; i++){
        for(int j=1;j<=i;j++){  
            System.out.print("*");

        }
        System.out.println();
    }




// *****
// ****
// ***
// **
// *
    for(int i=n; i>=1; i--){
        for(int j=1;j<=i;j++){  
            System.out.print("*");

        }
        System.out.println();
    }
    
// *
// **
// ***
// ****
// *****

    for(int i=0; i<n; i++){
        for(int j=n-1;j>i;j--){  
            System.out.print(" ");
        }
        for(int k=0; k<=i;k++){
            System.out.print("*");
        }
        System.out.println();
    }

//      *
//     ***
//    *****
//   *******
//  *********
    for(int i=0; i<n; i++){
        for(int j=n-1;j>i;j--){  
            System.out.print(" ");
        }
        for(int k=0; k<i*2+1;k++){
            System.out.print("*");
        }
        System.out.println();
    }








    }
    
}
