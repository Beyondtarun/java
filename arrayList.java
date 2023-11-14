import java.util.ArrayList;
import java.util.Scanner;
public  class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> list = new ArrayList<String>();
        System.out.println("Enter List Size:");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int i=0;
            System.out.println("Enter List:");
            while(i<a){
                // String element = new String();
                // String element =  new String();
                // element = sc.next();
                int element ;
                element = sc.nextInt();
                list.add(element);
                i++;
            }
        }
        System.out.println("List is:");
        for(int element:list){
           System.out.print(element+" ");
        }
    }
}
