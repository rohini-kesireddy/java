import java.util.*;
public class MatchMain {

	public static void main(String[] args) {
		System.out.println("Enter the match format");
		System.out.println("1. Test ");
		System.out.println("2. ODI");
		System.out.println("3. T20");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		switch(option)
		{
		case 1:
			TestMatch t = new TestMatch();
			
			System.out.println("Enter the current score:");
			int testscore = sc.nextInt();
			t.setCurrentscore(testscore);
			
			System.out.println("Enter the current over:");
			int currentover = sc.nextInt();
			t.setCurrentover(currentover);
			
			System.out.println("Enter the Target Score:");
			int targetscore = sc.nextInt();
			t.setTarget(targetscore);
			
			System.out.println("Requirements:");
			int balls = t.calculateBalls();
			float rr = t.calculateRunRate();
			t.display(rr, balls);
			
			break;
		case 2:
			ODIMatch o = new ODIMatch();
			
			System.out.println("Enter the current score:");
			int ODIscore = sc.nextInt();
			o.setCurrentscore(ODIscore);
			
			System.out.println("Enter the current over:");
			int currentover1 = sc.nextInt();
			o.setCurrentover(currentover1);
			
			System.out.println("Enter the Target Score:");
			int targetscore1 = sc.nextInt();
			o.setTarget(targetscore1);
			
			System.out.println("Requirements:");
			int balls1 = o.calculateBalls();
			float rr1 = o.calculateRunRate();
			o.display(rr1, balls1);
			break;
			
		case 3:
			T20Match t20 = new T20Match();
			
			System.out.println("Enter the current score:");
			int T20score = sc.nextInt();
			t20.setCurrentscore(T20score);
			
			System.out.println("Enter the current over:");
			int currentover11 = sc.nextInt();
			t20.setCurrentover(currentover11);
			
			System.out.println("Enter the Target Score:");
			int targetscore11 = sc.nextInt();
			t20.setTarget(targetscore11);
			
			System.out.println("Requirements:");
			int balls11 = t20.calculateBalls();
			float rr11 = t20.calculateRunRate();
			t20.display(rr11, balls11);
			
			break;
		}
		
		
		sc.close();

	}

}
