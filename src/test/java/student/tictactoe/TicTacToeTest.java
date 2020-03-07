package student.tictactoe;

import student.tictactoe.TicTacToe;
import student.tictactoe.Evaluation;

import org.junit.Test;
import static org.junit.Assert.*;


public class TicTacToeTest {

    @Test
    public void NoWinnerBoard() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("xxoooxxxo"));
    }

    @Test
    public void NoWinnerBoard1() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("xo......."));
    }

    @Test
    public void XWinsBoard() throws Exception {
        assertEquals(Evaluation.Xwins, TicTacToe.evaluateBoard("xO..xo..x"));
    }

    @Test
    public void XWinsBoard1() throws Exception {
        assertEquals(Evaluation.Xwins, TicTacToe.evaluateBoard("xxxo.o..."));
    }

    @Test
    public void OWinsBoard() throws Exception {
        assertEquals(Evaluation.Owins, TicTacToe.evaluateBoard("XXO.XO.O.."));
    }

    @Test
    public void OWinsBoard1() throws Exception {
        assertEquals(Evaluation.Owins, TicTacToe.evaluateBoard("oOo.x.x.x"));
    }

    @Test
    public void UnreachableBoard() throws Exception {
        assertEquals(Evaluation.UnreachableState, TicTacToe.evaluateBoard("xo..xo.ox"));
    }

    @Test
    public void UnreachableBoard1() throws Exception {
        assertEquals(Evaluation.UnreachableState, TicTacToe.evaluateBoard("xxxoxooox"));
    }

    @Test
    public void UnreachableBoard2() throws Exception {
        assertEquals(Evaluation.UnreachableState, TicTacToe.evaluateBoard("x..x.x.xO"));
    }

    @Test
    public void UnreachableBoard3() throws Exception {
        assertEquals(Evaluation.UnreachableState, TicTacToe.evaluateBoard("xoxxo..ox"));
    }

    @Test
    public void InvalidBoard() throws Exception {
        assertEquals(Evaluation.InvalidInput, TicTacToe.evaluateBoard("XXO.XO.O..-"));
    }
}