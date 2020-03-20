package codeforces.globalround_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B {
	static int N;
	static int[] b;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		b = new int[N];
		for(int i = 0; i<N; i++) 
			b[i] = Integer.parseInt(st.nextToken());
		int x[] = new int[N];
		int a[] = new int[N];
		x[0] = 0;
		a[0] = b[0];
		int max = 0;
		bw.write(a[0] + " ");
		for(int i = 1; i<N; i++) {
			if(a[i-1] > max) max = a[i-1];
			x[i] = max;
			a[i] = b[i] + x[i];
			bw.write(a[i] + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
