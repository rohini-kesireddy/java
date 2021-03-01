
import java.io.*;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int totalruns = Integer.parseInt(br.readLine());
			float totalovers = Float.parseFloat(br.readLine());
		
			float runrate = (totalruns/totalovers);
			System.out.printf("%.2f",runrate);
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}

}
