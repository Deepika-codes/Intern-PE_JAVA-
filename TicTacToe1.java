import java.util.Scanner;

public class TicTacToe1 {

    private char[][] board;
    private char currentPlayer;

    public TicTacToe1() {
        board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
        currentPlayer = 'X';
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayBoard();
            System.out.println("Player " + currentPlayer + ", enter your move (row and column separated by a space):");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            if (board[row - 1][col - 1] == '-') {
                board[row - 1][col - 1] = currentPlayer;
                if (checkWin(currentPlayer, row - 1, col - 1)) {
                    displayBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    return;
                }
                currentPlayer = (currentPlayer == 'X')? 'O' : 'X';
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    private void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private boolean checkWin(char player, int row, int col) {
        return (checkRow(player, row) || checkColumn(player, col) || checkDiagonal(player));
    }

    private boolean checkRow(char player, int row) {
        return (board[row][0] == player && board[row][1] == player && board[row][2] == player);
    }

    private boolean checkColumn(char player, int col) {
        return (board[0][col] == player && board[1][col] == player && board[2][col] == player);
    }

    private boolean checkDiagonal(char player) {
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
               (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    public static void main(String[] args) {
        TicTacToe1 game = new TicTacToe1();
        game.play();
    }
}