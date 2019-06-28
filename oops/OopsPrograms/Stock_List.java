package OopsPrograms;

import java.util.List;

public class Stock_List 
{
	private List<Stock> stocks;
	
	public long getTotalstockvalue() {
	
		long totstockvalue =0;
		for(int i=0; i<stocks.size();i++) 
		{
			long valueofeachcompanyshare = stocks.get(i).getEachSharePrice()*stocks.get(i).getNoOfShares();
			totstockvalue =totstockvalue+valueofeachcompanyshare;
		}
		return totstockvalue;
		
	}
	
	public List<Stock> getStocks() {
		return stocks;
	}
	
	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}
	
	

}
