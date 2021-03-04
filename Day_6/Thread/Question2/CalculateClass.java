package Question2;
import java.util.ArrayList;
import java.util.Collections;
public class CalculateClass implements Runnable {

	public String matchType;
	public String ScoreString;
	public int sum=0;
	public double meanScore;
	public int minscore;
	public int maxscore;
    
	public CalculateClass(String matchType, String scoreString) {
		super();
		this.matchType = matchType;
		ScoreString = scoreString;
	}
	public String getMatchType() {
		return matchType;
	}
	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}
	public String getScoreString() {
		return ScoreString;
	}
	public void setScoreString(String scoreString) {
		ScoreString = scoreString;
	}
	
	public double getMeanScore() {
		return meanScore;
	}
	public void setMeanScore(double meanScore) {
		this.meanScore = meanScore;
	}
	public int getMinscore() {
		return minscore;
	}
	public void setMinscore(int minscore) {
		this.minscore = minscore;
	}
	public int getMaxscore() {
		return maxscore;
	}
	public void setMaxscore(int maxscore) {
		this.maxscore = maxscore;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Match: "+matchType);
		String arr[] = ScoreString.split(",");
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			al.add(Integer.parseInt(arr[i]));
		}
	    for(int i=0;i<al.size();i++)
	    {
	    	sum = sum+al.get(i);
	    }
	    meanScore = (double)sum/(double)al.size();
	    Collections.sort(al);
		minscore = Collections.min(al);
		maxscore = Collections.max(al);
		
		String strDouble = String.format("%.2f", meanScore);
		System.out.println("Mean Score: "+strDouble);
		System.out.println("Min Score: "+getMinscore());
		System.out.println("Max Score: "+getMaxscore());
	    
	    
		
		
	}
	
}
