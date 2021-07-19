import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) { 
        String str = new String("abc");
        String a = str;
        String b = "abc";
        String c = "abcd";
        String d = b + "d";
        String e = "abc" + "d";
        // change(str,ch);
        System.out.printf("a == str : %b, b == str : %b, a == b : %b", a == str, b == str, a == b);
        System.out.println();
        System.out.printf("c == d : %b, c == e : %b, d == e : %b", c == d, c == e, e == e);
        System.out.print(str+" ");
        // System.out.print(ch);
    }

        public static void change(String str,char[] ch){
            str = "gbc";
            ch[0] = 'g';
        }

}