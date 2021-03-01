import java.util.*;

class Arithmetic{

    int Perform_Arithmetic_Operation(int FN, int SN, int O){
        
        if(FN >= 0 && FN <= 32767)
        {
        	if(SN >= 0 && SN <= 32767)
        	{
        		if(O > 0 && O < 5)
        		{
        			if(O == 1)
        				return FN+SN;
        			else if(O == 2)
        				return FN-SN;
        			else if(O == 3)
        				return FN*SN;
        			else if(O == 4)
        				return FN/SN;
        		}
        		return -1;
        	}
        	return -1;
        }
        return -1;
        
     }

/**
 * @param args
 */
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int First_number = sc.nextInt();
    int Second_number = sc.nextInt();
    int operation = sc.nextInt();

    Arithmetic object = new Arithmetic();

    int return_value = object.Perform_Arithmetic_Operation(First_number, Second_number, operation);

    if(return_value == -1)
    {
        System.out.println("Invalid Input");
    }
    else
    {
        System.out.println(return_value);
    }
    sc.close();
}
}