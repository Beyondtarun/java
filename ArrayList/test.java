import java.util.ArrayList;

public class test {

    test(){
        System.err.println("contrcutr");
    }
    static{
        System.err.println("blovk");
    }
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>(3);
        System.err.println("main");
        // new test();

        // new test();
    }
}
