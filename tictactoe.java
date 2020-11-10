import java.util.*;

public class tictactoe {
//uc1
	
	public static char[] Board() {
		char board[] = new char[10];
		for(int i=1 ; i < board.length ; i++){
			board[i]=' ';
		}
		return board;
	}

//uc2

	public static void symbolAssignment() {
		char Player;
		char Computer;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Choose X or O ");
		char symbol = sc.next().toUpperCase().charAt(0);


			if(symbol == 'X'){

				Player = 'X';
				Computer = 'O';

			}
			else if(symbol == 'O'){
				Computer = 'X';
				Player = 'O';

			}
			else{
				System.out.println("Game Doesnt Support Inputs Expect X and Y");
			}


	}
//uc4
	public static void checkLocation(char[] board) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your loaction required");
		int loc = sc.nextInt();

			if(board[loc] == ' ') {

				System.out.println("Place is available");
			}
			else {
				System.out.println("Place is occupied");
			}


	}


//uc3
	public static void showBoard(char[] board) {
		System.out.println("Show Casing the board");
		for(int i=1;i<board.length;i++){
			if(i == 4 || i == 7){
				System.out.println("|\n");
			}
			System.out.println("|"+board[i]+"");
		}
		System.out.println("|\n\n");

	}




	public static void main(String args[]) {
		Board();
		symbolAssignment();
		showBoard();
		checkLocation();

	}

}
