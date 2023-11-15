import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class sortList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(111);
        list.add(31);
        list.add(28);
        list.add(12);
        list.add(24);
        list.add(20);
        list.add(3);
        System.err.println(list);
        Collections.sort(list);
        System.err.println(list);
        System.err.println(list.get(2));

    }
}
