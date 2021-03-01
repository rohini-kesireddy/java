package com.ltts;


import java.io.*;
import java.util.*;
import java.lang.*;

public class VehicleMain {
public static void main(String args[])throws Exception
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("1.Four Wheeler");
	System.out.println("2.Two wheeler");
	System.out.println("Enter Vehicle Type: ");
	int n=Integer.parseInt(br.readLine());
	if(n==1)
	{
		System.out.println("Vehicle Make:");
		String make1=br.readLine();
		System.out.println("Vehicle Number:");
		String number1=br.readLine();
		System.out.println("Fuel Type");
		System.out.println("1.Petrol");
		System.out.println("2.Diesel");
		int t1=Integer.parseInt(br.readLine());
		String fuel1="";
		if(t1==1)
		{
			fuel1="Petrol";
		}
		else if(t1==2)
		{
			fuel1="Diesel";
		}
		else
		{
			fuel1="";
		}
		System.out.println("Fuel Capacity:");
		int cap1=Integer.parseInt(br.readLine());
		System.out.println("Engine CC");
		int cc1=Integer.parseInt(br.readLine());
		System.out.println("Kick Start Available [YES/NO]:");
		String s1=br.readLine();
		boolean b1=true;
		if(s1.equalsIgnoreCase("Yes"))
		{
			b1=true;
		}
		else
		{
			b1=false;
		}
		System.out.println("Audio System:");
		String audio=br.readLine();
		
		System.out.println("Number of Doors:");
		int door=Integer.parseInt(br.readLine());
		
		FourWheeler tw1 = new FourWheeler(make1,number1,fuel1, cap1, cc1, audio, door);
		
		tw1.displayMake();
		tw1.displayBasicInfo();
		tw1.displayDetailInfo();
	}
	if(n==2)
	{
		System.out.println("Vehicle Make:");
		String make=br.readLine();
		System.out.println("Vehicle Number:");
		String number=br.readLine();
		System.out.println("Fuel Type");
		System.out.println("1.Petrol");
		System.out.println("2.Diesel");
		int t=Integer.parseInt(br.readLine());
		String fuel="";
		if(t==1)
		{
			fuel="Petrol";
		}
		else if(t==2)
		{
			fuel="Diesel";
		}
		else
		{
			fuel="";
		}
		System.out.println("Fuel Capacity:");
		int cap=Integer.parseInt(br.readLine());
		System.out.println("Engine CC");
		int cc=Integer.parseInt(br.readLine());
		System.out.println("Kick Start Available [YES/NO]:");
		String s=br.readLine();
		boolean b=true;
		if(s.equalsIgnoreCase("Yes"))
		{
			b=true;
		}
		else
		{
			b=false;
		}
		TwoWheeler tw=new TwoWheeler(make,number,fuel,cap,cc,b);
		
		tw.displayMake();
		tw.displayBasicInfo();
		tw.displayDetailInfo();
		
		
		
		
	}
}
}


