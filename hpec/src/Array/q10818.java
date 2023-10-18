package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q10818 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num=0, max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
		for (int i=0; i<n; i++) {
			num = Integer.parseInt(st.nextToken());
			if(max<num) {
				max = num;
			}
			if (min>num) {
				min = num;
			}
		}
		
		System.out.println(min + " " + max);
		br.close();
	}
}
