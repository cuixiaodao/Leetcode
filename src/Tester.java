import array.*;

import java.util.Arrays;

class Tester{
    public static void main(String[] args){
        int[] a = {1,2,2,3,1,4,2};

        DegreeOfArray testInstance = new DegreeOfArray();
        System.out.println(testInstance.findShortestSubArray(a));
    }
}