package StringPrograms;

public class Unique_Character {
	
	public static Boolean isUnique(String str) {
		int i, j;
		char[] str2 = str.toCharArray();
		for (i = 0; i < str2.length; i++) {
			for (j = i+1; j < str2.length; j++) {
				if (str2[i] == str2[j]) {
				   return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.print("String : ");
		String str = "JAVA CODER";
		System.out.println(str);
	
		System.out.print("Unique Character : " + isUnique(str));
	}

}