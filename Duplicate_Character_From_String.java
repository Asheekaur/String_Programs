package StringPrograms;

public class Duplicate_Character_From_String {
	
	public static void main(String[] args) {
		System.out.print("String : ");
		String str = "Helloo String";
		System.out.println(str);
		char str2[] = str.toCharArray();
		String ans = "";
		int i, j;
		for (i = 0; i < str2.length; i++) {
			for (j = 0; j < i; j++) {
				if (str2[i] == str2[j]) {
					ans += str2[i];
				}
			}
		}
		System.out.print("Duplicate Character : " + ans);
	}

}
