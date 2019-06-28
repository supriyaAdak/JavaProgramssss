package CommercialDataProcessing;

public class Transaction {
	private String emailID;
	private int sharesBuy;
	private String companySymbol;
	private String date;

	
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
	public int getSharesBuy() {
		return sharesBuy;
	}
	public void setSharesBuy(int sharesBuy) {
		this.sharesBuy = sharesBuy;
	}
	public String getCompanySymbol() {
		return companySymbol;
	}
	public void setCompanySymbol(String companySymbol) {
		this.companySymbol = companySymbol;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Transaction [emailID=" + emailID + ", sharesBuy=" + sharesBuy + ", companySymbol=" + companySymbol
				+ ", date=" + date + "]";
	}

}
