package StringAssignment;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans ="dahfla hahdklifh aldhfo ahofhaoh o";
		ans = ans.toLowerCase();
		int check[] = new int[26];
		for(int i=0;i<ans.length();i++) {
			 if(ans.charAt(i)==' ')continue;
			 check[ans.charAt(i)-'a']++;
		}
		
		for(int i=0;i<26;i++) {
			if(check[i] ==0) {
				System.out.println("false");return;
			}
		}
		System.out.println("true");
	}

}
