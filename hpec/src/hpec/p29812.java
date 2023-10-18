package hpec;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p29812 {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int d = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int cnt=0; //H,Y,U가 아닌 글자의 연속 갯수를 카운팅
		int energy=0; //김한양이 소비한 에너지
		int cntH=0, cntY=0, cntU=0;
		
		for (int i=0; i<n; i++) {
			char c = str.charAt(i);
			
			if (c!='H' && c!='Y' && c!='U') {
				cnt++;
				//H,Y,U로 끝나지 않을 경우
				if (i == n-1) {
					energy += calculate(cnt, d, m);
				}
			} else {
				//H,Y,U가 아닌 글자가 있다면 에너지를 증가해준다.
				if (cnt>0) {
					energy += calculate(cnt, d, m);
				} else if (cnt>0) {
					energy += d;
				}
				//에너지를 추가해줬으므로 해당 글자들은 삭제한다.
				cnt=0;
				
				if (c=='H') {
					cntH++;
				} else if (c=='Y') {
					cntY++;
				} else {
					cntU++;
				}
				
			}
		}
		
		//소비한 에너지가 0이라면 Nalmeok을 출력한다.
		if (energy>0) {
			System.out.println(energy);
		} else {
			System.out.println("Nalmeok");
		}
		
		// H,Y,U 중 최소값을 찾아 최대 조합 가능한 수로 출력한다.
		int min = Math.min(cntY, cntU);
		min = Math.min(cntH, min);
		
		if (min==0) {
			System.out.println("I love HanYang University");
		} else {
			System.out.println(min);
		}
		
	}
	
	//d+m 보다 d 여러번하는게 더 적은 에너지가 드는 경우를 계산하는 함수
	private static int calculate(int cnt, int d, int m) {
		
		if (cnt * d < d+m ) {
			return cnt * d;
		}
		return d+m;
		
	}

}
