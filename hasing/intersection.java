import java.util.HashSet;
public class intersection{
    public static void main(String args[]){
        int a[]={1,3,4,5};
        int b[]={2,5,6,7};
        intersection(a,b);
    }
    static void intersection(int a[],int b[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            if(set.contains(b[i])){
                System.out.println(b[i]);
            }
        }
    }
}