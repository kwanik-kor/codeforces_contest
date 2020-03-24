package codeforces.round_627;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class D {
	static int find(Integer arr[], int t) {
		int l = 0;
		int r = arr.length - 1;
		while(l < r-1) {
			int mid = (l + r - 1)/2;
			if(arr[mid] > t)
				l = mid + 1;
			else
				r = mid;
		}
		if(arr[l] <= t)
			return l;
		else if(arr[r] <= t)
			return r;
		return arr.length;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		Integer arr[] = new Integer[N];
		for(int i = 0; i<N; i++)
			arr[i] = Integer.parseInt(st1.nextToken()) - Integer.parseInt(st2.nextToken());
		long cnt = 0;
		Arrays.sort(arr, Comparator.reverseOrder());
		for(int i = 0; i<N; i++) {
			if(arr[i] <= 0) break;
			cnt += find(arr, -arr[i]) - (i + 1); 
		}
		bw.write(cnt+"");
		bw.flush();
		bw.close();
		br.close();
	}

}
