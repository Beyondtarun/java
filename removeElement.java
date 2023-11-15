import java.util.ArrayList;
import java.util.Scanner;

import java.util.Iterator;

public class removeElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.err.println(list);
        Scanner sc = new Scanner(System.in);
        System.err.println("enter number to be searched:");
        int item = sc.nextInt();
        // Iterator<Integer> iterator =  list.iterator();
        // int flag =0;
        // while(iterator.hasNext()){
        //     if(item == iterator.next())
        // flag =1;    
        // }
        
        // if(flag ==1){
        //     System.err.println("found");
        // }
        // else{
        //     System.err.println("not found");
        // }
        if(list.contains(item))
        System.err.println("element fount");
        else{
            System.err.println("not founds");
        }
    }

}
