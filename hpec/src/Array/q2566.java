package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2566 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = Integer.MIN_VALUE;
		int x=-1, y=-1, num=0;
		
		for (int i=0; i<9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j=0; j<9; j++) {
				num = Integer.parseInt(st.nextToken());
				if (num>max) {
					max = num;
					x = i+1;
					y = j+1;
				}
			}
		}
		
		System.out.println(max);
		System.out.println(x + " " + y);
		
	}

}
