import java.util.*;
public class GreaterId
{
    static void cricketerId(int a[],int n,int score)
    {
        if(n<0)
        {
            System.out.println("Invalid array size");
        }
        else if(score<0)
            {
                System.out.println("Invalid score");
            }
            else
            {
                for(int j=0;j<n;j++)
                {
                    if(a[j]<0)
                    {
                        System.out.println("Invalid  input");
                        break;
                    }
                    else{
                    if(a[j]>score)
                    {
                      System.out.println(a[j-1]); 
                    }
                    }
                }
            }
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		int score=sc.nextInt();
		cricketerId(a,n,score);
		sc.close();
	}
}

