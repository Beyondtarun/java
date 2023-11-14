import java.util.ArrayList;
import java.util.List;

public class elementAtFirstPosition {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        System.err.println(list);
        list.add(0,2);
    System.err.println(list);
       }




}
