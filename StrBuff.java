class StrBuff
{
	public static void main(String arg[])
	{
	StringBuffer sb=new StringBuffer();//By default has 16 capacity & changes if str>16
	StringBuffer sb1=new StringBuffer("Hello");//Creates Capacity as per specified string
	//sb1.insert(2,"rr");
	sb1.insert(5,"he");
	sb1.insert(7,12);

	System.out.println("sb1="+sb1+"\nCapacity = "+sb1.capacity());
	System.out.println("sb="+sb+"\nCapacity = "+sb.capacity()+"\nLength= "+sb.length());
	sb.append("Hello freinds");
	sb.append(123);
	System.out.println("Now sb="+sb+"\nCapacity = "+sb.capacity()+"\nLength= "+sb.length());
	sb.reverse();
	System.out.println("sb= "+sb);
	}
}