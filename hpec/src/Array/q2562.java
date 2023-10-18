package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q2562 {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max=0, index=0;
		
		int[] arr = new int[9];
		for (int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if (arr[i]>max) {
				max = arr[i];
				index = i+1;
			}
			
		}
		
		System.out.println(max);
		System.out.println(index);
		
		br.close();
		
		
	}
}
