package codeforces.globalround_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class C {
	static long n, k;
	static long mod = 998244353;
	static long p[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Long.parseLong(st.nextToken());
		k = Long.parseLong(st.nextToken());
		p = new long[(int)n];
		
		long maxVal = n*(n+1)/2 - (n-k)*(n-k+1)/2;
		long ans = 1;
		long cur = 0;
		int flag = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<(int)n; i++) {
			cur++;
			p[i] = Long.parseLong(st.nextToken());
			if(p[i] > n-k) {
				if(flag == 1) ans *= cur;
				else 
					flag = 1;
				ans %= mod;
				cur = 0;
			}
		}
		bw.write(maxVal + " " + ans);
		bw.flush();
		bw.close();
		br.close();
	}

}
