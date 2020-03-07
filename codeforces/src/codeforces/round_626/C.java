package codeforces.round_626;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class C {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int open = 0;
		int close = 0;
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == '(') open++;
			else close++;
		}
		if(open != close) bw.write("-1");
		else {
			
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
