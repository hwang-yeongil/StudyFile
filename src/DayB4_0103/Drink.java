package DayB4_0103;

import java.util.Scanner;

public class Drink {
	public static int n, m;
	public static int[][] graph = new int[1000][1000];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < m; j++) {
				graph[i][j] = str.charAt(j) - '0';
			}
		}

		int result = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (dfs(i, j)) {
					result++;
					System.out.println(result);
				}
			}
		}
	}

	private static boolean dfs(int x, int y) {
		if (x <= -1 || x >= n || y <= -1 || y >= m) {
			return false;
		}
		if (graph[x][y] == 0) {
			graph[x][y] = 1;

			dfs(x - 1, y);
			dfs(x + 1, y);
			dfs(x, y - 1);
			dfs(x, y + 1);
			return true;
		}
		return false;
	}
}

