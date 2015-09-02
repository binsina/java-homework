package PigDiceGame;
import java.util.Scanner;  

public class DiceGame {
	
	
	

	    public static void main(String[] args) {
	     


	        //variables
	        int dice1;
	        int dice2;
            int dice3;

	        //Call the welcome method
	        welcome();

	        //fetch random numbers


	        /*
	         * **************************************************************
	         *welcome method
	         *welcome user
	         *no parameters
	         *no return
	         ****************************************************************
	         */
	    }
	    public static void welcome() {
	        System.out.println("Welcome to a Lucky (for me) Dice Game! \nFEELING LUCKY?!? Hope you brought lots of CASH!");{
	    }

	    int dice1=(int)(Math.random()*6+1);
	    int dice2=(int)(Math.random()*6+1);
	    int dice3=(int)(Math.random()*6+1);
	    int sum=(dice1 + dice2+dice3);

	    System.out.println("Roll: total = " +sum); 

	    if (sum==2|| sum==3|| sum==12){
	    System.out.println("Sorry with a " + sum + " You LOSE :("); }
	    else if(sum==7 || sum==11) { 
	    System.out.println("Woah!!! With a " + sum + " You WIN!!!!!!!"); } 
	    else{ 
	    if(sum==4 ||sum==5 ||sum==6 ||sum==8 ||sum==9 ||sum==10) 
	    dice1=(int)(Math.random()*6+1);
	    dice2=(int)(Math.random()*6+1);}
	    double roll2= dice1 + dice2;
	    
	    System.out.println("You rolled "+roll2+"  ");

	    while (roll2 !=7){
	    if (roll2 == 100);
	    System.out.println("You Win !");
	    break;
	    

	        }
	    }
	}