public class Board {

    String[][] ticTacToeBoard = { {"", "", ""}, {"", "", ""}, {"", "", ""}  };

    public void printBoard() {
        System.out.println();
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(ticTacToeBoard[y][x]);
                if ( y < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if ( x  < 2) {
                System.out.println("---------------");
            }
        }
        System.out.println();
    }

    // returns true - if position not taken
    // returns false - if position taken
    public boolean mark(int x, int y, String player) {
        System.out.println("coordinates: X: " + x + " Y: " + y);
        if (ticTacToeBoard[x][y].isEmpty()) {
            ticTacToeBoard[x][y] = player;
            return true;
        } else {
            return false;
        }
    }

    public boolean checkWin() {
        System.out.println("Checking if winner (not implemented)");
        // return true if won
        // return false if not won
        // if win - Congraulation - You won
        // if tie
        return false;
    }
}
