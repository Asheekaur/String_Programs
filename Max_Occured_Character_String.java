package StringPrograms;

public class Max_Occured_Character_String {

	public static void main(String[] args) {
		System.out.print("String : ");
		char[] str = "heyyy hereee i am String".replace(" ", "").toCharArray();
		int[] freq = new int[str.length];
		char maxChar = str[0];
		System.out.println(str);
        int max;
        int i , j ;
		for(i = 0 ; i < str.length; i++) {
			freq[i] = 1 ;
			for(j = i + 1 ; j < str.length; j++) {
				if(str[i] == str[j]&& str[i] != ' ' && str[i] != '0') {
						freq[i]++;
						str[j] = '0';
				}
			}
		}
		max = freq[0];
		for(i = 0 ; i < freq.length ; i++) {
			if(max < freq[i]) {
				max = freq[i];
				maxChar = str[i];
			}
		}
		System.out.print(maxChar);
		
	}
}
