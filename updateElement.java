import java.util.ArrayList;

public class updateElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.err.println(list);
        list.set(1,99);
        System.err.println(list);
    }
}

