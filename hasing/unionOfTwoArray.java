import java.util.HashSet;

public class unionOfTwoArray{
    public static void main(String args[]){
        int a[]={1,3,4,5};
        int b[]={2,5,6,7};
        union(a,b);
    }
static void union(int a[],int b[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0,j=0;i<a.length || j<b.length; i++,j++){
            set.add(a[i]);
            set.add(b[j]);
        }
        for(int i:set){
        System.out.println(i);
        }
        System.out.println("Size of Set is: "+set.size());
    }
}