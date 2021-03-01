import java.util.*;
public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details:");
		String S = sc.nextLine();
		String [] splitt = S.split(",");
		Customer c = new Customer();
		
		c.setName(splitt[0]);
		c.setAddress(splitt[1]);
		c.setMobile(splitt[2]);
		
		System.out.println("Name:" +c.getName());
        System.out.println("Address:"+ c.getAddress());
        System.out.println("Mobile:"+c.getMobile());
        sc.close();
		
		
	}

}
