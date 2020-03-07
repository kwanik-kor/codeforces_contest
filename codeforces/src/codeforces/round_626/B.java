package codeforces.round_626;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B {
	static int N, M, K;
	static int a[], b[];
	
	static int solve() {
		int ans = 0;
		for(int mok = 1; mok<=K; mok++) {
			if(K%mok != 0) continue;
			else if(mok <= N && K/mok <= M) {
				int cnt_a = 0;
				int cnt_b = 0;
				for(int i = 0; i<=N-mok; i++) {
					boolean flag = true;
					for(int j = i; j<i+mok; j++) {
						if(a[j] == 0) {
							flag = false;
							break;
						}
					}
					if(flag) cnt_a++;
				}
				for(int i = 0; i<=M-K/mok; i++) {
					boolean flag = true;
					for(int j = i; j<i + K/mok; j++) {
						if(b[j] == 0) {
							flag = false;
							break;
						}
					}
					if(flag) cnt_b++;
				}
				ans += cnt_a*cnt_b;
			}
		}
		return ans;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		a = new int[N];
		b = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<N; i++)
			a[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<M; i++)
			b[i] = Integer.parseInt(st.nextToken());
		bw.write(solve() + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
