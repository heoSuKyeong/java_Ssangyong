package hpec;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2606 {
	
	static int node;
	static int line;
	static int arr[][];
	static int visited[];
	static int cnt=0;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		node = Integer.parseInt(br.readLine());
		line = Integer.parseInt(br.readLine());
		
		arr = new int[node+1][node+1];
		visited = new int[node+1];
		
		for (int i=0; i<line; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr[x][y] = arr[y][x]= 1;
		}
		System.out.println(dfs(1));
	}

	private static int dfs(int x) {
		
		visited[x] = 1;
		
		for (int i=1; i<=node; i++) {
			if (arr[x][i]==1 && visited[i]==0) {
				cnt++;
				dfs(i);
			}
		
		}
		return cnt;

	}

}
