import java.util.HashMap;
import java.util.Map;

public class MajorityElement{
    public static void main(String args[]){
        int a[]={1,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
          if(map.containsKey(a[i])){
            map.put(a[i],map.get(a[i])+1);
          }
          else{
            map.put(a[i],1);
          }
        }
       for( int key : map.keySet()){
        if(map.get(key)>=a.length/2){
            System.out.println(key);
        }
       }
    }
}