package com.daimler.deductibilityofinterestexpenses;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class InterestExpenses implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Deductible")
	private java.lang.Float deductible;
	@org.kie.api.definition.type.Label(value = "Not deductible")
	private java.lang.Float notDeductible;

	public InterestExpenses() {
	}

	public java.lang.Float getDeductible() {
		return this.deductible;
	}

	public void setDeductible(java.lang.Float deductible) {
		this.deductible = deductible;
	}

	public java.lang.Float getNotDeductible() {
		return this.notDeductible;
	}

	public void setNotDeductible(java.lang.Float notDeductible) {
		this.notDeductible = notDeductible;
	}

	public InterestExpenses(java.lang.Float deductible,
			java.lang.Float notDeductible) {
		this.deductible = deductible;
		this.notDeductible = notDeductible;
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
	 return "Deductible: " + ts(deductible) + " Not deductible:" + ts(notDeductible);
	
	}
	

}