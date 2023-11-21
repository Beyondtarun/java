package hasing;
import java.util.HashMap;
import java.util.Arrays;
public class twosum {
    public static void main(String[] args) {
        int a[]={2,4,6,9,7};
        int target =20;
        int result[] = Search(a,target, a.length);
        
        for(int i :result){
            System.out.println(i);
        }
    }
     static int[] Search(int b[],int target, int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        int c[] = new int[2];
        for(int i =0 ; i<n;i++){
            int num = b[i];
            int need = target - num;
            if(map.containsKey(need)){
                
                c[0]=i;
                c[1]= map.get(need);
                Arrays.sort(c);
                return c;
            }
            else{
                map.put(num, i);
            }
        }
return c;
    }
}
