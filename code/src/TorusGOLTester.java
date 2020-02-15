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
    public void testEvolution1() {
        int[][] A = {
                {0,0,0},
                {0,1,0},
                {0,0,0}};
        int [][] B = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        GameOfLife x = new GameOfLife(A);
        x.evolution(1);
        assertArrayEquals(B,x.getBoard());
    }

    @Test
    public void testEvolution2(){
        int[][] A =
                {{0,0,1},
                 {0,0,0},
                 {0,0,0}};
        int[][] B =
                {{0,0,0},
                 {0,0,0},
                 {0,0,0}};
        GameOfLife z = new GameOfLife(A);
        z.evolution(1);
        assertArrayEquals(B,z.getBoard());
    }

    @Test
    public void testEvolution3(){
        int [][] A =
                {{0,0,0},
                 {0,0,0},
                 {1,0,1}};
        int [][] B =
                {{0,0,0},
                 {0,0,0},
                 {0,0,0}};
        GameOfLife q = new GameOfLife(A);
        q.evolution(1);
        assertArrayEquals(B, q.getBoard());
    }
    @Test
    public void testEvolution4(){
        int [][] A =
                {{1,0,1},
                 {0,0,0},
                 {1,0,1}};
        int [][] B =
                {{0,0,0},
                 {0,0,0},
                 {0,0,0}};
        GameOfLife e = new GameOfLife(A);
        e.evolution(1);
        assertArrayEquals(B,e.getBoard());
    }
    @Test
    public void testEvolution5(){
        int [][] A =
                {{1,0,1},
                 {0,0,0},
                 {0,0,0}};
        int [][] B =
                {{0,0,0},
                 {0,0,0},
                 {0,0,0}};
        GameOfLife r = new GameOfLife(A);
        r.evolution(1);
        assertArrayEquals(B,r.getBoard());

    }
    @Test
    public void testOneStep1(){
        int [][] A =
                        {{0,0,0,1},
                         {1,0,0,0},
                         {0,0,0,0}};
        int [][] B =
                        {{0,0,0},
                        {0,0,0},
                        {0,0,0}};
        GameOfLife n = new GameOfLife(A);
        n.evolution(1);
        assertArrayEquals(B,n.getBoard());
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