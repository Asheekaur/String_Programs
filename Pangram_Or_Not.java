package StringPrograms;

public class Pangram_Or_Not {

	public static void main(String[] args) {
		char[] s1 = "THE QUICK BROWN FOX JUMPS OVER LAZY DOGS".replace(" ", "").toCharArray();
		int ar[] = new int[26];
		boolean flag = false;
		for(int i = 0 ; i < s1.length ; i++) {
		       int index = s1[i] - 65 ;
		       ar[index]++;
		}
		
		for(int i = 0 ; i < ar.length ; i++) {
		       if(ar[i] == 0) {
		    	   System.out.println("It's not pangram");
		    	   flag = true;
		       }
		}
		if(flag == false)
		     System.out.print("String is Pangram");
			

	}

}
