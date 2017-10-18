package array;

/**
 * Created by cuixiaodao on 10/15/017
 * for leetCode problem:
 * https://leetcode.com/problems/array-partition-i/description/
 */

public class MaxAreaofIsland{
    int[][] grid;
    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;
        int maxArea = 0;

        for(int r=0; r<grid.length; r++)
            for(int c=0; c<grid[0].length; c++)                
                maxArea = Math.max(maxArea, areaDfs(r, c));
      
        return maxArea;
    }
    
    private int areaDfs(int r, int c){
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length
            || grid[r][c] == 0)
            return 0;
        else{
            grid[r][c] = 0;
            return 1+areaDfs(r, c-1)+areaDfs(r-1, c)+
                areaDfs(r, c+1)+areaDfs(r+1, c);
        }            
    }
}