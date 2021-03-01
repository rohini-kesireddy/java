import java.util.*;

class StringDemo1{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        s1 = s1.toLowerCase();
        String s3 = s1.substring(0,1);
        s3 = s3.toUpperCase();

        String s4 = s1.substring(1,s1.length());

        s1 = s3.concat(s4);

        s2 = s2.toUpperCase();

        s1 = s1.concat(" ");
        System.out.println(s1.concat(s2));
    }
}