package codeforces.educational_84;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A {
	static int n, k;
	static boolean flag;
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase = Integer.parseInt(br.readLine());
		for(int t = 0; t<testCase; t++) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			flag = false;
			if((long)k*k <= n) {
				if((n%2 == 0 && k%2 == 0) || (n%2 == 1 && k%2 == 1))
					flag = true;
			}
			bw.write(flag? "YES\n" : "NO\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
