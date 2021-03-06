package com.daimler.deductibilityofinterestexpenses;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class FinancialFigures implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Interest Income")
	private java.lang.Float interestIncome;
	@org.kie.api.definition.type.Label("Interest Expenses")
	private java.lang.Float interestExpenses;
	@org.kie.api.definition.type.Label("Profit")
	private java.lang.Float profit;
	@org.kie.api.definition.type.Label("Equity")
	private java.lang.Float equity;
	@org.kie.api.definition.type.Label("Balance Sheet Total")
	private java.lang.Float balanceSheetTotal;

	public FinancialFigures() {
	}

	public java.lang.Float getInterestIncome() {
		return this.interestIncome;
	}

	public void setInterestIncome(java.lang.Float interestIncome) {
		this.interestIncome = interestIncome;
	}

	public java.lang.Float getInterestExpenses() {
		return this.interestExpenses;
	}

	public void setInterestExpenses(java.lang.Float interestExpenses) {
		this.interestExpenses = interestExpenses;
	}

	public java.lang.Float getProfit() {
		return this.profit;
	}

	public void setProfit(java.lang.Float profit) {
		this.profit = profit;
	}

	public java.lang.Float getEquity() {
		return this.equity;
	}

	public void setEquity(java.lang.Float equity) {
		this.equity = equity;
	}

	public java.lang.Float getBalanceSheetTotal() {
		return this.balanceSheetTotal;
	}

	public void setBalanceSheetTotal(java.lang.Float balanceSheetTotal) {
		this.balanceSheetTotal = balanceSheetTotal;
	}

	public FinancialFigures(Float equity, Float balanceSheetTotal) {
		this.equity = equity;
		this.balanceSheetTotal = balanceSheetTotal;
	}

	public FinancialFigures(java.lang.Float interestIncome,
			java.lang.Float interestExpenses, java.lang.Float profit,
			java.lang.Float equity, java.lang.Float balanceSheetTotal) {
		this.interestIncome = interestIncome;
		this.interestExpenses = interestExpenses;
		this.profit = profit;
		this.equity = equity;
		this.balanceSheetTotal = balanceSheetTotal;
	}
	
	protected String ts(Float nb){
	    if(nb>1000000000){
	        return String.format("%.2f", (nb/1000000000)) + "B";
	    }
	    if(nb>1000000){
	        return String.format("%.2f", (nb/1000000)) + "M";
	    }
	    if(nb>1000){
	        return String.format("%.2f", (nb/1000)) + "K";
	    }
	    return String.format("%.2f", nb);
	}
	
	public String toString() {
	    return "Interest Income: " + ts(interestIncome) + "\r\nInterest Expenses: " + ts(interestExpenses) + "\r\nProfit: " + ts(profit) + "\r\nEquity: " + ts(equity) + "\r\nBalance: " + ts(balanceSheetTotal);
	}

}