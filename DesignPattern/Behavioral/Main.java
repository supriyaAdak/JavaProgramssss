package Behavioral;

public class Main {
	
	public static void main(String[] args)
	{
		AverageScoreDisplay averageScoreDisplay =  new AverageScoreDisplay(); 
		Currentscoredisplay currentScoreDisplay = new Currentscoredisplay(); 
                
		ObserverCricketdata cricketdata = new ObserverCricketdata();
		ObserverCricketdata cricket = new ObserverCricketdata();
		cricket.registerObserver(currentScoreDisplay);
		cricket.registerObserver(averageScoreDisplay);
		cricket.dataChanged();
		cricket.unregisterObserver(averageScoreDisplay);
		cricket.dataChanged();
		
	}

}
