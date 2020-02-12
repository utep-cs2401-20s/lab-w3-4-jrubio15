public class GameOfLifeExecute {
    public static void main(String[] args) {
        int[][] board = {{0,0,0}, {1,1,1}, {0,0,0}};
        GameOfLife myGame = new GameOfLife(board);
        myGame.printBoard();
        myGame.oneStep();
        myGame.printBoard();
        myGame.oneStep();
        myGame.printBoard();
        myGame.evolution(5);
        myGame.printBoard();
    }
}
