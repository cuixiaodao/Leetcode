import array.*;
import hashTable.*;

import java.util.Arrays;
import java.util.List;


class Tester{
    public static void main(String[] args){
      int[] s = {1,3,5,8,2,1,3,5,8};
      int[] t = {};

      ValidAnagram testInstance = new ValidAnagram();
        Object ans = testInstance.isAnagram("rat",  "car");

        if(ans instanceof int[][])
          System.out.println(Arrays.deepToString((int[][])ans));
        else if(ans instanceof int[])
          System.out.println(Arrays.toString((int[])ans));
        else if(ans instanceof Integer)
          System.out.println(ans);
        else System.out.println(ans);
    }
}