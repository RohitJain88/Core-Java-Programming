import java.io.*;
class UserInputBf
{
public static void main(String ar[])throws Exception
{
  InputStreamReader isr=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(isr);
  System.out.println("Enter two nos");
  int a=Integer.parseInt(br.readLine());
  int b=Integer.parseInt(br.readLine());
  int c=a+b;
  System.out.println("Sum of "+a+" and "+b+" = "+c);
}
}