package StringPrograms;

public class Count_Consonants_Vowels_SpecialCharacters {

	public static void main(String[] args) {
		System.out.print("String : ");
		String str = "JavaCoder@123";

		int consonant_count = 0;
		int vowels_count = 0;
		int digit_count = 0;
		int symbol_count = 0;
		System.out.println(str);
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				ch = Character.toLowerCase(ch);

				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					vowels_count++;

				else
					consonant_count++;

			}
			else if (ch >= '0' && ch <= '9')
					digit_count++;
			else
					symbol_count++;
			}
		
		System.out.println("Consonant : " + consonant_count);
		System.out.println("Vowels : " + vowels_count);
		System.out.println("Digit : " + digit_count);
		System.out.print("Symbol : " + symbol_count);

	}

}
