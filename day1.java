import java.util.Scanner;

public class day1 {
//     public static void  main(String[] args){
//  Scanner sc = new Scanner(System.in);
//     System.out.println("enter number:");
//     int a = sc.nextInt();
    
//     int b = sc.nextInt();

//     System.out.println("sum is: "+(a+b));
//     }
   

public static void main(String[] args) {
    int[] a= {5,6,2,1,5,2,5,6,3,4,4,1,0,0,11,11};
    int[] dup = new int[20];
    for(int i=0;i<a.length ;i++){
        for(int j=a.length-1; j>i;j--){
            if(a[j]==a[i]){
            dup[a[i]]++;

            }
        }
    }
    for(int i=0;i<dup.length;i++){
        if(dup[i]!=0){
            System.out.println(i);
        }
    }
}
}
