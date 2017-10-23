import array.*;

import java.util.Arrays;

class Tester{
    public static void main(String[] args){
        int[] a = {2,1,2,1,0,1,2};
        BestTimeBuyStock testInstance = new BestTimeBuyStock();
        Object ans = testInstance.maxProfit(a);

        if(ans instanceof int[][])
            System.out.println(Arrays.deepToString((int[][])ans));
        else if(ans instanceof int[])
            System.out.println(Arrays.toString((int[])ans));
        else if(ans instanceof Integer)
            System.out.println(ans);
        else System.out.println("ans wrong");
    }
}