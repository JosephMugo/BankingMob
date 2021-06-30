import java.lang.reflect.Array;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    /*
    ------------------------------------------------------------
    Tic Tac Toe
    ------------------------------------------------------------
    While (not winner)
        Pick X or O (player 1):
        X
        (Show Board)
        Pick X or O (player 2):
        X
        (Show Board)
    Type exit or play again?
     */
    public static void main(String[] args) {

        while (true) {

            Board board = new Board();

            boolean hasNotWon = true;
            // start with player one X
            // then switch back and forth with player O
            String player = "X";

            Scanner reader = new Scanner(System.in);
            // repeat while no one has won

            System.out.println("----------------------------");
            System.out.println("        Tic Tac Toe         ");
            System.out.println("----------------------------");

            int amountPicked = 0;

            while (hasNotWon) {
                int xCoordinate = 0;
                int yCoordinate = 0;
                // O

                String playerName = "";

                if (player.equals("X")) {
                    playerName = "Player 1";
                }

                if (player.equals("O")) {
                    playerName = "Player 2";
                }

                boolean notValidCoordinates = true;
                while (notValidCoordinates) {
                    // x position
                    // equal to 0 or greater and less than 3
                    boolean notCorrect = true;
                    while (notCorrect) {
                        System.out.println("Pick x position " + "(" + playerName + ")");
                        xCoordinate = Integer.parseInt(reader.nextLine());
                        if (xCoordinate >= 0 && xCoordinate <= 2) {
                            notCorrect = false;
                        } else {
                            System.out.println("Incorrect input pick valid response");
                        }
                    }

                    // y position
                    // equal to 0 or greater and less than 3
                    boolean notCorrectPlayerOneY = true;
                    while (notCorrectPlayerOneY) {
                        System.out.println("Pick y position "+ "(" + playerName + ")");
                        yCoordinate = Integer.parseInt(reader.nextLine());
                        if (yCoordinate >= 0 && yCoordinate <= 2) {
                            notCorrectPlayerOneY = false;
                        } else {
                            System.out.println("Incorrect input pick valid response");
                        }
                    }

                    // mark board
                    boolean marked = board.mark(xCoordinate, yCoordinate, player);
                    if (marked) {
                        notValidCoordinates = false;
                    } else {
                        System.out.println();
                        System.out.println("---------------------------");
                        System.out.println("Position taken!");
                        System.out.println("Try other coordinates");
                        System.out.println("---------------------------");
                        System.out.println();
                    }
                }

                // Show Board
                board.printBoard();

                // Check Win
                boolean hasWon = board.checkWin();
                if (hasWon) {
                    // say player has won
                    hasNotWon = false;
                }

                // if no one won then switch users
                if (hasNotWon) {
                    if (player.equals("X")) {
                        player = "O";
                    } else {
                        player = "X";
                    }
                    amountPicked++;
                    if (amountPicked == 9)  {
                        player = "DRAW!!!!!";
                        break;
                    }
                }
            }
            if (player.equals("X")) {
                System.out.println("-----------------");
                System.out.println("Player 1 won!!!!!");
                System.out.println("-----------------");
            } else if(player.equals("O")) {
                System.out.println("-----------------");
                System.out.println("Player 2 won!!!!!");
                System.out.println("-----------------");
            } else {
                System.out.println("-----------------");
                System.out.println("       Draw      ");
                System.out.println("-----------------");
            }

            System.out.print("Do you want to play again (Y or N)?: ");
            String playAgainOption = reader.nextLine().toLowerCase();
            if (playAgainOption.equals("y")) {
                // play again
                continue;
            }
            if (playAgainOption.equals("n")) {
                break;
            }
        }
    }
}
