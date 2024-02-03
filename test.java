// // // /*
// // //  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// // //  * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// // //  */
// // // import java.util.Scanner;
// // // /**
// // //  *
// // //  * @author Tarun Goyal
// // //  */
// // // public class test {
// // //     public static void main(String args[]){
// // //         Scanner sc=new Scanner(System.in);
        
// // //         System.out.println("Enter class");
// // //         int clas=sc.nextInt(); /takes extra line
// // //         sc.nextLine();
// // //         System.out.println("Enter name");
// // //         String str=sc.nextLine();
        
// // //         System.out.println("Enter rollno");
// // //         int roll=sc.nextInt();
// // //         System.out.println("name: "+str);
        
// // //         System.out.println("marks: "+clas);
// // //         System.out.println("roll: "+roll);
        
// // //     }
// // // }

// // // class tarun{
// // //     static int change(Integer b){
// // //         b=Integer.valueOf(10);
// // //         return b;
// // //     }
// // // }
// // // public class test {
    
// // //     public static void main(String[] args) {
// // //         Integer a = Integer.valueOf(5);
        
// // //         a = tarun.change(a);
// // //         System.out.println(a);
        
        
// // //     }
// // // }
// // public class test{
// //     public static void main(String[] args) {
// //         // /String a="1w3";
       
// //         // System.out.println("start of the code");
// //         // try {
// //         //     // Attempt to load a class that does not exist
// //         //     Class.forName("tes");
// //         //     int a=10/0;
// //         // } catch (ClassNotFoundException | ArithmeticException e) {
// //         //     // Handle the exception
// //         //     // System.out.println("Class not found: " + e.getMessage());
// //         //     System.out.println(e);
// //         // }
// //         // catch (Exception e){
// //         //     System.out.println(e);
// //         // }
// //         // try{    
// //         //     int a[]=new int[5];    
// //         //     a[5]=30/0;    
// //         //    }    
// //         //    catch(Exception e){System.out.println("common task completed");}    
// //         // //    catch(ArithmeticException e){System.out.println("task1 is completed");}    
// //         // //    catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}    
// //         //    System.out.println("rest of the code..."); 
// //         // System.out.println("end of the code");
       

// //         if(System.out.printf("hello world")== null){}
// //     }
// // }

// import java.util.*;

// public class test{
//     public static void main(String[] args) {
//         change("tarun");
//     }
//     static void change(String word){
//         word=word.toUpperCase();
//         for(int i=0;i<word.length();i++){
//             char c= word.charAt(i);
//             int x = c-'A';
//             if(x!=0 && x!= 4 && x!= 8 && x!= 14 && x!= 20)
//             System.out.println((char)(x+65));
//         }
//     }
// }

import java.util.Arrays;

public class test {

    public static String toggle(String binaryNumber) {
        StringBuilder result = new StringBuilder();
        for (char bit : binaryNumber.toCharArray()) {
            result.append((bit == '0') ? '1' : '0');
        }
        return result.toString();
    }

    public static int calculateXOR(String a, String b) {
        return Integer.parseInt(a, 2) ^ Integer.parseInt(b, 2);
    }

    public static String whoIsLucky(int[] arr, String rahulAB, String rupeshAB, int k) {
        String[] rahulABArray = rahulAB.split(" ");
        String rahulA = rahulABArray[0];
        String rahulB = rahulABArray[1];

        String[] rupeshABArray = rupeshAB.split(" ");
        String rupeshA = rupeshABArray[0];
        String rupeshB = rupeshABArray[1];

        int totalTurns = 0;

        while (arr.length > 0) {
            int maxIndex = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }

            int[] selectedValues = Arrays.copyOfRange(arr, Math.max(0, maxIndex - k), Math.min(arr.length, maxIndex + k + 1));
            int[] newArr = new int[arr.length - selectedValues.length];
            System.arraycopy(arr, 0, newArr, 0, Math.max(0, maxIndex - k));
            System.arraycopy(arr, Math.min(arr.length, maxIndex + k + 1), newArr, Math.max(0, maxIndex - k), newArr.length - Math.max(0, maxIndex - k));

            if (newArr.length > 0) {
                totalTurns++;
                if (totalTurns % 2 == 1) {
                    rahulA = toggle(rahulA);
                } else {
                    rupeshA = toggle(rupeshA);
                }
            }

            if (selectedValues.length > 0) {
                if (Arrays.stream(selectedValues).sum() % 2 == 0) {
                    rahulB = toggle(rahulB);
                } else {
                    rupeshB = toggle(rupeshB);
                }
            }

            arr = newArr;
        }

        int xorRahul = calculateXOR(rahulA, rahulB);
        int xorRupesh = calculateXOR(rupeshA, rupeshB);

        if (xorRahul > xorRupesh) {
            return "Rahul";
        } else if (xorRupesh > xorRahul) {
            return "Rupesh";
        } else {
            return "Both";
        }
    }

    public static void main(String[] args) {

        int[] arr1 = {6, 2, 11, 1, 13, 0, 8, 4, 16, 9, 19, 3};
        String rahulAB1 = "01010 10";
        String rupeshAB1 = "1010 01101";
        int k1 = 1;
        String result1 = whoIsLucky(arr1, rahulAB1, rupeshAB1, k1);
        System.out.println(result1);
    }
}
