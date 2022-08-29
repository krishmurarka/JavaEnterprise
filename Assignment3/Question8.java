package StringAssignment;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "fdafa@#@!%^&*()";
		int special=0;
		for (int i = 0; i < str.length(); i++)
	    {
	        if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
	           continue;
	        else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
	            continue;
	        else if (str.charAt(i)>= '0' && str.charAt(i)<= '9')
	            continue;
	        else
	            special++;
	    }
		System.out.println(special);
	}

}
