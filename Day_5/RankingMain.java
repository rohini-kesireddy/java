package com.ltts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class RankingMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please provide the number of players");
		ArrayList<Ranking> ai = new  ArrayList<Ranking>();
		int count =1;
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			System.out.println("Enter the name of the player"+(i+1));
			String name = br.readLine();
			System.out.println(              "Enter the score of the player"+(i+1));
			int Score = Integer.parseInt( br.readLine()) ;
			ai.add(new Ranking(name,Score));
		
		
		}
		Collections.sort(ai);
		System.out.println("Player Details by Score(High to Low)");
		for(Ranking k:ai)
		{
			System.out.println(count+" "+k.getName()+" "+k.getScore());
			count++;
		}
	}

}
