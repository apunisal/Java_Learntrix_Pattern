# Java_Learntrix_Pattern
It contain solution to all the Pattern questions on Learntrix.com 
import java.util.Scanner;
/**
 * 
 * 1	
 * 1	2	
 * 1	2	3	
 * 1	2	3	4	
 * 
 *
 */

public class AscendingUpperK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0, a = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numer of rows : ");
		n = scan.nextInt();
		for (int i = 0; i <= n; i++) {
			a = 0;
			for (int j = 0; j < i; j++) {
				a = a + 1;
				System.out.print(a + "\t");
			}
			System.out.println();
		}

	}

}
