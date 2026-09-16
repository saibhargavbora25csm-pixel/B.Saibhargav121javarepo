class A
{
	int i;
	int j;
	static A a;
	static A a1;
	static A a2;
	A(int k,int l)
	{
		this.i=k;
		this.j=l;
	}
}
class Test
{
	public static void main(String[] args)
	{
		A.a = new A(10,20);
		A.a1 = new A(30,40);
		A.a2 = new A(50,60);
		System.out.println(A.a.i);
		System.out.println(A.a1.i);
		System.out.println(A.a2.i);
	}
}
		