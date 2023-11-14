import java.util.ArrayList;
import java.util.List;
public class iterateList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("taurn");
        list.add("anand");
        list.add("goyal");
        
        for(String element : list){
            System.out.println(element+" ");
        }

    }
}
