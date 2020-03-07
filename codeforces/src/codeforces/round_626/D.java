package codeforces.round_626;

import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class D {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[N];
		for(int i = 0; i<N; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		HashMap<Integer, Integer> set = new HashMap<>();
		for(int i = 0; i<N-1; i++) {
			for(int j = i+1; j<N; j++) {
				int n = arr[i] + arr[j];
				if(set.containsKey(n))
					set.replace(n, set.get(n) + 1);
				else set.put(n, 1);
			}
		}
		List<Integer> keyList = new ArrayList<>(set.keySet());
		int ans = 0;
		if(set.get(keyList.get(0)) % 2 != 0) ans = keyList.get(0);
		for(int i = 1; i<keyList.size(); i++) {
			if(set.get(keyList.get(i)) % 2 != 0)
				ans ^= keyList.get(i);
		}
		bw.write(ans + "");
		bw.flush();
		bw.close();
		br.close();
	}
}
