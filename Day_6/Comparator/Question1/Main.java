package Comparator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedStream br = new BufferedStream(new InputStreamReader(System.in));

		
		ArrayList<Player> al=new ArrayList<Player>();
		
	System.out.println("Please provide the number of players to be registered");
	int n=Integer.parseInt(br.readLine());
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter the name of the player ");
		String name=br.readLine();
		System.out.println("Enter the skill of the player ");
		System.out.println("1.BATTING");
		System.out.println("2.BOWLING");
		System.out.println("3.ALLROUNDER");
		String skill=br.readLine();
		if(skill.equals("1"))
		{
			skill="Batting";
		}
		else if(skill.equals("2"))
		{
			skill="Bowling";
		}
		else if(skill.equals("3"))
		{
			skill="Allrounder";
		}
		
		
		al.add(new Player(name,skill));
	}
	Collections.sort(al,new Compare());  
	for(Player s:al)
	{
		System.out.println(s);
	}
	}
}
