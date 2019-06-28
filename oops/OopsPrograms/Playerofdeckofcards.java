package OopsPrograms;

import LinkedList.Queue;

public class Playerofdeckofcards extends Deckofcards
{

	public static void main(String args[])
	
	{
		Deckofcards dec = new Deckofcards();
		dec.getCards();
		dec.shuffle();
		String [][] player = dec.distribution(4,9 );
		int i =1;
		for(String [] arr :player) {
			System.out.println();
			System.out.println("player"+i+++"cards");
			for(String str : arr) {
				Queue qu = new Queue(); 
				qu.enqueue(str);
				System.out.println(str);
			}
			System.out.println();
		}
		
	}
	
}
