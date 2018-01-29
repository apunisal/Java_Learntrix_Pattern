# Java_Learntrix_Pattern
It contain solution to all the Pattern questions on Learntrix.com

import java.util.Scanner;
/*
 * 7 6 5 4 3 2 1
 * 7 6 5 4 3 2
 * 7 6 5 4 3
 * 7 6 5 4
 * 7 6 5
 * 7 6
 * 7
 */
public class DecendingFloyad {

	public static void main(String[] args) {
		int n = 0, a = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numer of rows : ");
		n = scan.nextInt();
		for (int i = n; i >= 0; i--) {
			a = n + 1;
			for (int j = i; j > 0; j--) {
				a = a - 1;
				System.out.print(a + "\t");
			}
			System.out.println();
		}
	}

}

