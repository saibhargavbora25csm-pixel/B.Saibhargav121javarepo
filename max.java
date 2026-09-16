class Test
{
    public static void main(String[] args)
	{
        int[] numbers = {4, 12, 7, 23, 9};
        int max = numbers[0];
        for (int i = 1; i < 5; i++)
		{
            if (numbers[i] > max)
			{
                max = numbers[i];
            }
        }
        System.out.println("The largest number is: " + max);
    }
}
