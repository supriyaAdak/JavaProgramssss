package Behavioral;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.Observer;

public class ObserverCricketdata implements ObserverSubject
{
   int runs;
   int wickets;
   float overs;
   ArrayList<Observer> observerList; 
   
   
   public ObserverCricketdata() 
   {
	   observerList = new ArrayList<Observer>();
	   
   }	
	

	
	private int getLatestRuns() 
    { 
       
        return 90; 
    } 
  
    
    private int getLatestWickets() 
    { 
       
        return 2; 
    } 
  
  
    private float getLatestOvers() 
    { 
       
        return (float)10.2; 
    } 
  
	
// This method is used update displays when data changes 

public void dataChanged() 
{ 
    //get latest data 
    runs = getLatestRuns(); 
    wickets = getLatestWickets(); 
    overs = getLatestOvers(); 

    notifyObservers(); 
}


@Override
public void registerObserver(Observer o) {
	
	observerList.add(o); 
}


@Override
public void unregisterObserver(Observer o) {

	 observerList.remove(observerList.indexOf(o));
}



@Override
public void notifyObservers() {

	for (Iterator<Observer> it = 
            observerList.iterator(); it.hasNext();) 
      { 
          Observer o = it.next(); 
          o.update(runs,wickets,overs); 
      } 
}



	

}
