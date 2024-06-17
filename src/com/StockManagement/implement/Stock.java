package com.StockManagement.implement;
import java.util.Arrays;

public class Stock {
	private String symbol;
	private String company;
	private double pricepershare;
	private int noofshares;
	
	public Stock(String symbol,String company, double pricepershare,int noofshares) {
		super();
		this.symbol = symbol;
		this.company = company;
		this.pricepershare = pricepershare;
		this.noofshares = noofshares;
	}
	//getters and setters

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getPricepershare() {
		return pricepershare;
	}

	public void setPricepershare(double pricepershare) {
		this.pricepershare = pricepershare;
	}

	public int getNoofshares() {
		return noofshares;
	}

	public void setNoofshares(int noofshares) {
		this.noofshares = noofshares;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Stock [symbol=" + symbol + ", companyname=" + company + ", pricePerShare=" + pricepershare + ", numberOfShares=" + noofshares + "]";
    }
	}

	
	
	
