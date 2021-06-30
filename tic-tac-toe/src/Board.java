import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

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
        // vertical
        // 0,0 | 0, 1  | 0, 2
        // 1,0 | 1, 1 | 1, 2
        // 2,0 | 2, 1 | 2, 2

        // check win vertical
        for (int y = 0; y < ticTacToeBoard.length; y++) {
            String values = "";
            for (int x = 0; x < ticTacToeBoard.length; x++) {
                values += ticTacToeBoard[y][x];
            }
            if (values.equals("XXX") || values.equals("OOO")) {
                return true;
            }
        }

        // horizontal
        // 0,0 | 1,0 | 2,0
        // 0,1 | 1,1 | 2,1
        // 0,2 | 1,2 | 2,2

        // check win horizontal
        for (int y = 0; y < ticTacToeBoard.length; y++) {
            String values = "";
            for (int x = 0; x < ticTacToeBoard.length; x++) {
                values += ticTacToeBoard[x][y];
            }
            if (values.equals("XXX") || values.equals("OOO")) {
                return true;
            }
        }

        // diagonal
        // 0,0 | 1,1 | 2,2
        // 0,2 | 1,1 | 2,0

        // check win diagonal left to right
        String topLeftToRightDiagonalValue = "";
        for (int pos = 0; pos < 3; pos++) {
            topLeftToRightDiagonalValue += ticTacToeBoard[pos][pos];
        }
        if (topLeftToRightDiagonalValue.equals("XXX")) {
            return true;
        }

        String topRightToLeftDiagonalValue = "";
        int opposite = 2;
        for (int pos = 0; pos < 3; pos++) {
            topRightToLeftDiagonalValue += ticTacToeBoard[pos][opposite];
            opposite--;
        }
        if (topRightToLeftDiagonalValue.equals("XXX") || topRightToLeftDiagonalValue.equals("OOO")) {
            return true;
        }

        return false;
    }
}
