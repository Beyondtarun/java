import java.util.Arrays;

import javax.lang.model.util.ElementScanner14;
import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class array {
    public static void main(String[] args) {
        // int a[]={1,2,3,4,5};
        // int b[]={1,2,3,4,5};
       
        // // for(int x : a){   for each loop
        // //     System.out.println(x);



        // //second maximum element
        // // int max=0, smax=0;
        // // for(int i=0;i<a.length;i++){
        // //   if(a[i]>max){
        // //     smax=max;
        // //     max=a[i];
        // //   }
        // //   else if(a[i]>smax){
        // //     smax=a[i];
        // //   }
        // // }
        // // System.out.println("second max element is: "+smax);
        
        
        // //left rotation
        // int temp=0,temp2=0;
        // for(int i=0; i<a.length ;i++){
        //     if(i==0){
        //     temp=a[i];
        //     a[i]=a[i+1];
        // }
        //     else if(i==a.length-1)
        //     a[i]=temp;
        //     else{
        //         a[i]=a[i+1];
        //     }}
        //     System.out.println("\narra after  left rotaion is:");
        //     for(int x:a){
        //         System.out.print("  "+x);
            
        // }
        // //rigth rotation
        // temp=b[0];
        // for(int i=1; i<b.length ;i++){
        //     temp2=b[i];
        //     b[i]=temp;
        //     temp=temp2;
        // }
        // b[0]=temp2;
        //     System.out.println("\narra after right rotaion is:");
        //     for(int x:b){
        //         System.out.print("  "+x);
        int[] a = new int[5];

        // Arrays.fill(a, 10);
        System.out.println(Arrays.toString(a));
        System.out.println(a.getClass());
            
        }
    }


    
    
   

