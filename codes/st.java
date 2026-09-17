public class st {
    static int count=0;
    st(){
        System.out.println("hello");
        count= 190;
      
    }
    public static void tarun(){
        System.out.println(count);
    }
    public static void main(String[] args){

        int[] a={1,2,3,4};
        int min=a[0],count=0;
        for(int i=1;i<a.length;i++){
            if(a[i]<min)
            min=a[i];
            count++;
        }
        System.out.println(count);

    }
}
