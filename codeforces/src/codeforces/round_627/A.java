package codeforces.round_627;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase = Integer.parseInt(br.readLine());
		for(int t = 0; t<testCase; t++) {
			int col = Integer.parseInt(br.readLine());
			int arr[] = new int[col];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i<col; i++)
				arr[i] = Integer.parseInt(st.nextToken());
			
			if(col == 1) bw.write("YES\n");
			else {
				boolean flag = true;
				int nmg = arr[0] % 2;
				for(int i = 1; i<col; i++) {
					if(arr[i]%2 != nmg) {
						flag = false;
						break;
					}
				}
				if(flag) bw.write("YES\n");
				else bw.write("NO\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
