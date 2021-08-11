// https://leetcode-cn.com/problems/minimum-path-sum/submissions/
class Solution {
    
    public int minPathSum(int[][] grid) {
        int[][] pathSum = new int[grid.length][grid[0].length];

        pathSum[grid.length-1][grid[0].length-1] = grid[grid.length-1][grid[0].length-1];
        for(int i = grid.length - 2; i >= 0; i--) {
            pathSum[i][grid[0].length-1] = pathSum[i+1][grid[0].length-1] + grid[i][grid[0].length-1];
        }

        for(int j = grid[0].length - 2; j >= 0; j--) {
            pathSum[grid.length-1][j] = pathSum[grid.length-1][j+1] + grid[grid.length-1][j];
        }

        for (int i = grid.length - 2; i >= 0; i--) {
            for(int j = grid[0].length - 2; j >= 0; j--) {              
                pathSum[i][j] = grid[i][j] + Math.min(pathSum[i+1][j], pathSum[i][j+1]);
            }
        }
        // for(int[] row : pathSum) {
        //     System.out.println(Arrays.toString(row));
        // }
        
        return pathSum[0][0];
    }
}
