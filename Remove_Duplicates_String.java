package StringPrograms;

public class Remove_Duplicates_String {

	public static void main(String[] args) {
		System.out.print("String : ");
		String str = "Hello Stringg";
		System.out.println(str);
		char str2[] = str.toCharArray();
        String ans = "";
        int i , j ;
		for(i = 0 ; i < str2.length; i++) {
			for(j = 0 ; j < i ; j++) {
				if(str2[i] == str2[j]) {
					break;
				}
			}
			if(i == j) {
				ans += str2[i];
			}
		}
		System.out.print("String after removing Duplicates :" + ans);
	}

}
