import java.util.*;
class Inningsmain
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Innings i=new Innings();
System.out.println("Enter the team name:");
String s1=sc.nextLine();
System.out.println("Enter Session:");
String s2=sc.nextLine();
System.out.println("Enter runs:");
int s3=sc.nextInt();
i.setteamname(s1);
i.setinningsname(s2);
i.setruns(s3);
i.display();
sc.close();
}
}