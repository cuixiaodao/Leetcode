import java.lang.reflect.Array;
import java.util.*;

public class Sol {
     public static void main(String[] args){

         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();

         String s;
         while (sc.hasNext()){
             s = sc.next();
             System.out.println(getDeleteN(s));
         }
         Locale t = new Locale("cn", "ZH");

//         ArrayList arr = new ArrayList<Integer>();
//         for(int i=0; i<N; i++)
//             arr.add(sc.nextInt());
//
//         System.out.println(getMoveCnt(arr));

     }

    private static int getDeleteN(String s){
         String s2 = s;
         int lenS = s.length();
         int[][] rec = new int[lenS][lenS];
    }
}