package codeforces.globalround_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase = Integer.parseInt(br.readLine());
		for(int t = 0; t<testCase; t++) {
			int n = Integer.parseInt(br.readLine());
			if(n == 1) bw.write("-1\n");
			else {
				for(int i = 0; i<n-1; i++)
					bw.write("5");
				bw.write("4\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
