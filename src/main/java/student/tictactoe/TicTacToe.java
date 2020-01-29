package student.tictactoe;

import student.tictactoe.Evaluation;

public class TicTacToe {
    public static Evaluation evaluateBoard(String boardState) {
        return Evaluation.NoWinner;
    }

    // Invalid Input: Let X be number of Xs and O be number of Os. If X >= O + 2 or O > X, then the input is invalid.
    // No Winner: The Board is filled up with 5 Xs and 4 Os but there exists no three-in-a-rows.
    // X Wins: 
}
