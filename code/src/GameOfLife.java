public class GameOfLife {
    // Attributes
    private int[][] board;
    private int[][] previous;
    int size;

    // Constructors (you HAVE TO HAVE AT LEAST ONE)
    public GameOfLife() {}

    public GameOfLife(int size) {
        this.size = size;
        board = new int[size][size];
        previous = new int[size][size];
    }

    public GameOfLife(int[][] board) {
        board = new int[board.length][board.length];
        previous = new int[board.length][board.length];
       //this.board = board; // copy board addresses: cheap but dangerous approach
       for (int i=0; i<board.length; i++) {
           for (int j=0; j<board[0].length; i++) {
               this.board[i][j] = board[i][j];
               previous[i][j] = board[i][j];
           }
       }
       size = board.length;
    }

    // Setters
    public void setBoard(int[][] board) {
        board = new int[board.length][board.length];
        previous = new int[board.length][board.length];
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[0].length; j++) {
                this.board[i][j] = board[i][j];
                previous[i][j] = board[i][j];
            }
        }
        size = board.length;
    }

    // Getters
    public int[][] getBoard() {
        // your code goes here
        return board;
    }

    public int getSize() {
        // your code goes here
        return size;
    }

    // Other methods that are relevant to your work with this type
    public void printBoard() {
        // print the content of your board
        // add your code here
    }

    public void oneStep() {
        int neigh;
        for (int i=0; i<size; i++) {
            for (int j = 0; j < size; j++) {
                neigh = neighbors(i,j);
                if (previous[i][j] == 1) {
                    if (neigh == 2 || neigh == 3) board[i][j] = 1;
                    else board[i][j] = 0;
                } else {
                    if (neigh == 3) board[i][j] = 1;
                    else board[i][j] = 0;
                }
            }
        }
        copyToPrevious();
    }

    public int neighbors(int row, int column) {
        // checks the number of neighbors of element at indices row and column in previous
        // returns this number
        return 0;
    }

    public void copyToPrevious() {
        // copies the content of board onto previous
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                previous[i][j] = board[i][j];
        }
    }

    public void evolution(int num) {
        for (int i=0; i<num; i++) {
            oneStep();
        }
    }
}
