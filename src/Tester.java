import array.*;
import hashTable.KeyboardRow;

import java.util.Arrays;
import java.util.List;

class Tester{
    public static void main(String[] args){
        int[] a = {1,2,4,3,2};
        KeyboardRow testInstance = new KeyboardRow();
        String[] ans = testInstance.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
        for (String s : ans){
            System.out.println(s);
        }
        //  System.out.println(ans.toString());
//      if(ans instanceof int[][])
//          System.out.println(Arrays.deepToString((int[][])ans));
//      else if(ans instanceof int[])
//          System.out.println(Arrays.toString((int[])ans));
//      else if(ans instanceof Integer)
//          System.out.println(ans);
//      else System.out.println("ans wrong");
    }
}