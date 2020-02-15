import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TorusGOLTester {
    int[][] board = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0}};
    int[][] outcome = {
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0}};

    @Test
    public void testBoard() {
        GameOfLife gol = new GameOfLife(board);
        gol.evolution(1);
        assertArrayEquals(outcome, gol.getBoard());
    }
    @Test
    public void testevolution1() {
        GameOfLife gol = new GameOfLife();
        int[][] A = {
                {1,0},
                {0,1}};
        assertEquals(1,gol.getBoard(A));
    }
    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0},};
        GameOfLife gol = new GameOfLife(board);
        gol.printBoard();
        gol.evolution(1);
        System.out.println();
        gol.printBoard();
    }
}