package StringAssignment;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Think Twice");
		
		String arr[] = sb.toString().split(" ");
		
		StringBuilder ans = new StringBuilder();
		
		for(String i: arr) {
			StringBuilder temp = new StringBuilder(i);
			temp.reverse();
			ans.append(temp);
			ans.append(" ");
		}
		System.out.println(ans);
	}

}
