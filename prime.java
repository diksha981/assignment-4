package acadview2;

import java.util.Scanner;
public class prime
{
public static void main(String[] args)
{
int n,p;
Scanner scanner=new Scanner(System.in);
System.out.println("enter number: ");
n=scanner.nextInt();
for(int i=2;i<n;i++)
{
p=0;
for(int j=2;j<i;j++)
{
if(i%j==0)
p=1;
}
if(p==0){
System.out.println(i);
}
}
}
}