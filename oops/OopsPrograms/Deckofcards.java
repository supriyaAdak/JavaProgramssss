package OopsPrograms;

import java.util.Random;

public class Deckofcards 
{
	public static String [] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	public static String [] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
	public static String [] cards = new String[52];
	public static void main(String args[]) {
		
		Deckofcards deckofcards = new Deckofcards();
		deckofcards.getCards();
		deckofcards.shuffle();
		String players [][]= distribution(4,9);
		display(players);
		
	}
	public void shuffle()
	{
		Random rand=new Random();
		for(int i=0;i<cards.length;i++)
		{
			int index = rand.nextInt(52);
			String temp=cards[index];
			cards[index] = cards[i];
			cards[i] = temp;
		}
	}
	public String[] getCards()
	{
		int i=0;
		for(String suit:suits)
		{
			for(String card : rank)
			{
				cards[i] = card + "   " + suit;
				i++;
			}
		}
		return cards;
	}
		public static String[][] distribution(int noOfPlayers, int noOfCards)
		{
			String player[][] = new String[noOfPlayers][noOfCards];
			int k=0;
			for(int i=0;i<noOfPlayers;i++)
			{
				for(int j=0;j<noOfCards;j++)
				{
					player[i][j] = cards[k];
					k++;
				}
			}
			return player;
		}
		public static void display(String[][] player)
		{
			int i=1;
			for(String [] arr :player) 
			{
				System.out.print("Player"+i+++"cards");
				System.out.println();
				for(String aray :arr) 
				{
					System.out.print(aray);
					
					
				}
				System.out.println();
			}
		}
	}


