import array.*;
import hashTable.*;

import java.util.Arrays;
import java.util.List;

class Tester{
    public static void main(String[] args){
      int[] a = {1,3,5,8,7,1,3,5,8};
        // int[][] a = {{0,1,0,0},
        //            {1,1,1,0},
        //            {0,1,0,0},                  
        //            {1,1,0,0}};
        SingleNumber testInstance = new SingleNumber();
        Object ans = testInstance.singleNumber(a);

        if(ans instanceof int[][])
          System.out.println(Arrays.deepToString((int[][])ans));
        else if(ans instanceof int[])
          System.out.println(Arrays.toString((int[])ans));
        else if(ans instanceof Integer)
          System.out.println(ans);
        else System.out.println("ans wrong");
    }
}