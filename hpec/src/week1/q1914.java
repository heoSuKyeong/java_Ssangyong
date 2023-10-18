package week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class q1914 {
	
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		BigInteger num = new BigInteger("2");
		sb.append(num.pow(n).subtract(new BigInteger("1")));
		
		if (n<=20) {
			sb.append("\n");
			hanoi(n, 1, 3);
		}
		
		System.out.println(sb);
		
		
	}

	private static void hanoi(int n, int start, int end) {
		
		if (n==0) return;
		
		hanoi(n-1, start, 6-start-end);
		sb.append(start + " " + end + "\n");
		hanoi(n-1, 6-start-end, end);
		
	}
	
}
