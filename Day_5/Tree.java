package com.ltts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Tree {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		TreeSet<String> ts =new TreeSet<String>();
		int n =Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
		ts.add(br.readLine());
		
		

	}
		for(String s:ts) {
		System.out.println(s);
		}
}
}