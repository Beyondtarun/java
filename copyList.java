import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class copyList {
    public static void main(String[] args) {
        List<String> List1 = new ArrayList<String>();
        List1.add("1");
        List1.add("2");
        List1.add("3");
        List1.add("4");
        System.out.println("List1: " + List1);
        List<String> List2 = new ArrayList<String>();
        List2.add("A");
        List2.add("B");
        List2.add("C");
        List2.add("D");
        System.out.println("List2: " + List2);

        // for(int i=0; i<List2.size();i++){
        // List1.set(i,List2.get(i));
        // }
        // copy list2 into list 1;
        Collections.copy(List1, List2);
        System.err.println("List1: " + List1);
        System.err.println("List2: " + List2);

    }
}
