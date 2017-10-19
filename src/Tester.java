import array.*;

import java.util.Arrays;

class Tester{
    public static void main(String[] args){
        int[] a = {3, 0, 1, 0, 3, 12};

        MoveZeroes testInstance = new MoveZeroes();
        testInstance.moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }
}