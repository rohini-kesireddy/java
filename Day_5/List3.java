package com.ltts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class List3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		ArrayList<String> li= new ArrayList<String>();
		ArrayList<String> li1= new ArrayList<String>();
		System.out.println("Enter the top 5 scores of IPL Season 13");
		li.add(br.readLine());
		li.add(br.readLine());
		li.add(br.readLine());
		li.add(br.readLine());
		li.add(br.readLine());
		System.out.println("Enter the top 5 scores of IPL Season 12");
		li1.add(br.readLine());
		li1.add(br.readLine());
		li1.add(br.readLine());
		li1.add(br.readLine());
		li1.add(br.readLine());
		
		li.retainAll(li1); 
		
		System.out.println("Consistent run scorers");
		
		for(String s:li) {
			System.out.println(s);
		}
	}

}
