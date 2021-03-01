package com.ltts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class MatchSortMain {

	public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Match1> ai = new  ArrayList<Match1>();
		System.out.println("Enter the number of matches");
		int n = Integer.parseInt(br.readLine());
		int count = 1;
		for(int i = 0; i<n;i++) {
			System.out.println("Enter match date in (dd/mm/yyyy)");
			String date1 = br.readLine();
		   // Date d1=new SimpleDateFormat("dd/MM/yyyy").parse(date1);
			System.out.println("Enter Team 1");
			String team1 = br.readLine();
			System.out.println("Enter Team 2");
			String team2 = br.readLine();
			
			ai.add(new Match1(date1,team1,team2));
		}
		Collections.sort(ai);
		
		System.out.println("Match Details");
		for(Match1 k:ai)
		{
			System.out.println("Team "+count+" "+k.getTeamOne());
			count++;
			System.out.println("Team "+count+" "+k.getTeamTwo());
			System.out.println("Match held date on "+k.getMatchDate());
			count = 1;
		}
	}

}
