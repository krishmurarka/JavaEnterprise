package StringAssignment;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "dfafahfhakhfkahfkahkl";

		x=x.toLowerCase();
		char array[]= x.toCharArray();
		int vowel=0,consonant=0;
		for(char i: array) {
			 if(i >='a' && i<='z') {
				 if(i== 'a' || i=='e' || i=='o' || i=='u' ) {
					 vowel++;
				 }else consonant++;
			 }
		}
		System.out.println("Vowel is : "+ vowel);
		System.out.println("Consonat is : "+ consonant);
	}

}
