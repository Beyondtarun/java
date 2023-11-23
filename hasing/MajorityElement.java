import java.util.HashMap;
import java.util.Map;

public class MajorityElement{
    public static void main(String args[]){
        int a[]={2,1,2,3,1,2,4,1,5,2,1,1,1,1,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
          if(map.containsKey(a[i])){
            map.put(a[i],map.get(a[i])+1);
          }
          else{
            map.put(a[i],1);
          }
        }
       for( Map.Entry<Integer,Integer> entry : map.entrySet()){
        if(entry.getValue()>=a.length/2){
            System.out.println(entry.getKey()+" ");
        }
       }
    }
}