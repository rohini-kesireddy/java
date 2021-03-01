package com.ltts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class List1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> li=new ArrayList<String>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the player details");
		System.out.println("Enter player name");
		li.add(br.readLine());
		System.out.println("Enter age");
		li.add(br.readLine());
		System.out.println("Enter country");
		li.add(br.readLine());
		System.out.println("player Details");
		
		for(String s:li)
		{
			System.out.println(s);
		}
		System.out.println("Enter Skill");
		String s = br.readLine();
		System.out.println("Enter the position to add the skill");
		int i = Integer.parseInt(br.readLine());
		li.set(i,s);
		for(String s1:li)
		{
			System.out.println(s1);
		}
		
		System.out.println("Enter the position of the detail to be removed");
		int j = Integer.parseInt(br.readLine());
		li.remove(j);
		System.out.println("player Details");
		for(String s1:li) {
			System.out.println(s1);
		}
	}

}
