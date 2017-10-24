import array.*;

import java.util.Arrays;

class Tester{
    public static void main(String[] args){
        int[] a = {1,3,5,6};
        SearchInsertPosition testInstance = new SearchInsertPosition();
        Object ans = testInstance.searchInsert(a,0);

        if(ans instanceof int[][])
            System.out.println(Arrays.deepToString((int[][])ans));
        else if(ans instanceof int[])
            System.out.println(Arrays.toString((int[])ans));
        else if(ans instanceof Integer)
            System.out.println(ans);
        else System.out.println("ans wrong");
    }
}