package codeforces.round_627;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class D {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int arr[] = new int[N];
		for(int i = 0; i<N; i++)
			arr[i] = Integer.parseInt(st1.nextToken()) - Integer.parseInt(st2.nextToken());
		int cnt = 0;
		for(int i = 0; i<N-1; i++) {
			for(int j = i+1; j<N; j++) {
				if(arr[i] + arr[j] > 0) cnt++;
			}
		}
		bw.write(cnt+"");
		bw.flush();
		bw.close();
		br.close();
	}

}
