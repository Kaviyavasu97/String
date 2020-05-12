package day1.week2;

public class Occurence {
	public static void main(String[] args)
	{
		String str = "you have no choice other than following me";
		int c = 0;
		char[] array = str.toCharArray();
		for(int i=0;i<=array.length-1;i++)
		{
			if(array[i]=='o')
			{
				c=c+1;
			}
		}
		System.out.println(c);
	}

}
