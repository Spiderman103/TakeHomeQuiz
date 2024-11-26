public class Main
{
	public static void main(String[] args)
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		Feature feature = (a,b) ->
		{
			int sum = 0;
			for (int x=a;x<=b;x++)
			{
				sum+=x;
			}
			return sum;
		};
		System.out.println("Sum: "+feature.MainMethod(num1,num2));
	}
}