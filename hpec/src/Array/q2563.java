package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2563 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[100][100];
		int width=0, height=0;
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			width = Integer.parseInt(st.nextToken());
			height = Integer.parseInt(st.nextToken());
			
			for (int j=0; j<10; j++) {
				for (int k=0; k<10; k++) {
					if (arr[width+j][height+k]<1) {
						arr[width+j][height+k] = 1;
					}
				}
			}
		}
		
		int result = 0;
		for (int i=0; i<100; i++) {
			for (int j=0; j<100; j++) {
				result += arr[i][j];
			}
		}
		
		System.out.println(result);
		
		
	}
}
