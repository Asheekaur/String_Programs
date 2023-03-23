package StringPrograms;

public class Anagram_Or_Not {

	public static void main(String[] args) {
		char[] s1 = "race".toCharArray();
		char[] s2 = "care".toCharArray();
			
		boolean flag = true;
		for(int i = 0 ; i < s1.length ; i++) {
			for(int j = 0 ; j < s2.length ; j++) {
				if(s1[i] == s2[j]) {
					flag = true;
					break;
				}
				else
					flag = false;
			}
		}
		
		     System.out.print("String is Anagram : " + flag );
			
	}

}
