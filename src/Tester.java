import array.*;
import hashTable.*;

import java.util.Arrays;
import java.util.List;


class Tester{
    public static void main(String[] args){
      String[] s = {"Shogun","Tapioca Express","Burger King","Piatti","KFC"};
      String[] t = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};

      LongestPalindrome testInstance = new LongestPalindrome();
      Object ans = testInstance.longestPalindrome("ccccdd");

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