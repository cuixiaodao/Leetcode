class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        char[] arr = word.toCharArray();

        for(int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (check(board, visited, arr, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean check(char[][] board, boolean[][] visited, char[] word, int i, int j, int k) {
        if (k > word.length - 1) {
            return true;
        }
        if (i > board.length - 1 || i < 0 || j > board[0].length - 1 || j < 0) {
            return false;
        }
        if (visited[i][j] || board[i][j] != word[k]) {
            return false;
        }
        visited[i][j] = true;
        if (check(board, visited, word, i+1, j, k+1)) {
            return true;
        }
        if (check(board, visited, word, i, j+1, k+1)) {
            return true;
        }
        if (check(board, visited, word, i-1, j, k+1)) {
            return true;
        }
        if (check(board, visited, word, i, j-1, k+1)) {
            return true;
        }      
        visited[i][j] = false;
        return false;  
    }
}
