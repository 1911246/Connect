public class Board {
    private int[][] grid;
    private final int ROWS = 6;
    private final int COLUMNS = 7;
    private int p;
    
    public Board() {
        grid = new int[ROWS][COLUMNS];
        for(int r = 0; r<ROWS; r++) {
        	for(int c = 0; c<COLUMNS;c++) {
        		grid[r][c] = 0;
        	}
        }  
    } //code

    public boolean placeChip(int col, int player) {
    	p = player;
    	for (int row = ROWS - 1; row >= 0; row--) {
            if (grid[row][col] == 0) {
                grid[row][col] = player;
                return true;
            }
        }
        return false;
    }

    public boolean checkForWin(int player) {
        // Check horizontal, vertical, and diagonal (both directions)
        return checkHorizontal(player) || checkVertical(player) || checkDiagonal(player);
    }

    private boolean checkHorizontal(int player) {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS - 3; col++) {
                if (grid[row][col] == player && grid[row][col + 1] == player &&
                    grid[row][col + 2] == player && grid[row][col + 3] == player) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkVertical(int player) {
        for (int row = 0; row < ROWS - 3; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                if (grid[row][col] == player && grid[row + 1][col] == player &&
                    grid[row + 2][col] == player && grid[row + 3][col] == player) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkDiagonal(int player) {
        // Check ascending diagonal (\)
        for (int row = 3; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS - 3; col++) {
                if (grid[row][col] == player && grid[row - 1][col + 1] == player &&
                    grid[row - 2][col + 2] == player && grid[row - 3][col + 3] == player) {
                    return true;
                }
            }
        }
        // Check descending diagonal (/)
        for (int row = 0; row < ROWS - 3; row++) {
            for (int col = 0; col < COLUMNS - 3; col++) {
                if (grid[row][col] == player && grid[row + 1][col + 1] == player &&
                    grid[row + 2][col + 2] == player && grid[row + 3][col + 3] == player) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean reset() {
    	for(int row = 0; row<6;row++) {
    		for(int col = 0; col<6;col++) {
        		if(grid[row][col]!= p) {
        			return false;
        		}
        	}
    	}
    	return true;
    }
    
}
