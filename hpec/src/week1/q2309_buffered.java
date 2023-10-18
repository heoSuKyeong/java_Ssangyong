package week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q2309_buffered {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];		//사용자 입력 값 저장
		int sum=0;					//사용자 입력 누적값 저장
		
		for (int i=0; i<arr.length; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = num;
			sum += num;
		}
		
		//9개 더한 값에서 i,j번째를 뺀 값이 100이면 i,j번째 값에 0를 대입한다.
		loop:
		for (int i=0; i<arr.length-1; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if (sum - arr[i] - arr[j] == 100) {
					arr[i]=0;
					arr[j]=0;
					break loop;
				}
			}
		}
		
		Arrays.sort(arr);
		for (int i=2; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
}
