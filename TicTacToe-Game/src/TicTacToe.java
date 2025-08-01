
public class TicTacToe {
    private char[][] board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public TicTacToe(Player p1, Player p2) {
        this.board = new char[3][3];
        this.player1 = p1;
        this.player2 = p2;
        this.currentPlayer = p1;
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = '-';
    }

    public void printBoard() {
        System.out.println("Current Board:");
        for (char[] row : board) {
            for (char cell : row)
                System.out.print(cell + " ");
            System.out.println();
        }
    }

    public boolean playTurn(int row, int col) {
        if (isValidMove(row, col)) {
            board[row][col] = currentPlayer.getSymbol();
            return true;
        } else {
            System.out.println("Invalid move, try again.");
            return false;
        }
    }

    private boolean isValidMove(int row, int col) {
        return (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-');
    }

    public boolean checkWinner() {
        char sym = currentPlayer.getSymbol();
        // Rows, Columns, Diagonals
        for (int i = 0; i < 3; i++)
            if (board[i][0] == sym && board[i][1] == sym && board[i][2] == sym) return true;

        for (int i = 0; i < 3; i++)
            if (board[0][i] == sym && board[1][i] == sym && board[2][i] == sym) return true;

        if (board[0][0] == sym && board[1][1] == sym && board[2][2] == sym) return true;
        if (board[0][2] == sym && board[1][1] == sym && board[2][0] == sym) return true;

        return false;
    }

    public boolean isDraw() {
        for (char[] row : board)
            for (char cell : row)
                if (cell == '-') return false;
        return true;
    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }
}