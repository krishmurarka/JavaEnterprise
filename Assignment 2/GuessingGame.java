// Extra Features Added are : 
//1. Added Range in the Number Guessing.
//2. Created a Tournament -> Game will continue till everyone looses or 1 player wins
//3. keeps track of the  Round of the Tournament.
//4. After Each Round  it Shows the people lost and won. (also eliminates the players lost.)
//5. Used an Array for players so that dynamically more players can be added.
package Assignment2;

import java.util.Scanner;

class Guesser{
	int guessNum;
	
	public int guessNumber() {
		Scanner sc = new  Scanner(System.in);
		
		System.out.println("Guesser Kindly Guess the number within the range 1 - 10 ");
		do {
			guessNum = sc.nextInt();
			if(guessNum<1 || guessNum>10) {
				System.out.println("Opps!! Out of Range, Pls Try Again");
			}
		}while(guessNum<1 || guessNum>10);
		
		return guessNum;
	}
}
class Player{
	int guessNum;
	
	public int guessNumber() {
		Scanner sc = new  Scanner(System.in);
		
	
		System.out.println("Player Kindly Guess the number within the range 1 - 10 ");
		do {
			guessNum = sc.nextInt();
			if(guessNum<1 || guessNum>10) {
				System.out.println("Opps!! Out of Range, Pls Try Again");
			}
		}while(guessNum<1 || guessNum>10);
		return guessNum;
	}
}
class Umpire{
	int GuesserNumber;
	int n = 3;
	int PlayerNumber[] = new int[n];
	int playerDefeat[] = new int[n];
	
	Umpire(){
		for(int i=0;i<n;i++) {
			playerDefeat[i] = -1;
		}
	}
	public void collectNumberFromGuesser() {
		 GuesserNumber = new Guesser().guessNumber();
	}
	public void collectNumberFromPlayer() {
		for(int i=0;i<n;i++) {
			if(playerDefeat[i]==-1) {
				PlayerNumber[i] =new Player().guessNumber();
			}
		}
	}
	public int NumberOfPlayersDefeated() {
		 int cnt =0;
		 for(int i=0;i<n;i++){
			 if(playerDefeat[i]==-1 && PlayerNumber[i] != GuesserNumber) {
				 cnt++;
				 playerDefeat[i] = 1;
				 if(cnt ==1) {
					 System.out.println("The Players Defeated in this round are: ");
				 }
				 System.out.println(i+1);
			 }
		 }
		 if(cnt ==0) {
			 System.out.println("No Players lost in this round");
		 }
		 return cnt;
	}
	public int NumberofPlayersWon() {
		int cnt =0;
		 for(int i=0;i<n;i++){
			 if(playerDefeat[i]==-1 && PlayerNumber[i] == GuesserNumber) {
				 cnt++;
				 if(cnt ==1) {
					 System.out.println("The Players Won in this round are: ");
				 }
				 System.out.println(i+1);
			 }
		 }
		 if(cnt ==0) {
			 System.out.println("No Players Won in this round, Game Ended without a Winner :(");
		 }else if(cnt ==1 ) {
			 System.out.println("Congo Winner !! Game Ends Here");
		 }
		 return cnt;
	}
}
class Tournament{
	int rounds;
	Umpire umpire = new Umpire();
	
	public void beginTournament(int roundNo) {
		System.out.println("Starting Round No: "+ roundNo);
		
		umpire.collectNumberFromGuesser();
		umpire.collectNumberFromPlayer();
		
		int lost_count = umpire.NumberOfPlayersDefeated();
		int win_count = umpire.NumberofPlayersWon();
		
		if(win_count ==0 || win_count == 1) {
			return;
		}
		beginTournament(roundNo +1);
	}
}
public class GuessGame {
	
	public static void main(String[] args) {
		Tournament  tournament = new Tournament();
		tournament.beginTournament(1);
		
	}
}
