import array.*;

import java.util.Arrays;
import java.util.List;

class Tester{
    public static void main(String[] args){
        int[] a = {1, 3,2,2,3, 4};
        BeautifulArrangementII testInstance = new BeautifulArrangementII();
        Object ans = testInstance.constructArray(5,1);
        // System.out.println(ans.toString());
       if(ans instanceof int[][])
           System.out.println(Arrays.deepToString((int[][])ans));
       else if(ans instanceof int[])
           System.out.println(Arrays.toString((int[])ans));
       else if(ans instanceof Integer)
           System.out.println(ans);
       else System.out.println("ans wrong");
    }
}