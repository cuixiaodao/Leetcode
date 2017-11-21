import array.*;
import hashTable.*;

import java.util.Arrays;
import java.util.List;


class Tester{
    public static void main(String[] args){
      String[] s = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
      String[] t = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};

      LongestWord testInstance = new LongestWord();
      Object ans = testInstance.longestWord(s);

//      System.out.println(Arrays.toString((String [])ans));
      if(ans instanceof int[][])
        System.out.println(Arrays.deepToString((int[][])ans));
      else if(ans instanceof int[])
        System.out.println(Arrays.toString((int[])ans));
      else if(ans instanceof Integer)
        System.out.println(ans);
      else System.out.println(ans);
    }
}