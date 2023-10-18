package hpec;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p2178 {
	
	static int n;
	static int m;
	static int arr[][];
	static boolean visited[][];
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visited = new boolean[n][m];
		
		for (int i=0; i<n; i++) {
			String line = br.readLine();
			for (int j=0; j<m; j++) {
				char ch = line.charAt(j);
				arr[i][j] = Character.getNumericValue(ch);
			}
		}
		
		visited[0][0] = true;
		bfs(0,0);
		
		System.out.println(arr[n-1][m-1]);
		
	}

	private static void bfs(int x, int y) {
		
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x,y});
		
		while(!q.isEmpty()) {
			int now[] = q.poll();
			int nx = now[0];
			int ny = now[1];
			
			for (int i=0; i<4; i++) {
				int netX = nx + dx[i];
				int netY = ny + dy[i];
				
				if (netX<n && netX>=0 && netY<m && netY>=0) {
					if (arr[netX][netY]==1 && !visited[netX][netY]) {
						q.add(new int[] {netX, netY});
						visited[netX][netY] = true;
						arr[netX][netY] = arr[nx][ny] +1;
					}
				}
			}
		}
		
		
		
	}
}
