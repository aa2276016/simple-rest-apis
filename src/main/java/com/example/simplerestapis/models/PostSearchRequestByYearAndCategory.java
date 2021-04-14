package com.example.simplerestapis.models;

public class PostSearchRequestByYearAndCategory {
	private int single_year;
	private String category;
//	private int begin_year;
//	private int end_year;
//	private boolean winner;
	
	public int getSingleYear() {
		return single_year;
	}
	public String getCategory() {
		return category;
	}
//	public int getBeginYear() {
//		return begin_year;
//	}
//	public int getEndYear() {
//		return end_year;
//	}
//	public boolean getWinner() {
//		return winner;
//	}
	
	public void setSingleYear(int single_year) {
		this.single_year = single_year;
	}
	public void setCategory(String category) {
		this.category = category;
	}
//	public void setBeginYear(int begin_year) {
//		this.begin_year = begin_year;
//	}
//	public void setEndYear(int end_year) {
//		this.end_year = end_year;
//	}
//	public void setWinner(boolean winner) {
//		this.winner = winner;
//	}
}