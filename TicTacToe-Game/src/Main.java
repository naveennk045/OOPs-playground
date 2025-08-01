import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Player 1 name:");
        String name1 = sc.nextLine();
        System.out.println("Enter Player 2 name:");
        String name2 = sc.nextLine();

        Player p1 = new Player(name1, 'X');
        Player p2 = new Player(name2, 'O');

        TicTacToe game = new TicTacToe(p1, p2);

        while (true) {
            game.printBoard();
            System.out.println(game.getCurrentPlayer().getName() + "'s turn. Enter row and column (0-2): ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if (game.playTurn(row, col)) {
                if (game.checkWinner()) {
                    game.printBoard();
                    System.out.println(game.getCurrentPlayer().getName() + " wins!");
                    break;
                } else if (game.isDraw()) {
                    game.printBoard();
                    System.out.println("It's a draw!");
                    break;
                } else {
                    game.switchPlayer();
                }
            }
        }

        sc.close();
    }
}