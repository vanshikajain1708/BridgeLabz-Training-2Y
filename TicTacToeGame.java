import java.util.Scanner;

public class TicTacToeGame {
    private char[] board;

    public TicTacToeGame() {
        board = new char[10];
        createboard();
    }
    public void createboard(){
        Scanner.fill(board, ' ');
        board[0] = '#';
    }
    public void displayBoard(){
        System.out.println(" " + board[1]+ " | " + board[2]+ " | " + board[3]);
        System.out.println("---+---+---");
        System.out.println(" " + board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("---+---+---");
        System.out.println(" " + board[7] + " | " + board[8] + " | " + board[9]);
    }

    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        System.out.println("New Tic Tac Toe Board Created:");
        game.displayBoard();
    }
}


