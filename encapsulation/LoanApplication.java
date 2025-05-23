package com.constructors;

public class LoanApplication {
	private String customerName;
	private double loanAmount;
	private double interestRate;
	private int loanTerm;
	private double outStandingBalance;

	public LoanApplication(String customerName,double loanAmount,double interestRate,int loanTerm,double outStandingBalance) {
	this.customerName=customerName;
	this.loanAmount=loanAmount;
	this.interestRate=interestRate;
	this.loanTerm=loanTerm;
	this.outStandingBalance=outStandingBalance;	
	System.out.println("Loan Applocation submitted");
	}
	//setters
	public void setCustomerName(String customerName) {
		this.customerName=customerName;	
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount=loanAmount;
	}
	public void setInterestName(double interestRate) {
		this.interestRate=interestRate;
	}
	public void setLoanTerm(int longTerm) {
		this.loanTerm=loanTerm;
	}
	public void setOutStandingBalance(double outStandingBalance) {
		this.outStandingBalance=outStandingBalance;	
	}
	//getters
	public String getCustomerName() {
		return customerName;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public int getLoanTerm() {
		return loanTerm;
	}
	public double getOutStandingBalance() {
		return outStandingBalance;
	}
	public void makePayement(double amount) {
	if(amount<=0) {
		System.out.println("Invalid Payment Amount");
	}
	else if(amount>outStandingBalance){
	        System.out.println("Payment exceeds loan balance");
	}
	else { 
		outStandingBalance = outStandingBalance - amount;
		System.out.println("After Paying "+amount+" remainig balance is:"+this.outStandingBalance);
	}
	}
	public double calculateEMI() {
	    double r = interestRate / (12 * 100);
	    int n = loanTerm * 12;
	   return (loanAmount*r*Math.pow(1+r,n))/(Math.pow(1+r, n)-1);
	}
	 public void displayLoanDetails() {
		 System.out.println("Customer Name:"+this.customerName);
		 System.out.println("Total Loan:"+this.loanAmount);
		 System.out.println("Interest Rate:"+this.interestRate);
		 System.out.println("EMI:"+calculateEMI());
		 System.out.println("OutStanding Balance:"+this.outStandingBalance);
	 }
	 public static void main(String[] args) {
		LoanApplication obj1 = new LoanApplication("teja",100000,8,1,100000);
		obj1.displayLoanDetails();
		obj1.makePayement(10000);
		obj1.makePayement(-10000);
		obj1.makePayement(100000);
		obj1.setCustomerName("Jithu");
		obj1.displayLoanDetails();
		
	}
	

	
	}
	
	
	
	
