package codeforces.educational_84;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B {
	static int n;
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase = Integer.parseInt(br.readLine());
		while(testCase-- > 0) {
			n = Integer.parseInt(br.readLine());
			int a[][] = new int[n][];
			for(int i = 0; i<n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				a[i] = new int[x];
				for(int j = 0; j<x; j++)
					a[i][j] = Integer.parseInt(st.nextToken());
			}
			boolean taken[] = new boolean[n + 1];
			boolean rem[] = new boolean[n + 1];
			for(int i = 0; i<n; i++) {
				int c = 0;
				for(int j = 0; j < a[i].length; j++) {
					if(!taken[a[i][j]]) {
						c = 1;
						taken[a[i][j]] = true;
						break;
					}
				}
				if(c == 0) rem[i] = true;
			}
			boolean flag = false;
			for(int i = 0; i<n; i++) {
				if(rem[i]) {
					for(int j = 1; j<=n; j++) {
						if(!taken[j]) {
							bw.write("IMPROVE\n" + (i + 1) + " " + j + "\n");
							flag = true;
							break;
						}
					}
				}
				if(flag) break;
			}
			if(!flag) bw.write("OPTIMAL\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
