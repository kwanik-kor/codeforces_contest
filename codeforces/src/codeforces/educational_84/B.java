package codeforces.educational_84;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B {
	static int n;
	static boolean princess[];
	static boolean prince[];
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase = Integer.parseInt(br.readLine());
		for(int t = 0; t<testCase; t++) {
			n = Integer.parseInt(br.readLine());
			prince = new boolean[n+1];
			princess = new boolean[n+1];
			for(int i = 1; i<=n; i++) {
				st = new StringTokenizer(br.readLine());
				while(st.hasMoreTokens()) {
					int n = Integer.parseInt(st.nextToken());
					if(!prince[n]) {
						princess[i] = true;
						prince[n] = true;
						break;
					}
				}
			}
			for(int i = 1; i<=n; i++) {
				
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
