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
        // 1.
        if (numberX >= numberO + 2 || numberO > numberX) {
            return Evaluation.InvalidInput;
        }
        // 2. X wins and O Wins on Board
        if ((((BOARD[0] == 'x' || BOARD[0] == 'X') && (BOARD[1] == 'x' || BOARD[1] == 'X') && (BOARD[2] == 'x' || BOARD[2] == 'X'))
                || ((BOARD[3] == 'x' || BOARD[3] == 'X') && (BOARD[4] == 'x' || BOARD[4] == 'X') && (BOARD[5] == 'x' || BOARD[5] == 'X'))
                || ((BOARD[6] == 'x' || BOARD[6] == 'X') && (BOARD[7] == 'x' || BOARD[7] == 'X') && (BOARD[8] == 'x' || BOARD[8] == 'X'))
                || ((BOARD[0] == 'x' || BOARD[0] == 'X') && (BOARD[3] == 'x' || BOARD[3] == 'X') && (BOARD[6] == 'x' || BOARD[6] == 'X'))
                || ((BOARD[1] == 'x' || BOARD[1] == 'X') && (BOARD[4] == 'x' || BOARD[4] == 'X') && (BOARD[7] == 'x' || BOARD[7] == 'X'))
                || ((BOARD[2] == 'x' || BOARD[2] == 'X') && (BOARD[5] == 'x' || BOARD[5] == 'X') && (BOARD[8] == 'x' || BOARD[8] == 'X'))

                || ((BOARD[0] == 'x' || BOARD[0] == 'X') && (BOARD[4] == 'x' || BOARD[4] == 'X') && (BOARD[8] == 'x' || BOARD[8] == 'X'))
                || ((BOARD[2] == 'x' || BOARD[2] == 'X') && (BOARD[4] == 'x' || BOARD[4] == 'X') && (BOARD[6] == 'x' || BOARD[6] == 'X')))
        && (((BOARD[0] == 'o' || BOARD[0] == 'O') && (BOARD[1] == 'o' || BOARD[1] == 'O') && (BOARD[2] == 'o' || BOARD[2] == 'O'))
                || ((BOARD[3] == 'o' || BOARD[3] == 'O') && (BOARD[4] == 'o' || BOARD[4] == 'O') && (BOARD[5] == 'o' || BOARD[5] == 'O'))
                || ((BOARD[6] == 'o' || BOARD[6] == 'O') && (BOARD[7] == 'o' || BOARD[7] == 'O') && (BOARD[8] == 'o' || BOARD[8] == 'O'))
                || ((BOARD[0] == 'o' || BOARD[0] == 'O') && (BOARD[3] == 'o' || BOARD[3] == 'O') && (BOARD[6] == 'o' || BOARD[6] == 'O'))
                || ((BOARD[1] == 'o' || BOARD[1] == 'O') && (BOARD[4] == 'o' || BOARD[4] == 'O') && (BOARD[7] == 'o' || BOARD[7] == 'O'))
                || ((BOARD[2] == 'o' || BOARD[2] == 'O') && (BOARD[5] == 'o' || BOARD[5] == 'O') && (BOARD[8] == 'o' || BOARD[8] == 'O'))

                || ((BOARD[0] == 'o' || BOARD[0] == 'O') && (BOARD[4] == 'o' || BOARD[4] == 'O') && (BOARD[8] == 'o' || BOARD[8] == 'O'))
                || ((BOARD[2] == 'o' || BOARD[2] == 'O') && (BOARD[4] == 'o' || BOARD[4] == 'O') && (BOARD[6] == 'o' || BOARD[6] == 'O'))
        ))
        {
            return Evaluation.UnreachableState;
        }
        // 2. Configurations in which X "wins twice"
        // Note: There are no such configurations for O since O has only 4 moves
        // In Order of rows, columns, and diagonals
        if (((BOARD[0] == 'x' || BOARD[0] == 'X') && (BOARD[1] == 'x' || BOARD[1] == 'X') && (BOARD[2] == 'x' || BOARD[2] == 'X') && (BOARD[3] == 'x' || BOARD[3] == 'X') && (BOARD[6] == 'x' || BOARD[6] == 'X'))
                || ((BOARD[0] == 'x' || BOARD[0] == 'X') && (BOARD[1] == 'x' || BOARD[1] == 'X') && (BOARD[2] == 'x' || BOARD[2] == 'X') && (BOARD[4] == 'x' || BOARD[4] == 'X') && (BOARD[7] == 'x' || BOARD[7] == 'X'))
                || ((BOARD[0] == 'x' || BOARD[0] == 'X') && (BOARD[1] == 'x' || BOARD[1] == 'X') && (BOARD[2] == 'x' || BOARD[2] == 'X') && (BOARD[5] == 'x' || BOARD[5] == 'X') && (BOARD[8] == 'x' || BOARD[8] == 'X'))
                || ((BOARD[0] == 'x' || BOARD[0] == 'X') && (BOARD[1] == 'x' || BOARD[1] == 'X') && (BOARD[2] == 'x' || BOARD[2] == 'X') && (BOARD[4] == 'x' || BOARD[4] == 'X') && (BOARD[8] == 'x' || BOARD[8] == 'X'))
                || ((BOARD[0] == 'x' || BOARD[0] == 'X') && (BOARD[1] == 'x' || BOARD[1] == 'X') && (BOARD[2] == 'x' || BOARD[2] == 'X') && (BOARD[4] == 'x' || BOARD[4] == 'X') && (BOARD[6] == 'x' || BOARD[6] == 'X'))
            || ((BOARD[3] == 'x' || BOARD[3] == 'X') && (BOARD[4] == 'x' || BOARD[4] == 'X') && (BOARD[5] == 'x' || BOARD[5] == 'X') && (BOARD[0] == 'x' || BOARD[0] == 'X') && (BOARD[6] == 'x' || BOARD[6] == 'X'))
                || ((BOARD[3] == 'x' || BOARD[3] == 'X') && (BOARD[4] == 'x' || BOARD[4] == 'X') && (BOARD[5] == 'x' || BOARD[5] == 'X') && (BOARD[1] == 'x' || BOARD[1] == 'X') && (BOARD[7] == 'x' || BOARD[7] == 'X'))
                || ((BOARD[3] == 'x' || BOARD[3] == 'X') && (BOARD[4] == 'x' || BOARD[4] == 'X') && (BOARD[5] == 'x' || BOARD[5] == 'X') && (BOARD[2] == 'x' || BOARD[2] == 'X') && (BOARD[8] == 'x' || BOARD[8] == 'X'))
                || ((BOARD[3] == 'x' || BOARD[3] == 'X') && (BOARD[4] == 'x' || BOARD[4] == 'X') && (BOARD[5] == 'x' || BOARD[5] == 'X') && (BOARD[0] == 'x' || BOARD[0] == 'X') && (BOARD[8] == 'x' || BOARD[8] == 'X'))
                || ((BOARD[3] == 'x' || BOARD[3] == 'X') && (BOARD[4] == 'x' || BOARD[4] == 'X') && (BOARD[5] == 'x' || BOARD[5] == 'X') && (BOARD[2] == 'x' || BOARD[2] == 'X') && (BOARD[6] == 'x' || BOARD[6] == 'X'))
            || ((BOARD[6] == 'x' || BOARD[6] == 'X') && (BOARD[7] == 'x' || BOARD[7] == 'X') && (BOARD[8] == 'x' || BOARD[8] == 'X') && (BOARD[0] == 'x' || BOARD[0] == 'X') && (BOARD[3] == 'x' || BOARD[3] == 'X'))
                || ((BOARD[6] == 'x' || BOARD[6] == 'X') && (BOARD[7] == 'x' || BOARD[7] == 'X') && (BOARD[8] == 'x' || BOARD[8] == 'X') && (BOARD[1] == 'x' || BOARD[1] == 'X') && (BOARD[4] == 'x' || BOARD[4] == 'X'))
                || ((BOARD[6] == 'x' || BOARD[6] == 'X') && (BOARD[7] == 'x' || BOARD[7] == 'X') && (BOARD[8] == 'x' || BOARD[8] == 'X') && (BOARD[2] == 'x' || BOARD[2] == 'X') && (BOARD[5] == 'x' || BOARD[5] == 'X'))
                || ((BOARD[6] == 'x' || BOARD[6] == 'X') && (BOARD[7] == 'x' || BOARD[7] == 'X') && (BOARD[8] == 'x' || BOARD[8] == 'X') && (BOARD[0] == 'x' || BOARD[0] == 'X') && (BOARD[4] == 'x' || BOARD[4] == 'X'))
                || ((BOARD[6] == 'x' || BOARD[6] == 'X') && (BOARD[7] == 'x' || BOARD[7] == 'X') && (BOARD[8] == 'x' || BOARD[8] == 'X') && (BOARD[2] == 'x' || BOARD[2] == 'X') && (BOARD[4] == 'x' || BOARD[4] == 'X'))
            || ((BOARD[0] == 'x' || BOARD[0] == 'X') && (BOARD[3] == 'x' || BOARD[3] == 'X') && (BOARD[6] == 'x' || BOARD[6] == 'X') && (BOARD[4] == 'x' || BOARD[4] == 'X') && (BOARD[8] == 'x' || BOARD[8] == 'X'))
                || ((BOARD[0] == 'x' || BOARD[0] == 'X') && (BOARD[3] == 'x' || BOARD[3] == 'X') && (BOARD[6] == 'x' || BOARD[6] == 'X') && (BOARD[2] == 'x' || BOARD[2] == 'X') && (BOARD[4] == 'x' || BOARD[4] == 'X'))
                || ((BOARD[1] == 'x' || BOARD[1] == 'X') && (BOARD[4] == 'x' || BOARD[4] == 'X') && (BOARD[7] == 'x' || BOARD[7] == 'X') && (BOARD[0] == 'x' || BOARD[0] == 'X') && (BOARD[8] == 'x' || BOARD[8] == 'X'))
                || ((BOARD[1] == 'x' || BOARD[1] == 'X') && (BOARD[4] == 'x' || BOARD[4] == 'X') && (BOARD[7] == 'x' || BOARD[7] == 'X') && (BOARD[2] == 'x' || BOARD[2] == 'X') && (BOARD[6] == 'x' || BOARD[6] == 'X'))
                || ((BOARD[2] == 'x' || BOARD[2] == 'X') && (BOARD[5] == 'x' || BOARD[5] == 'X') && (BOARD[8] == 'x' || BOARD[8] == 'X') && (BOARD[0] == 'x' || BOARD[0] == 'X') && (BOARD[4] == 'x' || BOARD[4] == 'X'))
                || ((BOARD[2] == 'x' || BOARD[2] == 'X') && (BOARD[5] == 'x' || BOARD[5] == 'X') && (BOARD[8] == 'x' || BOARD[8] == 'X') && (BOARD[4] == 'x' || BOARD[4] == 'X') && (BOARD[6] == 'x' || BOARD[6] == 'X'))
        )
        {
            return Evaluation.UnreachableState;
        }
        // Check for X win by checking all rows, columns, and diagonals
        if (((BOARD[0] == 'x' || BOARD[0] == 'X') && (BOARD[1] == 'x' || BOARD[1] == 'X') && (BOARD[2] == 'x' || BOARD[2] == 'X'))
                || ((BOARD[3] == 'x' || BOARD[3] == 'X') && (BOARD[4] == 'x' || BOARD[4] == 'X') && (BOARD[5] == 'x' || BOARD[5] == 'X'))
                || ((BOARD[6] == 'x' || BOARD[6] == 'X') && (BOARD[7] == 'x' || BOARD[7] == 'X') && (BOARD[8] == 'x' || BOARD[8] == 'X'))
            || ((BOARD[0] == 'x' || BOARD[0] == 'X') && (BOARD[3] == 'x' || BOARD[3] == 'X') && (BOARD[6] == 'x' || BOARD[6] == 'X'))
                || ((BOARD[1] == 'x' || BOARD[1] == 'X') && (BOARD[4] == 'x' || BOARD[4] == 'X') && (BOARD[7] == 'x' || BOARD[7] == 'X'))
                || ((BOARD[2] == 'x' || BOARD[2] == 'X') && (BOARD[5] == 'x' || BOARD[5] == 'X') && (BOARD[8] == 'x' || BOARD[8] == 'X'))

                || ((BOARD[0] == 'x' || BOARD[0] == 'X') && (BOARD[4] == 'x' || BOARD[4] == 'X') && (BOARD[8] == 'x' || BOARD[8] == 'X'))
                || ((BOARD[2] == 'x' || BOARD[2] == 'X') && (BOARD[4] == 'x' || BOARD[4] == 'X') && (BOARD[6] == 'x' || BOARD[6] == 'X'))
               )
        {
            if (numberX == numberO) {
                return Evaluation.UnreachableState;
            }
            return Evaluation.Xwins;
        }
        // Check for O win by checking all rows, columns, and diagonals
        if (((BOARD[0] == 'o' || BOARD[0] == 'O') && (BOARD[1] == 'o' || BOARD[1] == 'O') && (BOARD[2] == 'o' || BOARD[2] == 'O'))
                || ((BOARD[3] == 'o' || BOARD[3] == 'O') && (BOARD[4] == 'o' || BOARD[4] == 'O') && (BOARD[5] == 'o' || BOARD[5] == 'O'))
                || ((BOARD[6] == 'o' || BOARD[6] == 'O') && (BOARD[7] == 'o' || BOARD[7] == 'O') && (BOARD[8] == 'o' || BOARD[8] == 'O'))
                || ((BOARD[0] == 'o' || BOARD[0] == 'O') && (BOARD[3] == 'o' || BOARD[3] == 'O') && (BOARD[6] == 'o' || BOARD[6] == 'O'))
                || ((BOARD[1] == 'o' || BOARD[1] == 'O') && (BOARD[4] == 'o' || BOARD[4] == 'O') && (BOARD[7] == 'o' || BOARD[7] == 'O'))
                || ((BOARD[2] == 'o' || BOARD[2] == 'O') && (BOARD[5] == 'o' || BOARD[5] == 'O') && (BOARD[8] == 'o' || BOARD[8] == 'O'))

                || ((BOARD[0] == 'o' || BOARD[0] == 'O') && (BOARD[4] == 'o' || BOARD[4] == 'O') && (BOARD[8] == 'o' || BOARD[8] == 'O'))
                || ((BOARD[2] == 'o' || BOARD[2] == 'O') && (BOARD[4] == 'o' || BOARD[4] == 'O') && (BOARD[6] == 'o' || BOARD[6] == 'O'))
        )
        {
            if (numberX == numberO + 1) {
                return Evaluation.UnreachableState;
            }
            return Evaluation.Owins;
        }
    // Else... No Winner
        return Evaluation.NoWinner;
    }

    // 1. Invalid Input: Let X be number of Xs and O be number of Os. If X >= O + 2 or O > X, then the input is invalid.
    // 5. No Winner: The Board is filled up with 5 Xs and 4 Os but there exists no three-in-a-rows.
    // 3. X Wins:
    // 4. O Wins:
    // 2. Unreachable State: If both X and O win, then the state is unreachable. Is that the only Unreachable State?
    // Note: Invalid Inputs eliminate many Unreachable State cases.
    // X can win with the board filled completely.
    // Questions: Are there any Unreachable States where the board is not filled?
    // What are the Boundary Cases?
}
