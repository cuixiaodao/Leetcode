import array.*;
import hashTable.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Tester{
    public static void main(String[] args){
      // String[] s = {"root/a 1.txt(abcd) 2.txt(efsfgh)","root/c 3.txt(abdfcd)","root/c/d 4.txt(efggdfh)"};
      // String[] t = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
      String s = "tree";
      TopKFreq testInstance = new TopKFreq();
      Object ans = testInstance.topKFrequent(new int[]{1,1,2,2,3,3,4}, 2);

//     System.out.println(Arrays.toString((String [])ans));
      if(ans instanceof int[][])
        System.out.println(Arrays.deepToString((int[][])ans));
      else if(ans instanceof int[])
        System.out.println(Arrays.toString((int[])ans));
      else if(ans instanceof Integer)
        System.out.println(ans);
      else System.out.println(ans);
    }
}