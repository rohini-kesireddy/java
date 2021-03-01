import java.util.*;
class StringDemo{

    public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      String first = sc.nextLine();
      String second = sc.nextLine();
      String[] first_split = first.split(" ");
      String[] second_split = second.split(" ");
      if(second_split[1].equals(first_split[1])){
          System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
    }
}