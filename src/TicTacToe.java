import java.util.Objects;
import java.util.Scanner;

public class TicTacToe {
    static String[][] board = new String[3][3];

    public static void BoardInitialize(String[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = "-";
            }
        }
    }

    public static void ShowBoard(String[][] board) {
        String[][] WholeBoard = new String[4][4];
        WholeBoard[0][0] = " ";
        WholeBoard[0][1] = "1";
        WholeBoard[0][2] = "2";
        WholeBoard[0][3] = "3";
        WholeBoard[1][0] = "1";
        WholeBoard[2][0] = "2";
        WholeBoard[3][0] = "3";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                WholeBoard[i + 1][j + 1] = board[i][j];
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(WholeBoard[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void X_Plays() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row :");
        int row = sc.nextInt();
        System.out.println("Enter column :");
        int column = sc.nextInt();
        if (!Objects.equals(board[row - 1][column - 1], "-")) {
            System.out.println("The spot is Already taken!");
            X_Plays();
        } else
            board[row - 1][column - 1] = "X";
    }

    public static void O_Plays() {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter row :");
        int row = sca.nextInt();
        System.out.println("Enter column :");
        int column = sca.nextInt();
        if (!Objects.equals(board[row - 1][column - 1], "-")) {
            System.out.println("The Spot is already taken!");
            O_Plays();
        } else
            board[row - 1][column - 1] = "O";

    }

    public static boolean X_win() {
        if ((Objects.equals(board[0][0], "X") && Objects.equals(board[0][1], "X") && Objects.equals(board[0][2], "X"))
                || (Objects.equals(board[1][0], "X") && Objects.equals(board[1][1], "X") && Objects.equals(board[1][2], "X"))
                || (Objects.equals(board[2][0], "X") && Objects.equals(board[2][1], "X") && Objects.equals(board[2][2], "X"))
        )
            return true;
        if ((Objects.equals(board[0][0], "X") && Objects.equals(board[1][0], "X") && Objects.equals(board[2][0], "X"))
                || (Objects.equals(board[0][1], "X") && Objects.equals(board[1][1], "X") && Objects.equals(board[2][1], "X"))
                || (Objects.equals(board[0][2], "X") && Objects.equals(board[1][2], "X") && Objects.equals(board[2][2], "X"))
        )
            return true;
        if ((Objects.equals(board[0][0], "X") && Objects.equals(board[1][1], "X") && Objects.equals(board[2][2], "X"))
                || (Objects.equals(board[2][0], "X") && Objects.equals(board[1][1], "X") && Objects.equals(board[0][2], "X")))
            return true;
        return false;
    }


    public static boolean O_win() {
        if ((Objects.equals(board[0][0], "O") && Objects.equals(board[0][1], "O") && Objects.equals(board[0][2], "O"))
                || (Objects.equals(board[1][0], "O") && Objects.equals(board[1][1], "O") && Objects.equals(board[1][2], "O"))
                || (Objects.equals(board[2][0], "O") && Objects.equals(board[2][1], "O") && Objects.equals(board[2][2], "O"))
        )
            return true;
        if ((Objects.equals(board[0][0], "O") && Objects.equals(board[1][0], "O") && Objects.equals(board[2][0], "O"))
                || (Objects.equals(board[0][1], "O") && Objects.equals(board[1][1], "O") && Objects.equals(board[2][1], "O"))
                || (Objects.equals(board[0][2], "O") && Objects.equals(board[1][2], "O") && Objects.equals(board[2][2], "O"))
        )
            return true;
        if ((Objects.equals(board[0][0], "O") && Objects.equals(board[1][1], "O") && Objects.equals(board[2][2], "O"))
                || (Objects.equals(board[2][0], "O") && Objects.equals(board[1][1], "O") && Objects.equals(board[0][2], "O")))
            return true;
        return false;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BoardInitialize(board);
        ShowBoard(board);
        System.out.println("X plays");
        X_Plays();
        ShowBoard(board);
        System.out.println("O plays");
        O_Plays();
        ShowBoard(board);
        System.out.println("X plays");
        X_Plays();
        ShowBoard(board);
        System.out.println("O plays");
        O_Plays();
        ShowBoard(board);
        System.out.println("X plays");
        X_Plays();
        ShowBoard(board);
        if (X_win()) {
            System.out.println("X wins!");
            return;
        }
        System.out.println("O plays");
        O_Plays();
        ShowBoard(board);
        if (O_win()) {
            System.out.println("O wins!");
            return;
        }
        System.out.println("X plays");
        X_Plays();
        ShowBoard(board);
        if (X_win()) {
            System.out.println("X wins!");
            return;
        }
        System.out.println("O plays");
        O_Plays();
        ShowBoard(board);
        if (O_win()) {
            System.out.println("O wins!");
            return;
        }
        System.out.println("X plays");
        X_Plays();
        ShowBoard(board);
        if (X_win()) {
            System.out.println("X wins!");
            return;
        }
        System.out.println("Draw!");

    }
}