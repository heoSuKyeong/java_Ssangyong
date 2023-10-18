package hpec;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p26146 {
	
	static int node;
	static int line;
	static int[][] arr;
	static boolean[][] visited;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		node = Integer.parseInt(st.nextToken());
		line = Integer.parseInt(st.nextToken());
		
		arr = new int[node+1][node+1];
		visited = new boolean[node][node];
		
		for (int i=0; i<line; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr[x][y] = arr[y][x] = 1;
		}
		
		int num=0;
		for (int i=0; i<node; i++) {
			for (int j=0; j<node; j++) {
				if (arr[i][j]==1 && !visited[i][j]) {
					dfs(i,j);
					if (visited[i][j]) {
						num++;
					}
				}
			}
		}
		
		if (num==node) {
			System.out.println();
		}
		
		
		
	}

	private static void dfs(int x, int y) {
		
		visited[x][y] =true;
		
		for (int i=x; i<node; i++) {
			for (int j=y; j<node; j++) {
				if (arr[i][j] ==1 && !visited[i][j]) {
					dfs(i,j);
				}
			}
		}
		
		
		
	}
}
