package day1.week2;

public class Palindrome {
	public static void main(String[] args)
	{
		String test = "testleaf";
		String rev = "";
		for(int i= test.length()-1;i>=0;i--)
		{
			rev += test.charAt(i);
		}
		System.out.println(rev.equals(test)?"yes,palindrome":"No,not a palindrome");
	}

}
