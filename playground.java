package PigDiceGame;
import java.util.Random;
import java.util.Scanner;
public class playground {

	public static void main(String[] args) {
		
	
	
		  
		
		   
		
		      Scanner kb = new Scanner(System.in);
		
		   Random rand = new Random();
		
		      int dice, humanTotal, computerScore, turnScore, computerTurn;
		
		     String input;
		
		      char choice;
		
		      boolean computer, human , game;
		
		 
		
		      System.out.println("Welcome to the game of Pig!");
		
		      humanTotal = 0;
		
		      turnScore = 0;
		
		      computerScore = 0;
		
		      computerTurn = 0;
		
		      game = false;
		
		      human = false;
		
		      computer = false;
		
		
		
		     while(game = false);
		
		      {
		
		        while(human = false);
		
		        {
		
		         do
		
		         { 
		
		            dice = rand.nextInt(6) +1;
	
		            System.out.println("You rolled: " + dice);
		
		            if (dice == 1)                             
		
		            {
		
		                turnScore = 0;
		
		                humanTotal += turnScore;
		
		                System.out.println("You lose your turn! Your total is " +
		
		                                    humanTotal);
		
		                human = true;
		
		                computer = false;
		
		            }
		
		            else
	
		            {
		
		               turnScore += dice;
		
		               System.out.println("Your turn score is " + turnScore +      
	
		                                  " and your total score is " +
		
		                                   humanTotal + ".");
	
		               humanTotal += turnScore;
	
		               System.out.println("If you hold, you will have " + humanTotal +
	
		                                  " points.");
		
		               System.out.println("Enter \'r\' to roll again, \'h\' to hold.");
		
		               input = kb.nextLine();
		
		               choice = input.charAt(0);
		
		               if (choice == 'h')
	
		               {
	
		                   System.out.println("Your score is " + humanTotal + "\n");
	
		                   human = true;
	
		                   computer = false;
		
		               }
		
		               if (choice == 'r')
		
		               {
	
		                  human = false;
	
		                  game = false;
		
		               }
		
		            }
		
		         } while (human = false);
		
		              humanTotal += turnScore;
		
		         if (humanTotal >= 100)
		
		         {
		
		            System.out.println("YOU WIN!");
		
		            game = true;
		
		         }
		
		        }
		
		        whwhile(computer = false);
		
		        {
		
		         do
		
		         {
		
		            dice = rand.nextInt(6) +1;
	
		            System.out.println("The computer rolled: " + dice);
	
		            if (dice == 1)
		
		            {
		
		               System.out.println("The computer lost its turn! Computer" +
		
		                                  " total is " + computerScore);
		
		               computer = true;
		
		               human = false;
		
		            }
	
		            else
		
		            {
		
		               computerTurn += dice;
	
		               if (computerTurn >= 20 || computerScore >= 100)
		
		               {
	
		                  System.out.println("The computer holds");
		
		                  computer = true;
		
		                  human = false;
	
		               }
		
		            }
		
		         } while (computer = false);
		
		              computerScore += computerTurn;
		
		         if (computerScore >= 100)
		
		         {
		
		            System.out.println("THE COMPUTER WINS!");
	
		            game = true;
		
		         }
		
		        }
		
		      }      
		
		   }

	private static void whwhile(boolean b) {
		// TODO Auto-generated method stub
		
	}
		
		


	}


