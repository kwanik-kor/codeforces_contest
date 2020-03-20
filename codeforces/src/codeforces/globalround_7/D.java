package codeforces.globalround_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class D {
	
	static void solve(String str) {
		int maxLen = 1;
		int left = 0;
		while(true) {
			char c = str.charAt(left);
			if(left == str.lastIndexOf(c))
				break;
			
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase = Integer.parseInt(br.readLine());
		for(int t = 0; t<testCase; t++) 
			solve(br.readLine());
	}

}
