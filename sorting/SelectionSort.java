package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7,5,2,3,4,8};
        for(int i =0; i<arr.length-1;i++){
            int min = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[min]<arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;


        }
        for(int e : arr){
            System.out.println(e);
        }
    }
}
