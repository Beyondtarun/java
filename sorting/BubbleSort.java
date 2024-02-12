package sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + " of the array:");
            arr[i] = sc.nextInt();
           
        }
        bubbleSort(arr);
        for(int i=0;i<size;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public static void bubbleSort(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                   int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    
}
