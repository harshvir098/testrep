import java.util.Scanner;

public class TicTacToe {

    static String[] board = {" ", " ", " ", " ", " ", " ", " ", " ", " "};  // 3x3 board
    static String currentPlayer = "O";  // Human player starts as "O"

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayBoard();
            if (currentPlayer.equals("O")) {
                humanMove(scanner);  // Human player move
            } else {
                juegaPlayer1();  // Computer (Player 1) move
            }

            // Check if the game is over after each move
            if (evaluateWin(board, currentPlayer)) {
                displayBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }

            if (isBoardFull()) {
                displayBoard();
                System.out.println("It's a tie!");
                break;
            }

            // Switch player
            currentPlayer = (currentPlayer.equals("O")) ? "X" : "O";
        }

        scanner.close();
    }

    // Player 1 (Computer) makes a move
    public static void juegaPlayer1() {
        int move = getComputerMove();
        board[move] = "X";
        System.out.println("Computer moves to position " + move);
    }

    // Method to determine the computer's move
    public static int getComputerMove() {
        // 1. Check if computer can win
        for (int i = 0; i < 9; i++) {
            String[] copyBoard = board.clone();
            if (copyBoard[i].equals(" ")) {
                copyBoard[i] = "X";
                if (evaluateWin(copyBoard, "X")) {
                    return i;  // If the computer can win, return the winning move
                }
            }
        }

        // 2. Check if the human can win and block them
        for (int i = 0; i < 9; i++) {
            String[] copyBoard = board.clone();
            if (copyBoard[i].equals(" ")) {
                copyBoard[i] = "O";
                if (evaluateWin(copyBoard, "O")) {
                    return i;  // If the human can win, block the move
                }
            }
        }

        // 3. Check if any corner is free
        int[] corners = {0, 2, 6, 8};
        for (int corner : corners) {
            if (board[corner].equals(" ")) {
                return corner;  // Move to any free corner
            }
        }

        // 4. Check if the center is free
        if (board[4].equals(" ")) {
            return 4;  // Move to the center
        }

        // 5. Move to any remaining free square
        for (int i = 0; i < 9; i++) {
            if (board[i].equals(" ")) {
                return i;
            }
        }

        return -1;  // No move available (shouldn't happen in a valid game)
    }

    // Method for the human player to make a move
    public static void humanMove(Scanner scanner) {
        int move;
        while (true) {
            System.out.print("Enter your move (0-8): ");
            move = scanner.nextInt();
            if (move >= 0 && move < 9 && board[move].equals(" ")) {
                board[move] = "O";
                break;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    // Method to evaluate if a player has won the game
    public static boolean evaluateWin(String[] board, String player) {
        int[][] winConditions = {
                {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // Rows
                {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // Columns
                {0, 4, 8}, {2, 4, 6}             // Diagonals
        };

        for (int[] condition : winConditions) {
            if (board[condition[0]].equals(player) &&
                    board[condition[1]].equals(player) &&
                    board[condition[2]].equals(player)) {
                return true;
            }
        }

        return false;
    }

    // Check if the board is full (for a tie)
    public static boolean isBoardFull() {
        for (String s : board) {
            if (s.equals(" ")) {
                return false;
            }
        }
        return true;
    }

    // Display the current state of the board
    public static void displayBoard() {
        System.out.println(board[0] + "|" + board[1] + "|" + board[2]);
        System.out.println("-+-+-");
        System.out.println(board[3] + "|" + board[4] + "|" + board[5]);
        System.out.println("-+-+-");
        System.out.println(board[6] + "|" + board[7] + "|" + board[8]);
    }
}
