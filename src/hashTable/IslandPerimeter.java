package hashTable;

/**
 * Created by cuixiaodao on 11/04/2017
 * for leetCode problem:
 * https://leetcode.com/problems/island-perimeter/description/
 */

public class IslandPerimeter{
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for(int i=0; i<grid.length; i++)
            for(int j=0; j<grid[0].length; j++){
                int per = 4;
                if(grid[i][j] == 1){
                    if(i>0 && grid[i-1][j] == 1) per -= 1;
                    if(i<grid.length-1 && grid[i+1][j] == 1) per -= 1;
                    if(j>0 && grid[i][j-1] == 1) per -= 1;
                    if(j<grid[0].length-1 && grid[i][j+1] == 1) per -= 1;

                    perimeter += per;
                }
            }
        
        return perimeter;
    }    
}