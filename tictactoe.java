import java.util.*;

public class tictactoe {
	public static char[] Board() {
		char[] gameLayout = new char[10];
		for(int i=1 ; i<gameLayout.length ; i++){
			gameLayout[i]=' ';
		}
		return gameLayout;
	}

	public static void symbolAssignment() {
		char Player;
		char Computer;
		Scanner sc = new Scanner(System.in);

		while(True){
			System.out.println(" Choose X or O ");
			char symbol = sc.next().Uppercase().charAt(0);


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


	}


	public static void showBoard() {
		System.out.println("Show Casing the board");
		for(int i=1;i<10;i++){
			if(i == 4 || i == 7){
				System.out.println("|\n");
			}
			System.out.println("|" + gameLayout[i] + "");
		}
		System.out.println("|\n\n");
	
	}

	public static void main(String args[]) {
		Board();
		symbolAssignment();
		showBoard();
	}

}
