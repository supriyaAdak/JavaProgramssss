package Behavioral;

public class AverageScoreDisplay implements Observer 
{
	    private float runRate; 
	    private int predictedScore; 
	@Override
	public void update(int runs, int wickets, float overs) {
		// TODO Auto-generated method stub
		  this.runRate =(float)runs/overs; 
	        this.predictedScore = (int)(this.runRate * 50); 
	        display();
	}
	private void display() {
		// TODO Auto-generated method stub
		 System.out.println("\nAverage Score Display: \n"
                 + "Run Rate: " + runRate + 
                 "\nPredictedScore: " + 
                 predictedScore); 
	}	

}
