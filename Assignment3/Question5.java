package StringAssignment;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans = "dfafaf";
		
		ans = ans.toLowerCase();
		int check[] = new int[26];
		for(int i=0;i<ans.length();i++) {
			 if(ans.charAt(i)==' ')continue;
			 check[ans.charAt(i)-'a']++;
		}
		
		for(int i=0;i<26;i++) {
			if(check[i] >1 ) {
				System.out.print( (char)(i+'a') + " ");
			}
		}
	}

}
