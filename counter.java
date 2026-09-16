class Counter 
{
    static int count = 0;
    int id;
    Counter()
	{
        count++;
        id = count;
    }
    static void showCount() 
	{
        System.out.println("Total objects: " + count);
    }
}
class Test 
{
    public static void main(String[] args) 
	{
        Counter c1 = new Counter();
		Counter c2 = new Counter();
		c1.showCount();
    }
}