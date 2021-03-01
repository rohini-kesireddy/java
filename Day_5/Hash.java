package com.ltts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Hash {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> hs = new HashSet<String>();
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			hs.add(br.readLine());
		}
	System.out.println(hs.size());
	}

}
