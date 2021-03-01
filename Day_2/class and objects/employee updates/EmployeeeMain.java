import java.util.Scanner;
class EmployeeeMain{
    public static void main(String [] args){
        Employeee em = new Employeee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entet the Name:");
        String name = sc.nextLine();
        System.out.println("Entet the Address:");
        String address = sc.nextLine();
        System.out.println("Entet the Mobile:");
        String mobile = sc.nextLine();

		
		  em.setName(name); em.setAddress(address); em.setMobile(mobile);
	
       while(true)
       {
        System.out.println("Verify and Update the details:");
        System.out.println("Menu");
        System.out.println("1. Update Employee Name");
        System.out.println("2. Update Employee Address");
        System.out.println("3. Update Employee mobile");
        System.out.println("4. All information is correct");
        System.out.println("5. Exit");
       
        int option = sc.nextInt();
        
        switch(option) {
        case 1:
        	System.out.println("enter update name:");
        	String changeName = sc.next();
        	em.setName(changeName);
        	System.out.println(em.getName());
        	break;
        case 2:
        	String changeAddress = sc.next();
        	em.setAddress(changeAddress);
        	break;
        case 3:
        	String changeMobile = sc.next();
        	em.setMobile(changeMobile);
        	break;
        case 4:
        	em.display();
        	break;
        case 5:
        	System.exit(0);
        }
        
    }
      
    }
  }
    