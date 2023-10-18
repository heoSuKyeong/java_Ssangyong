package hpec;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p1260 {
	
	static int node;
	static int line;
	static int start;
	static int[][] arr;
	static boolean[] check;
	
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		node = Integer.parseInt(st.nextToken());
		line = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());
		arr = new int[node+1][node+1];
		check = new boolean[node+1];
		
		for (int i=0; i<line; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr[x][y] = arr[y][x] = 1;
		}
		
		dfs(start);
		
		check = new boolean[node+1];
		System.out.println();
		
		bfs();
		
	}

	private static void bfs() {
		Queue<Integer> que = new LinkedList<Integer>();
		que.offer(start);
		check[start] = true;
		System.out.print(start + " ");
		
		while(!que.isEmpty()) {
			int temp = que.poll();
			for (int j=1; j<=node; j++) {
				if (arr[temp][j]==1 && check[j]==false) {
					que.offer(j);
					check[j]=true;
					System.out.print(j+" ");
				}
			}
		}
		
	}

	private static void dfs(int i) {
		
		check[i] = true;
		
		System.out.print(i+" ");
		for (int j=1; j<=node; j++) {
			if (arr[i][j] == 1 && check[j]==false) {
				dfs(j);
			}
		}
		
	}

}
