/**
 * Two pointer algorithm works with sorted array.
 */

package Algorithms;

public class TwoPointer {
    /* TWO SUM */

    // public static void main(String[] args) {
    // int[] arr = {2,3,4,5,6,7,8};
    // int i = 0, j= arr.length-1;
    // int target = 11;

    // int[] d = Find(arr, target);
    // System.out.println(d[0]+" "+d[1]);
    // }
    // public static int[] Find(int[] arr, int target){
    // int i = 0, j= arr.length-1;
    // int[] c = new int[2];
    // while(i<j){
    // if(arr[i]+arr[j]== target){
    // c[0]=i;
    // c[1]=j; break;
    // }else if(arr[i]+arr[j]>target){
    // j--;
    // }else{
    // i++;
    // }

    // }
    // return c;
    // }

    /* CLOSED PAIR TO TARGET */

    public static void main(String[] args) {
        int arr1[] = { 1, 4, 5, 7 };
        int arr2[] = { 10, 20, 30, 40 };
        int length1 = arr1.length;
        int length2 = arr2.length;
        int x = 26;
        int diff = Integer.MAX_VALUE;
        int i = 0, j = length2 - 1;
        int resArr1 = 0, resArr2 = 0;

        while (i < length1 && j >= 0) {
            if (Math.abs(arr1[i] + arr2[j] - x) < diff) {
                resArr1 = i;
                resArr2 = j;
                diff = Math.abs(arr1[i] + arr2[j] - x);

            }
            if (arr1[i] + arr2[j] > x) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println(arr1[resArr1] + " and " + arr2[resArr2]);

    }
}
