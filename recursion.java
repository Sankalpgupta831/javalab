class recursion
{
void tail(int n)
{
if(n==0)
{
System.out.println(n);
}
else
{
System.out.println(n+" ");
tail(n-1);
}
}
public static void main(String[] arg)
{
recursion r=new recursion();
r.tail(5);
}
}