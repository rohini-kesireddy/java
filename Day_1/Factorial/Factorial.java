import java.util.*;


class Factorial{

    void digit_Factorial(int array_number){
        if (array_number == 0 || array_number == 1)
            System.out.println(1);
        else{
            int fact = 1;
            for(int i = 1; i<=array_number;i++){
                fact = fact * i;
                
            }
            System.out.println(fact);
        }
        
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int len=String.valueOf(number).length();

        int [] array = new int[len];

        Factorial F_number = new Factorial();

        for(int i = 0;i < len; i++){
            int r = number%10;
            array[len-i-1] = r;
            number = number/10;
        }

        for(int i = 0;i<len;i++){
           F_number.digit_Factorial(array[i]);
        }    
        
    }
}
