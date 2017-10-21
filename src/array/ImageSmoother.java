package array;

/**
 * Created by cuixiaodao on 10/15/017
 * for leetCode problem:
 * https://leetcode.com/problems/image-smoother/description/
 */

public class ImageSmoother {
    public int[][] imageSmoother(int[][] M) {
        int r = M.length, c = M[0].length;
        int[][] out = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                out[i][j] = smooth(M, i, j);

        return out;
    }

    private int smooth(int[][] M, int row, int col) {
        int s = 0, cnt = 0;
        for (int i = row - 1; i < row + 2; i++)
            if (i < 0 || i > M.length - 1) continue;
            else {
                for (int j = col - 1; j < col + 2; j++)
                    if (j < 0 || j > M[0].length - 1) continue;
                    else {
                        s += M[i][j];
                        cnt += 1;
                    }
            }
        return s / cnt;
    }
}