package subsequence;

import java.util.ArrayList;
import java.util.Scanner;

public class lnsubsequence {
	static int incre_subseq(int a[], int l) {
		int r[] = new int[l];
		int j = 0, k;
		for (k = 0; k < l; k++)
			r[k] = 1;
		while (j < l) {
			for (k = 0; k < j; k++)
				if (a[j] > a[k] && r[j] < r[k] + 1)
					r[j] = r[k] + 1;
			j++;
		}
		int m=0;
		while (k < l) {
			if (m < r[k]) {
				m = r[k];
			}
			k++;
		}
		return m;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int l;
		System.out.println("Enter length of an array");
		l = sc.nextInt();
		int[] a = new int[l];
		System.out.println("enter an array of length: " + l);
		for (int i = 0; i < l; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("The length of the longest increasing subsequence is " + incre_subseq(a, l));
	}
}
