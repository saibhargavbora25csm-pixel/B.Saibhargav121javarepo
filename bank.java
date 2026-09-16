class Bank 
{
    double getRate() 
	{ 
		return 0; 
	}
}
class SBI extends Bank 
{
    double getRate() 
	{ 
		return 7.0; 
	}
}
class HDFC extends Bank 
{
    double getRate() 
	{ 
		return 6.5;
	}
}
class Test
{
	public static void main(String[] args)
    {
		Bank b = new SBI(); 
		System.out.println(b.getRate());
		b = new HDFC();
		System.out.println(b.getRate()); 
    }
}