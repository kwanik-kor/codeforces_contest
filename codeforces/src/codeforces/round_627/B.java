package codeforces.round_627;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B {
	//주어진 수열의 부분집합 중 팰린드롬인 것의 길이가 3이상인 것이 있는가
	static int arr[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase = Integer.parseInt(br.readLine());
		for(int t = 0; t<testCase; t++) {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr = new int[N];
			for(int i = 0; i<N; i++)
				arr[i] = Integer.parseInt(st.nextToken());
			if(chkPalindrome(0, N-1, 0) >= 3) bw.write("YES\n");
			else bw.write("NO\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	static int chkPalindrome(int left, int right, int cnt) {
		if(left > right) return 0;
		if(left == right) return 1;
		if(arr[left] == arr[right])
			cnt = chkPalindrome(left + 1, right - 1, cnt) + 2;
		else {
			cnt = Math.max(chkPalindrome(left + 1, right, cnt), chkPalindrome(left, right-1, cnt));
		}
		return cnt;
	}
}
