package StringPrograms;

public class Palindrome_String_Or_Not {

	public static void main(String[] args) {
		System.out.print("String : ");
		String str = "2552";
		System.out.println(str);
		char str2[] = str.toCharArray();
		String ans = "";
		int i;
		for (i = str2.length - 1; i >= 0 ; i--) {
			ans += str2[i];
		}
		System.out.println("Reversed String : " + ans);
		if(str.equals(ans)) {
			System.out.print(str + " is a Palindrome ");
		}
		else {
			System.out.print(str + " is not Palindrome ");
		}
	}

}
