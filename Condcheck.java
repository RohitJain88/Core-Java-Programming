class Condcheck
{
	static public void main(String args[])
	{
		int x=45;
		int y=13;
		int z=29;
		int max=(x>y&&x>z)?(x):(y>z?y:z);
		System.out.println("Greater no among"+" "+ x+","+y+","+z+"= "+max);
	}
}