import array.*;

import java.util.Arrays;

class Tester{
    public static void main(String[] args){
        int[][] a = {{1,1,1},{1,0,1},{1,1,1}};
        ImageSmoother testInstance = new ImageSmoother();
        Object ans = testInstance.imageSmoother(a);

        if(ans instanceof int[][])
            System.out.println(Arrays.deepToString((int[][])ans));
        else if(ans instanceof int[])
            System.out.println(Arrays.toString((int[])ans));
        else if(ans instanceof Integer)
            System.out.println(ans);
        else System.out.println("ans wrong");
    }
}