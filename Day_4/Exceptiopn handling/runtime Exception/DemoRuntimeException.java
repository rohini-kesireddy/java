
public class DemoRuntimeException {

	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(Exception e) {
			System.out.println("NullPointerException");
		}
		finally {
			System.out.println("final block");
		}
		
		/*
		 * int [] arr=new int[2]; arr[3]=30; System.out.println(arr[3]); String
		 * s="roshan"; int i=Integer.parseInt(s); System.out.println(i);
		 
		 */
		
		// TODO Auto-generated method stub

	}

}
