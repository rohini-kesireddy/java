import java.util.*;
class LeapYear{
    int check_Leap_Year(int year){
        if(year<0) return -1;    //invalid input
        else if(year%4 == 0)     
        {
            if(year%100 == 0)
            {
                if(year%400 == 0) return 1;
                else return 0;
            }return 1;
        }else return 0;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year : ");
        int year = sc.nextInt(); // User Input 

        LeapYear leap_object = new LeapYear(); //Object Creation
        
        int return_value = leap_object.check_Leap_Year(year); // Function Call 

        switch (return_value) {
            case 1:
                System.out.println("Yes");
                break;
            case 0:
                System.out.println("No");
                break;
            case -1:
                System.out.println("Invalid Input");
                break;
    
        }
        sc.close();
    }

}