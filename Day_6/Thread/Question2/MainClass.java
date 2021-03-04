package Question2;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Match: ");
		String match = sc.next();
		System.out.println("Enter the Scores: ");
		String score=sc.next();
		System.out.println("Enter match: ");
		String match1 = sc.next();
		System.out.println("Enter Scores: ");
		String score1 = sc.next();
		System.out.println("Enter Match: ");
		String match2 = sc.next();
		System.out.println("Enter Scores: ");
		String score2 = sc.next();
		CalculateClass obj = new CalculateClass(match,score);
		CalculateClass obj1 = new CalculateClass(match1,score1);
		CalculateClass obj2 = new CalculateClass(match2,score2);
		try
		{
		Thread th = new Thread(obj);
		th.start();
		th.join();
		System.out.println();
		
		Thread th1 = new Thread(obj1);
		th1.start();
		th1.join();
		System.out.println();
		
		Thread th2 = new Thread(obj2);
		th2.start();
		th2.join();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		sc.close();
		
		

	}


}
