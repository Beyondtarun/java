import java.util.ArrayList;
import java.util.List;

public class elementAtFirstPosition {
    // public static void main(String[] args) {
    //     List<Integer> list = new ArrayList<Integer>();
    //     list.add(1);
    //     list.add(1);
    //     list.add(1);
    //     list.add(1);

    //     System.err.println(list);
    //     list.add(0,2);
    // System.err.println(list);
    //    }
    public static void main(String[] args) {
        elementAtFirstPosition obj = new elementAtFirstPosition();
        obj.addElement();
        obj.list.add(0,2);
        System.err.println(obj.list);
    }
    ArrayList<Integer> list = new ArrayList<>();

    public void addElement(){
        
        list.add(1);
        list.add(2);
    }




}
