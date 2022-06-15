package reverseTheInteger;

public class StringConcat {

	public static void main(String[] args) {

		int num = 12345;
		
		num = num/10;
		
		System.out.println(num);
		
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		System.out.println(rev);

		String str1 = "Hii, ";

		String str2 = "I am ";
		String str3 = "Mayur";

//	System.out.println(str1.concat(str2).concat(str3));

	}

}
