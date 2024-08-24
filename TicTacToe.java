import java.util.Scanner;
public class TicTacToe {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Play Tic Tac Toe");
		char[][] board = new char[3][3];
		displayBoard(board);
		while (true) {
			makeMove(board, 'X');
			displayBoard(board);
			if (isWon('X', board)) {
				System.out.println("X is the winner!"); System.exit(1);
			}
			else if (isDraw(board)) {
				System.out.println("It is a draw"); System.exit(2);
			}
			makeMove(board, '0');
			displayBoard(board);
			if (isWon('0', board)) {
				System.out.println("0 is the winner!"); System.exit(1);
			}
			else if (isDraw(board)) {
				System.out.println("It is a draw"); System.exit(2);
			}
		}
	}
	
	public static void displayBoard(char[][] b) {
		for(int r = 0; r < b.length; r++) {
			System.out.println("-------------");
			for (int c = 0; c < b.length; c++) {
				System.out.print(b[r][c] == '\u0000' ? "|   " : "| " + b[r][c] + " ");
			}
			System.out.println("|");
		}
		System.out.println("-------------");
	}
	
	public static void makeMove(char[][] b, char p) {
		boolean done = false;
		do {
			System.out.print("\nEnter row, column for Player " + p + ": ");
			int row = input.nextInt();
			int col = input.nextInt();
			if (b[row][col] == '\u0000') {
				b[row][col] = p;
				done = true;
			}
			else {
				System.out.print("The cell is already taken, try a different spot");
			}
		}while (!done);
	}
	
	public static boolean isWon(char p, char[][] b) {
		for (int r = 0; r < b.length; r++) {
			boolean allSame = true;
			for (int c = 0; c < b.length; c++) {
				if (b[r][c] != p) {
					allSame = false;
					break;
				}
			}
			if (allSame) {
				System.out.println("Row " + r + " won by " + p);
				return true;
			}
		}
		boolean allSame = true;
		
		for (int c = 0; c < b.length; c++) {
			for (int r = 0; r < b.length; r++) {
				if (b[r][c] != p) {
					allSame = false;
					break;
				}
			}
		}
		if (allSame) {
			System.out.println("Diag1 won by " + p);
			return true;
		}
		
		allSame = true;
		for (int r = 0; r < b.length; r++) {
			if (b[r][b.length-1-r] != p) {
				allSame = false;
				break;
			}
		}
		if (allSame) {
			System.out.println("Diag2 won by " + p);
			return true;
		}
			
		return false;
	}
	
	public static boolean isDraw(char[][] b) {
		for (int r = 0; r < b.length; r++) {
			for (int c = 0; c < b.length; c++) {
				if (b[r][c] == '\u0000') {
					return false;
				}
			}
		}
		return true;
	}
}