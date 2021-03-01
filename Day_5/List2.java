package com.ltts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class List2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		ArrayList<String> li= new ArrayList<String>();
		li.add(br.readLine());
		li.add(br.readLine());
		li.add(br.readLine());
		li.add(br.readLine());
		li.add(br.readLine());
		System.out.println("Enter swap positions");
		int i = Integer.parseInt(br.readLine());
		Collections.swap(li, 0, i);
		for(String s:li) {
			System.out.println(s);
		}
		}

}
