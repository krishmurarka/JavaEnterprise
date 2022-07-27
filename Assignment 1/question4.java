package Assignment1;
import java.util.*;
public class question4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<n;j++) {
				 
				 if(i>n/2) {
					 System.out.print(' ');
					 continue;
				 }
				 int spaces = (i-1)*2;
				 int left = (n - spaces)/2;
				 if(j<left) {
					 System.out.print('*');
				 }else if(j>= left && j< (left + spaces)) {
					 System.out.print(' ');
				 }else
					 System.out.print('*');
			}
			System.out.println();
		}
	}

}
