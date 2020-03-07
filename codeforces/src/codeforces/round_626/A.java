package codeforces.round_626;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class A {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase = Integer.parseInt(br.readLine());
		for(int t = 0; t<testCase; t++) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			ArrayList<Integer> odd = new ArrayList<>();
			ArrayList<Integer> even = new ArrayList<>();
			for(int i = 1; i<=n; i++) {
				int tmp = Integer.parseInt(st.nextToken());
				if(tmp % 2 == 0) {
					even.add(i);
					break;
				}else
					odd.add(i);
			}
			if(even.size() != 0) bw.write(1 + "\n" + even.get(0) + "\n");
			else if(odd.size() <= 1) bw.write(-1 + "\n");
			else {
				bw.write(2 + "\n" + odd.get(0) + " " + odd.get(1) + "\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
