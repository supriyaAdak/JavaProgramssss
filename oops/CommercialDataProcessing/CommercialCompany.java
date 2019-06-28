package CommercialDataProcessing;

public class CommercialCompany {
	private String companyName;
	private String symbol;
	private int totalShares;
	private int eachSharePrice;
	private int totalSharePrice;
	
	private String date;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public int getTotalShares() {
		return totalShares;
	}
	public void setTotalShares(int totalShares) {
		this.totalShares = totalShares;
	}
	public int getEachSharePrice() {
		return eachSharePrice;
	}
	public void setEachSharePrice(int eachSharePrice) {
		this.eachSharePrice = eachSharePrice;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public int getTotalSharePrice() {
		return totalSharePrice;
	}
	public void setTotalSharePrice(int totalSharePrice) {
		this.totalSharePrice = totalSharePrice;
	}
	@Override
	public String toString() {
		return "Commercial [companyName=" + companyName + ", symbol=" + symbol + ", totalShares="
				+ totalShares + ", eachSharePrice=" + eachSharePrice + ", totalSharePrice=" + totalSharePrice
				+ ", date=" + date + "]";
	}
	
}
