package hpec;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2468 {
	
	static int n;
	static int[][] arr;
	static boolean[][] visited;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,-1,1};
	
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n+1][n+1];
		visited = new boolean[n+1][n+1];
		
		StringTokenizer st;
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<n; j++) {
				int num = Integer.parseInt(st.nextToken());
				if (num>=n) {
					arr[i][j] = num;
				}
			}
		}
		
		int cnt=0;
		for(int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (arr[i][j] >0 ) {
					if (!visited[i][j]) {
						cnt++;
						dfs(i,j);
						
					}
				}
			}
		}
		
		System.out.println(cnt);
		
		
	}


	private static void dfs(int x, int y) {
		
		visited[x][y] = true;
		
		for (int i=0; i<4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			if (nx<n && nx>=0 && ny<n && ny>=0) {
				if (arr[nx][ny]>0 && !visited[nx][ny]) {
					dfs(nx, ny);
				}
			}
		}
		
		
	}

}
