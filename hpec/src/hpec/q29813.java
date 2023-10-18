package hpec;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class q29813 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//학생 수
		int N = Integer.parseInt(br.readLine());
		
		//학생과 n번째 팀원
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		//학생의 순서를 담는 큐(HashMap에는 순서 개념이 없어 큐로 학생을 순서대로 담는다.)
		Queue<String> que = new LinkedList<String>();
		
		StringTokenizer st;
		
		for (int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			
			map.put(str, num);
			que.add(str);
		}
		
		
		while(que.size()>1) {
			//팀원을 뽑을 학생
			String student = que.poll();
			//그 학생의 n번째 팀원
			int n = map.get(student);
			//n번째 팀원을 찾기 위해 앞사람을 맨 뒤로 보낸다.
			for (int i=0; i<n-1; i++) {
				que.add(que.poll());
			}
			//학생의 n번째 팀원을 찾아 꺼낸다.
			que.poll();
		}
		
		//나머지 김한양의 팀원
		System.out.println(que.poll());
		
	}

}
