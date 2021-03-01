package com.ltts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class List4 {


	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int c =0;
		int c1=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> li = new ArrayList<Integer>();
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			li.add(Integer.parseInt(br.readLine()));
			
		}
		
		for(int j=0;j<n;j++) {
			if(li.get(j)>=50&&li.get(j)<100) {
				c++;	
			}
			if(li.get(j)>=100) {
				c1++;
			}
			
		}
		System.out.println(c+"\n"+ c1);
		//System.out.println(c1);
		
	}

}