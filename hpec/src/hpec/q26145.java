package hpec;

import java.util.Scanner;

public class q26145 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] input = scan.nextLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		
		input = scan.nextLine().split(" ");
		
		int[] list = new int[n+m];
		for (int i=0; i<n; i++) {
			list[i] = Integer.parseInt(input[i]);
		}
		
		for (int i=0; i<n; i++) {
			int sum=0;
			input = scan.nextLine().split(" ");
			for (int j=0; j<n+m; j++) {
				list[j] += Integer.parseInt(input[j]);
				sum += Integer.parseInt(input[j]);
			}
			list[i] -= sum;
		}
		
		for (int i : list) {
			System.out.print(i+" ");
		}
	}
	
}
