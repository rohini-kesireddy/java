package com.ltts;

public class Ranking implements Comparable<Ranking>{

	private String name;
	private int score;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public Ranking(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}


	@Override
	public int compareTo(Ranking o) {
		// TODO Auto-generated method stub
		if(score == o.getScore())
			return 0;
		else if(score < o.getScore())
			return 1;
		else 
			return -1;
	}
	
}
