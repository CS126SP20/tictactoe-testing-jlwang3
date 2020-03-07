package student.tictactoe;

import student.tictactoe.Evaluation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TicTacToe {

    private static String board;
    private static int boardSize = 3;
    private static int boardLength = 9;

    public static Evaluation evaluateBoard(String boardState) {
        if (boardState.length() != 9) {
            return Evaluation.InvalidInput;
        }

        board = boardState.toUpperCase();

        if (isUnreachableState()) {
            return Evaluation.UnreachableState;
        }
    }

    /**
     * This method checks for three in a row.
     * @return A map of X's and O's.
     */
    private static Map<Character, Integer> threeInARow() {

        Map freqOfXO = new HashMap();

        for (int i = 0; i < boardSize; i++) {
            if (board.charAt(boardSize * i) == 'X' && board.charAt(boardSize * i + 1) == 'X' && board.charAt(boardSize * i + 2) == 'X') {
                freqOfXO.put('X', (int) freqOfXO.get('X') + 1);
            }
            if (board.charAt(boardSize * i) == 'O' && board.charAt(boardSize * i + 1) == 'O' && board.charAt(boardSize * i + 2) == 'O') {
                freqOfXO.put('O', (int) freqOfXO.get('O') + 1);
            }
        }

        for (int i = 0; i < boardSize; i++) {
            if (board.charAt(boardSize * 0 + i) == 'X' && board.charAt(boardSize * 1 + i) == 'X' && board.charAt(boardSize * 2 + i) == 'X') {
                freqOfXO.put('X', (int) freqOfXO.get('X') + 1);
            }
            if (board.charAt(boardSize * 0 + i) == 'O' && board.charAt() == 'O' && board.charAt(boardSize * 2 + i) == 'O') {
                freqOfXO.put('O', (int) freqOfXO.get('O') + 1);
            }
        }

        if ((board.charAt(0) == 'X' && board.charAt(boardLength / 2) == 'X' && board.charAt(boardLength - 1) == 'X')
                || (board.charAt(boardSize - 1) == 'X' && board.charAt(boardLength / 2) == 'X' && board.charAt(boardSize * (boardSize - 1)) == 'X')) {
            freqOfXO.put('X', (int) freqOfXO.get('X') + 1);
        }
        if ((board.charAt(0) == 'O' && board.charAt(boardLength / 2) == 'O' && board.charAt(boardLength - 1) == 'O')
                || (board.charAt(boardSize - 1) == 'O' && board.charAt(boardLength / 2) == 'O' && board.charAt(boardSize * (boardSize - 1)) == 'O')) {
            freqOfXO.put('O', (int) freqOfXO.get('O') + 1);
        }
    }

    /**
     * This method determines whether or not the board is an unreachable state using knowledge of how many X and O's there are.
     * Returns a boolean.
     */
    private static boolean isUnreachableState() {
        //https://stackoverflow.com/questions/3867890/count-character-occurrences-in-a-string-in-c
        int x = 0;
        int o = 0;

        for (int i = 0; i < boardLength; i++) {
            if (board.charAt(i) == 'X') {
                x++;
            }
            if (board.charAt(i) == 'O') {
                o++;
            }
        }

        if (x != o && x != o + 1) {
            return true;
        }
        if (x == o && threeInARow().get('X') > 0) {
            return true;
        }
        if (x == o + 1 && threeInARow().get('O') > 0) {
            return true;
        }
        if (threeInARow().get('X') > 1 || threeInARow().get('O') > 1) {
            return true;
        }
        return false;
    }
}
