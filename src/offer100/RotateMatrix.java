class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length - 1;
        int mid = matrix.length / 2;

        int temp1, temp2, temp3;
        // 坐标变化(x, y) -> (y, -x)
        // 注意： 避免重复， 转1/4

        printAll(matrix);
        for (int i = 0; i < mid +  matrix.length % 2; i++) {
            for(int j = 0; j < mid; j++) {
                temp1 = matrix[j][n - i];
                temp2 = matrix[n - i][n - j];
                temp3 = matrix[n -j][i];

                matrix[j][n - i] = matrix[i][j];                
                matrix[n - i][n - j] = temp1;
                matrix[n -j][i] = temp2;
                matrix[i][j] = temp3;
            }
        }

        // printAll(matrix);
        return;
    }

    private void printAll(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        return;
    }
}
