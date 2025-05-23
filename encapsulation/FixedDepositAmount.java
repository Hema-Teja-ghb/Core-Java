package com.constructors;

import com.sun.tools.javac.launcher.Main;

public class FixedDepositAmount {
	 private String customerName;
	 private double principalAmount;
	 private double interestRate;
	 private int duration ;
	 private double maturityAmount; 
	 
	public FixedDepositAmount(String customerName,double principalAmount,double interestRate,int duration,double maturityAmount)
		{
		this.customerName=customerName;
		this.principalAmount=principalAmount;
		this.interestRate=interestRate;
		this.duration=duration;
		this.maturityAmount=maturityAmount;
		System.out.println("Fixed Deposit Created Successfully");
	}
	//setters
	public void setCustomerName(String customerName) {
		this.customerName=customerName;	
	}
		
	public void setPrincipalAmount(double principalAmount) {
		this.principalAmount=principalAmount;	
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate=interestRate;
	}
	
	public void setDuration(int duration) {
		this.duration=duration;
	}
	public void setMaturityAmount() {
		this.maturityAmount=maturityAmount;
	}
	
	//getters
	public String getCustomerName() {
		return this.customerName;
	}
	public double getPrincipalAmount() {
		return this.principalAmount;
	}
	public double getInterestRate() {
		return this.interestRate;
	}
	public int getDuration() {
		return this.duration;
	}
	public double maturityAmount() {
		return this.maturityAmount;
	}
	public void calculateMaturityAmount() {
		maturityAmount=principalAmount*Math.pow(1 + interestRate/100,duration);
	}
	public void withdrawBeforeMaturity( int months) {
		if (months<=12) {
			System.out.println("Cannot With Drae Before One Year");
		}
		else {
			double remainingAmount=(principalAmount-(principalAmount*2/100));
		System.out.println("remainingAmount"+remainingAmount);
		}	
			
		}
	public static void main(String[] args) {
		FixedDepositAmount obj1 = new FixedDepositAmount("teja,",50000,8,3,0);
		obj1.withdrawBeforeMaturity(14);
	}
			
		
	}
	
	


