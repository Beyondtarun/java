import java.util.Scanner;
class arrayinsertion{
public static void main(String args[]){
     int a[]=new int[]{10,20,30,40,50};
     
     Scanner sc=new Scanner(System.in);
     System.out.println("enter value:");
     int value=sc.nextInt();
     System.out.println("enter position:");
     int pos=sc.nextInt();
     for(int i=a.length;i>pos-1;i++){
      a[i+1]=a[i];
     }
     a[pos-1]=value;
     /*for(int i=0;i<10;i++){
        System.out.println("enter "+(i+1)+" elemnt of array: ");
        a[i]=sc.nextInt();
     }*/
     for(int i=0;i<a.length;i++)
     System.out.println(a[i]);
    }
}
