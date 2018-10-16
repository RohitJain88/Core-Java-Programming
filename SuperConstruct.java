class Abc
{
  int x;
 Abc()
   {
	   System.out.println("In default constructor of super class x= "+x);
   }
   Abc(int y)
      {
		  x=y;
System.out.println("In Parameterized constructor of super class x= "+x);
   }

}
class Xyz extends Abc
{
  int  x=20;
  Xyz()
     {
	//	super();//by default used
  	   System.out.println("In default constructor of sub class x= "+x);

     }
     Xyz(int y)
        {
	super(y);//explicit call to super class parameterized contructor
  		  x=y;
  System.out.println("In Parameterized constructor of sub class x= "+x);
   }
}
class  SuperConstruct
{
public static void main(String arg[])
{
 Xyz  obj1=new Xyz();
 Xyz  obj2=new Xyz(70);
}
}