class StrMethods
{
 public static void main(String arg[])
 {
  String s1=new String("Hello");
  String s2="hello";
  String s3=s2;
  System.out.println("s1= "+s1+"\ns2= "+s2+"\ns3= "+s3);
  System.out.println("s1==s2  is  "+(s1==s2)+"\ns2==s3 is"+(s2==s3));
  System.out.println("s1.equals(s2) is "+s1.equals(s2)+"\ns2.equals(s3) is "+s2.equals(s3));
  System.out.println("s1.equalsToIgnoreCase(s2) is "+s1.equalsIgnoreCase(s2));
  System.out.println("s1.toUppperCase() = "+s1.toUpperCase());
  System.out.println("s1.toLowerCase() = "+s1.toLowerCase());
  int r=s1.compareTo(s2);
  System.out.println("r= "+r);
  if(r==0)
  {
	  System.out.println(s1+" is equals  ="+s2);
  }
  else
    {
  	  System.out.println(s1+" is not equals  ="+s2);
  }
  if(s3.equals(s1))
  {
	  System.out.println(s2+" is equals  ="+s3);
  }
  else
  {
	  System.out.println(s2+" is not equals  ="+s1);
  }
 }
}