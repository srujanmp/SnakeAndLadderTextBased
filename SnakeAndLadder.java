//importing class
import java.util.Scanner;
import java.util.Random;

public class SnakeAndLadder{
	public static void main(String[] args){
		
		//instance creation
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();

		//ladder and snake parameters
		int[][] ladders={{3,50},{10,23},{26,34},{32,76},{45,97}};
		int[][] snakes={{20,9},{35,24},{46,21},{54,13},{69,40},{89,44},{99,2}};

		//initial positions of players
		int player1=0;
		int player2=0;

		//start
		System.out.println("***Enter to play SNAKES AND LADDERS***\n    press enter to play each round");
		System.out.println("*You can change position of ladders & snakes\n  using ladders and snakes arrays in code*");
		sc.nextLine();

		while(player1<100&player2<100){
			//dice roll
			int dice1=rand.nextInt(6)+1;
			player1+=dice1;
			System.out.println("player1 rolled " +dice1+" position: "+player1);
			int dice2=rand.nextInt(6)+1;
			player2+=dice2;
			System.out.println("player2 rolled " +dice2+" position: "+player2);

			//check location for ladders
			for(int i=0;i<ladders.length;i++){
				//player1 check for ladder
				if(player1==ladders[i][0]){
					player1=ladders[i][1];
					System.out.println("player1 got laddered, "+" Position : "+player1);
				}
				//player2 check for ladder
				if(player2==ladders[i][0]){
					player2=ladders[i][1];
					System.out.println("player2 got laddered, "+" Position : "+player2);
				}

			}

			//check location for snakes
			for(int i=0;i<snakes.length;i++){
				//player1 check for snakes
				if(player1==snakes[i][0]){
					player1=snakes[i][1];
					System.out.println("player1 got snaked, "+" Position : "+player1);
				}
				//player2 check for snakes
				if(player2==snakes[i][0]){
					player2=snakes[i][1];
					System.out.println("player2 got snaked, "+" Position : "+player2);
				}
			}
			System.out.println("***********************************");
			sc.nextLine();
		}


		if(player1>player2){
			System.out.println("Player1 won");
		}

		if(player2>player1){
			System.out.println("Player2 won");
		}

	}
}