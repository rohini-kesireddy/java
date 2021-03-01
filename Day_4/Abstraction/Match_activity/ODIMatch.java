
public class ODIMatch extends Match {

	@Override
	float calculateRunRate() {
		int remainingRuns = getTarget()-getCurrentscore();
		float reqRunrate = remainingRuns/(50-getCurrentover());
		
		return reqRunrate;
		
	}

	@Override
	int calculateBalls() {
		
		float remainingOvers = 50 - getCurrentover();
		float balls = remainingOvers*6;
		return (int) balls;
	}

	@Override
	void display(double reqRunrate, int balls) {
		int remainingRuns = getTarget()-getCurrentscore();
		System.out.println("Need"+" "+ remainingRuns +" "+"runs in "+balls+" balls");
		System.out.printf("Required Runrate: %.2f",reqRunrate);
		
	}

}
