public class TorusGameOfLife extends GameOfLife {
    public TorusGameOfLife(int size) {
        super(size);
    }

    public TorusGameOfLife(int[][] board) {
        super(board);
    }

    @Override
    public int neighbors(int r, int c) {
        int[][] board;
        board = super.getBoard();
        int numOfNeighbors = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = 1; j < 2; j++) {
                int w = (i + r + board.length) % board.length;
                int s = (j + c + board.length) % board.length;
                numOfNeighbors += board[w][s];
                if (board[r][c] == 1) {
                    numOfNeighbors--;
                }
            }
        }
        return super.neighbors(r, c);
    }
}
