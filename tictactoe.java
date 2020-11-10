public class tictactoe {
	public static char[] Board() {
		char[] gameLayout = new char[10];
		for(int i=0 ; i<gameLayout.length ;i++)
			gameLayout[i]='-';
		return gameLayout;

	}

	public static void main(String[] args) {
		Board();
	}

}
