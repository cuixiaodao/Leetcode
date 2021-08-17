package daily;

import java.util.Arrays;
// problem 576
class Solution {
    int[][] directions = new int[][] {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
    int MAX = (int) Math.pow(10, 9) + 7;

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int [][] dCur = new int[m][n];
        int [][] dNext;
        dCur[startRow][startColumn] = 1;
        int totalNum = 0;

        int nextX, nextY;
        for(int i = 0; i < maxMove; i++) {
            dNext = new int[m][n];
            for(int j = 0; j< m; j++) {
                for(int k = 0; k < n; k++) {
                    if (dCur[j][k] <= 0) {
                        continue;
                    }
                    for(int[] dir : directions) {
                        nextX = j + dir[0];
                        nextY = k + dir[1];
                        if (nextX < 0 || nextX >= m || nextY < 0 || nextY >= n) {
                            totalNum += dCur[j][k];
                            continue;
                        }
                        dNext[nextX][nextY] += dCur[j][k];
                    }
                }
            }
            dCur = dNext;
            // printArr(dCur);
        }
        return totalNum;
    }

    private void printArr(int[][] arr) {
        for(int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
