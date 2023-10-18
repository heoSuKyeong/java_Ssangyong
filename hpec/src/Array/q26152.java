package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q26152 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] top = new int[n];
		int[] bottom = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			top[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			bottom[i] = Integer.parseInt(st.nextToken());
		}
		
		int birds = Integer.parseInt(br.readLine());
		int[] birdSize = new int[birds];
		int[] score = new int[birds];
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<birds; i++) {
			birdSize[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i=0; i<birds; i++) {
			for (int j=0; j<n; j++) {
				if (birdSize[i]<=(top[j]-bottom[j])) {
					score[i]++;
				} else {
					break;
				}
			}
		}
		
		for (int i : score) {
			System.out.println(i);
		}
		
	}
}
