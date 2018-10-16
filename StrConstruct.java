class StrConstruct
{
 public static void main(String arg[])
 {
  String s1=new String();
  byte b[]={65,66,67,68,69,70,51};
  char ch[]={'x','y','z','1','2','3'};
  String s7=new String("HelloRohit");
  String c = "abc".substring(0,3);
  s7=s7.concat("Rohit");
  String s2=new String(b);
  String s3=new String(b,0,3);
  String s4=new String(ch);
  String s5=new String(ch,2,4);
  String s6=new String(s4);
 /* byte b1[]=s6.getBytes();
  for(int i=0;i<=s6.length()-1;i++)
  {
	  System.out.println("Byte "+i+"="+b1[i]);
 }*/
  System.out.println("s1= "+s1+"\ns2= "+s2+"\ns3= "+s3+"\ns4= "+s4+"\ns5="+s5+"\ns6= "+s6+"\ns7= "+s7+"\nc ="+c);
 }
}