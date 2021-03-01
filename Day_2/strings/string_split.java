import java.util.*;

class string_split{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String First = sc.nextLine();
        String Second = sc.nextLine();
        String [] split_first = First.split(" ");
        String [] split_second = Second.split(" ");

        if(split_first[1].equals(split_second[1]))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}