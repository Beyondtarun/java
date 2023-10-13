import java.util.*;


public class MethodPractice {
    
    static int Max(int a, int b){
        if(a>b)
        return a;
        else
        return b;
    }

    
    public static void main(String[] args) {
    int a=10,b=20,c;
    c=Max(a,b);
    System.out.println("bigger number is:"+c);    
    }
}
