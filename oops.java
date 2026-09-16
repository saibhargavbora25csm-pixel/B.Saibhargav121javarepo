class A
{
	int i;
	int j;
	void A(int k,int l)
	{
		this.i=k;
		this.j=l;
	}
}
class Test
{
	public static void main(String[] args)
	{
		A a = new A();
		a.A(30,20);
		System.out.println(a.i);
	}
}
		