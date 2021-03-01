class Innings
{
private String teamname;
private String inningsname;
private int runs;
public String getteamname()
{
return teamname;
}
public String getinningsname()
{
return inningsname;
}
public int getruns()
{
return runs;
}
public void setteamname(String tn)
{
teamname=tn;
}
public void setinningsname(String in)
{
inningsname=in;
}
public void setruns(int rs)
{
runs=rs;
}
public void display()
{
System.out.println("Name:"+getteamname());
System.out.println("Scored:"+getruns());
if(getinningsname().equals("first"))
{
System.out.println("Need "+(runs+1)+" to win");
}
else
{
System.out.println("Match Ended");
}
}
}
   
