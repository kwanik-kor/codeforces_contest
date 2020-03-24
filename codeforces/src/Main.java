import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	static int n, h, l, r;
	static int[] a;
	static int[][] dp;//case + time
	
	public static int solve(int start, int prev) {
		if(start == n) 
			return 0;
		if(dp[start][prev] != -1)
			return dp[start][prev];
		
		int pos1 = (a[start] + prev)%h;
		int ans1 = 0;
		if(pos1 >= l && pos1 <= r) ans1 = 1;
		int first = ans1 + solve(start + 1, pos1);
		
		int pos2 = (a[start] - 1 + h + prev)%h;
		int ans2 = 0;
		if(pos2 >= l && pos2 <= r) ans2 = 1;
		int second = ans2 + solve(start + 1, pos2);
		dp[start][prev] = Math.max(first, second);
		
		return dp[start][prev];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		l = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		a = new int[n];
		dp = new int[n][h];
		for(int i = 0; i<n; i++)
			Arrays.fill(dp[i], -1);
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<n; i++)
			a[i] = Integer.parseInt(st.nextToken());
		bw.write(solve(0, 0) + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
