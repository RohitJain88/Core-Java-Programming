import  java.util.*;
class UserInput
{
 public static void main(String arg[])
 {
 Scanner sc=new  Scanner(System.in);
   System.out.println("Enter two nos");
   int a=sc.nextInt();
   int b=sc.nextInt();
   int c=a+b;
   System.out.println("sum of "+a+" and "+b+" = "+c);
 }
}