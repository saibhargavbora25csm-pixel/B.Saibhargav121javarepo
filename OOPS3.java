class A
{
    int i=10;
    int j=20;
    void m1()
    {
	System.out.println("s.c.m");
    }
}
class B extends A
{
    int k=30;
    void m2()
    {
    System.out.println("c.c.m");
    }
}
class Test
{
    public static void main(String[] args)
    {
        B b=new B();
        b.m1();
        b.m2();
        System.out.println(b.i);
        System.out.println(b.j);
        System.out.println(b.k);
    }
}