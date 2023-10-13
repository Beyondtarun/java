import java.lang.*;


public class stringpractice extends Exception {

    public static void main(String[] args) {
         String str= "hello";
        //  String str1="hello";
        String str1 = new String("aello");
        String str2 = null;
        String str3 = null;
        try{
           System.out.println(str1.compareTo(str3));

        }
        catch (Exception e){
         System.out.println("exception");
        }
        
        //  System.out.println(str == str1);
        // System.out.println(str.equals(str1) );
        System.out.println(str.compareTo(str1));
// /         System.out.println(str.indexOf("h"));
//         System.out.println(str1.length());
//     System.out.println(str1==str);
//     System.out.println(str.compareToIgnoreCase(str1));
//           System.out.println(str.toUpperCase());
//           String str2=str.toUpperCase();
//           System.out.println(str2.toLowerCase());
// System.out.println(str.trim());
// System.out.println(str.replaceAll("h","t"));
//     System.out.println(str.charAt(4));
// System.out.println(str.contains("e"));

// String a= "5";
// String b= "10";
// System.out.println(Integer.parseInt(a)+Integer.parseInt(b));
//     }
    }
}
