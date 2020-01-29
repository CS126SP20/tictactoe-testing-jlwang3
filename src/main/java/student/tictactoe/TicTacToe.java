package student.tictactoe;

import student.tictactoe.Evaluation;

public class TicTacToe {
    public static Evaluation evaluateBoard(String boardState) {
        // Assume the String is a reachable state for now.
        // First break String into array of Chars.
        char[] BOARD = new char[9];
        BOARD = boardState.toCharArray();
        // Define number of X and number of O;
        int numberX = 0;
        int numberO = 0;
        for (int i = 0; i < 9; i++) {
            if (BOARD[i] == 'x' || BOARD[i] == 'X') {
                numberX++;
            }
            if (BOARD[i] == 'o' || BOARD[i] == 'O') {
                numberO++;
            }
        }
        if (numberX >= numberO + 2 || numberO > numberX) {
            return Evaluation.InvalidInput;
        }
        // Check for X win by checking all rows, columns, and diagonals
        if (((BOARD[0] == 'x' || BOARD[0] == 'X') && (BOARD[1] == 'x' || BOARD[1] == 'X') && (BOARD[2] == 'x' || BOARD[2] == 'X'))
            || ((BOARD[3] == 'x' || BOARD[3] == 'X') && (BOARD[4] == 'x' || BOARD[4] == 'X') && (BOARD[5] == 'x' || BOARD[5] == 'X'))
        {

        }
        // Check for O win by checking all rows, columns, and diagonals
        if () {

        }
    // Else... No Winner
        return Evaluation.NoWinner;
    }

    // Invalid Input: Let X be number of Xs and O be number of Os. If X >= O + 2 or O > X, then the input is invalid.
    // No Winner: The Board is filled up with 5 Xs and 4 Os but there exists no three-in-a-rows.
    // X Wins:
    // O Wins:
    // Unreachable State: Save for later
}
