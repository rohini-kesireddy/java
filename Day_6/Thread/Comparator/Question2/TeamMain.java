package Comparator;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeamMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		long numberOfMatches;
		ArrayList<Team> al=new ArrayList<Team>();
		System.out.println("Enter number of teams:");
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter team" +" " + (i+1) +" " + "detail");
			System.out.println("Enter Name");
			name= br.readLine();
			System.out.println("Enter number of matches");
			numberOfMatches= Long.parseLong(br.readLine());
			al.add(new Team(name, numberOfMatches));
			
		}
		Collections.sort(al,new TeamComparator());
		System.out.println("Team list after sort by number of matches \n" ); 
		for(Object s:al)
		{
			System.out.println(s);
		}
		
		
}
}
