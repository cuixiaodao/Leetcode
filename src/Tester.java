import hashTable.FourSumII;

import java.util.Arrays;


class Tester {
    public static void main(String[] args) {
        // String[] s = {"root/a 1.txt(abcd) 2.txt(efsfgh)","root/c 3.txt(abdfcd)","root/c/d 4.txt(efggdfh)"};
        // String[] t = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        String s = "tree";
        FourSumII testInstance = new FourSumII();
        Object ans = testInstance.fourSumCount(new int[]{1, 2}, new int[]{-2, -1},
                new int[]{-1, 2}, new int[]{0, 2});

//     System.out.println(Arrays.toString((String [])ans));
        if (ans instanceof int[][])
            System.out.println(Arrays.deepToString((int[][]) ans));
        else if (ans instanceof int[])
            System.out.println(Arrays.toString((int[]) ans));
        else if (ans instanceof Integer)
            System.out.println(ans);
        else System.out.println(ans);
    }
}