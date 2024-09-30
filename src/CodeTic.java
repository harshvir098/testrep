import java.util.Scanner;

public class CodeTic {
    static String[] board = {" ", " ", " ", " ", " ", " ", " ", " ", " "};

    public static void main(String[] args) {
        CodeTic c = new CodeTic();

        c.displayBoard();

    }

    public void displayBoard() {

        System.out.println(board[0] + "|" + board[1] + "|" + board[2]);
        System.out.println("-+-+-");
        System.out.println(board[3] + "|" + board[4] + "|" + board[5]);
        System.out.println("-+-+-");
        System.out.println(board[5] + "|" + board[7] + "|" + board[8]);
    }

    public void makePlayerMove(Scanner scanner) {


        while (true) {
            System.out.println("Enter move(0-8)");

            try {
                int move = scanner.nextInt();
                if (move >= 0 && move < 9 && board[move] == " ") {
                    board[move] = "O";
                } else {
                }
                System.out.println("invalid move: try again");
            } catch (Exception e){
                System.out.println("enter valid move");
            }

        }
    }

public void  secondPlayer(String[] board){

}

public void getCompMove(String[] board) {

    for (int i = 0; i < board.length; i++) {
        if (board[i].equals(" ")) {
        }


    }

}

}
