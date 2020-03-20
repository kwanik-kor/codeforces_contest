package codeforces.round_627;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B {
	//�־��� ������ �κ����� �� �Ӹ������ ���� ���̰� 3�̻��� ���� �ִ°�
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
			boolean flag = false;
			for(int i = 0; i<N; i++) {
				for(int j = i+2; j<N; j++ ) {
					if(arr[i] == arr[j]) {
						flag = true;
						break;
					}
				}
				
			}
			if(flag) bw.write("YES\n");
			else bw.write("NO\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
