import java.util.*;
public class CompanyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Compant NAme:");
		String company = sc.nextLine();
		System.out.print("Enter the Employees:");
		String employees = sc.nextLine();
		System.out.print("Enter the Teamlead:");
		String lead = sc.nextLine();
		Company c = new Company();
		c.setName(company);
		c.setEmployees(employees);
	
		
		String [] splitt = employees.split(",");
		
		boolean b = false;
		
		
		for(int i=0;i<splitt.length;i++) {
			if(splitt[i]==lead)
				b = true;
			else 
				b = false;
		}
		
		if(b == true)
		{
			c.setTeamlead(lead);
			System.out.println("Name: "+c.getName());
			System.out.println("Employees: "+c.getEmployees());
			System.out.println("Lead: "+c.getTeamlead());
		}
		else {
		    System.out.println("Invalid Input");
		    System.exit(0);
		}
		
        sc.close();
	}
}
