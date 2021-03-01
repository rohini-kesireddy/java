import java.util.*;

class Frequency{

    int findElementCount(int array[],int size,int check_number){
        int count = 0;
        for(int i =0;i<size;i++){
            if(array[i] == check_number)
                count++;
        }
        return count;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number<0){
            System.out.println("Invalid Input");
            System.exit(0); 
        }
        int array[] = new int[number];
        for(int i = 0;i<number;i++){
            array[i] = sc.nextInt();
            if(array[i] < 0)
            {
                System.out.println("Invalid Input");
                System.exit(0); 
            }
        }
        int check_number = sc.nextInt();

        Frequency F = new Frequency();

        int count = F.findElementCount(array, number, check_number);

        System.out.println(count);
        sc.close();
    }
}