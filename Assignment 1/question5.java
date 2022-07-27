package Assignment1;
import java.util.*;
public class question5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.print('*');
		}
		System.out.println();
		int k = n/2;
		for(int i=k-1;i>=0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print('*');
			}
			if(i!=0)
			System.out.println();
		}
		for(int i=2;i<k;i++) {
			for(int j=0;j<i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		for(int i=0;i<n;i++) {
			System.out.print('*');
		}
		System.out.println();
		
	}

}
