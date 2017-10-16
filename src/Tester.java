import array.*;

import java.util.Arrays;

public class Tester{
    public static void main(String[] args){

        System.out.println(3/2);
        int[][] a = {{3,2,7,8,4,2}};

        ReshapetheMatrix testInstance = new ReshapetheMatrix();
        System.out.println(Arrays.deepToString(testInstance.matrixReshape(a,2,3)));
    }
}